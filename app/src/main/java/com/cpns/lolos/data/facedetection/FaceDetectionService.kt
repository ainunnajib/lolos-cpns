package com.cpns.lolos.data.facedetection

import android.content.Context
import android.graphics.Bitmap
import android.util.Log
import com.google.mediapipe.framework.image.BitmapImageBuilder
import com.google.mediapipe.tasks.core.BaseOptions
import com.google.mediapipe.tasks.core.Delegate
import com.google.mediapipe.tasks.vision.core.RunningMode
import com.google.mediapipe.tasks.vision.facedetector.FaceDetector
import com.google.mediapipe.tasks.vision.facedetector.FaceDetectorResult
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Result of face detection analysis
 */
data class FaceDetectionResult(
    val faceCount: Int,
    val hasFace: Boolean,
    val confidence: Float,
    val status: FaceStatus,
    val timestamp: Long = System.currentTimeMillis()
)

/**
 * Status of face detection for proctoring
 */
enum class FaceStatus {
    NO_FACE,           // No face detected - suspicious
    SINGLE_FACE,       // One face detected - normal
    MULTIPLE_FACES,    // Multiple faces detected - suspicious
    FACE_NOT_CENTERED, // Face detected but not centered
    INITIALIZING,      // Detector is initializing
    ERROR              // Detection error
}

/**
 * Service for real-time face detection using MediaPipe
 */
@Singleton
class FaceDetectionService @Inject constructor(
    @ApplicationContext private val context: Context
) {
    companion object {
        private const val TAG = "FaceDetectionService"
        private const val MODEL_NAME = "face_detection_short_range.tflite"
        private const val MIN_DETECTION_CONFIDENCE = 0.5f
    }

    private var faceDetector: FaceDetector? = null
    private var isInitialized = false

    private val _detectionState = MutableStateFlow(
        FaceDetectionResult(
            faceCount = 0,
            hasFace = false,
            confidence = 0f,
            status = FaceStatus.INITIALIZING
        )
    )
    val detectionState: StateFlow<FaceDetectionResult> = _detectionState.asStateFlow()

    private val _isRunning = MutableStateFlow(false)
    val isRunning: StateFlow<Boolean> = _isRunning.asStateFlow()

    /**
     * Initialize the face detector
     */
    fun initialize(): Boolean {
        if (isInitialized) return true

        return try {
            val baseOptions = BaseOptions.builder()
                .setDelegate(Delegate.CPU)
                .setModelAssetPath(MODEL_NAME)
                .build()

            val options = FaceDetector.FaceDetectorOptions.builder()
                .setBaseOptions(baseOptions)
                .setMinDetectionConfidence(MIN_DETECTION_CONFIDENCE)
                .setRunningMode(RunningMode.IMAGE)
                .build()

            faceDetector = FaceDetector.createFromOptions(context, options)
            isInitialized = true
            Log.d(TAG, "Face detector initialized successfully")
            true
        } catch (e: Exception) {
            Log.e(TAG, "Failed to initialize face detector", e)
            _detectionState.value = FaceDetectionResult(
                faceCount = 0,
                hasFace = false,
                confidence = 0f,
                status = FaceStatus.ERROR
            )
            false
        }
    }

    /**
     * Process a bitmap frame for face detection
     */
    fun detectFaces(bitmap: Bitmap): FaceDetectionResult {
        if (!isInitialized || faceDetector == null) {
            return FaceDetectionResult(
                faceCount = 0,
                hasFace = false,
                confidence = 0f,
                status = FaceStatus.INITIALIZING
            )
        }

        return try {
            val mpImage = BitmapImageBuilder(bitmap).build()
            val result: FaceDetectorResult = faceDetector!!.detect(mpImage)

            val faceCount = result.detections().size
            val status = when {
                faceCount == 0 -> FaceStatus.NO_FACE
                faceCount == 1 -> FaceStatus.SINGLE_FACE
                else -> FaceStatus.MULTIPLE_FACES
            }

            val confidence = if (faceCount > 0) {
                result.detections().first().categories().firstOrNull()?.score() ?: 0f
            } else {
                0f
            }

            val detectionResult = FaceDetectionResult(
                faceCount = faceCount,
                hasFace = faceCount > 0,
                confidence = confidence,
                status = status
            )

            _detectionState.value = detectionResult
            detectionResult
        } catch (e: Exception) {
            Log.e(TAG, "Face detection failed", e)
            FaceDetectionResult(
                faceCount = 0,
                hasFace = false,
                confidence = 0f,
                status = FaceStatus.ERROR
            )
        }
    }

    /**
     * Start the face detection service
     */
    fun start() {
        if (!isInitialized) {
            initialize()
        }
        _isRunning.value = true
        Log.d(TAG, "Face detection started")
    }

    /**
     * Stop the face detection service
     */
    fun stop() {
        _isRunning.value = false
        Log.d(TAG, "Face detection stopped")
    }

    /**
     * Release resources
     */
    fun release() {
        stop()
        faceDetector?.close()
        faceDetector = null
        isInitialized = false
        Log.d(TAG, "Face detector released")
    }
}
