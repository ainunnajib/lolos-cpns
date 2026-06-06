package com.cpns.lolos.presentation.components

import android.graphics.Bitmap
import android.util.Log
import android.view.ViewGroup
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageProxy
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import com.cpns.lolos.data.facedetection.FaceDetectionResult
import com.cpns.lolos.data.facedetection.FaceStatus
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

/**
 * Camera preview with face detection overlay for exam proctoring
 *
 * @param modifier Modifier for the composable
 * @param onFaceDetected Callback when face detection result changes
 * @param isEnabled Whether the camera is enabled
 * @param showOverlay Whether to show the detection status overlay
 */
@Composable
fun CameraPreviewWithFaceDetection(
    modifier: Modifier = Modifier,
    onFaceDetected: (Bitmap) -> Unit = {},
    isEnabled: Boolean = true,
    showOverlay: Boolean = true,
    faceDetectionResult: FaceDetectionResult? = null
) {
    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current

    var cameraProvider by remember { mutableStateOf<ProcessCameraProvider?>(null) }
    val cameraExecutor: ExecutorService = remember { Executors.newSingleThreadExecutor() }

    DisposableEffect(Unit) {
        onDispose {
            cameraExecutor.shutdown()
            cameraProvider?.unbindAll()
        }
    }

    if (!isEnabled) {
        CameraDisabledPlaceholder(modifier)
        return
    }

    Box(modifier = modifier) {
        AndroidView(
            factory = { ctx ->
                PreviewView(ctx).apply {
                    layoutParams = ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT
                    )
                    scaleType = PreviewView.ScaleType.FILL_CENTER
                    implementationMode = PreviewView.ImplementationMode.COMPATIBLE
                }
            },
            modifier = Modifier.fillMaxSize(),
            update = { previewView ->
                val cameraProviderFuture = ProcessCameraProvider.getInstance(context)

                cameraProviderFuture.addListener({
                    cameraProvider = cameraProviderFuture.get()

                    val preview = Preview.Builder()
                        .build()
                        .also {
                            it.surfaceProvider = previewView.surfaceProvider
                        }

                    val imageAnalyzer = ImageAnalysis.Builder()
                        .setBackpressureStrategy(ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST)
                        .build()
                        .also { analysis ->
                            analysis.setAnalyzer(cameraExecutor) { imageProxy ->
                                processImage(imageProxy, onFaceDetected)
                            }
                        }

                    val cameraSelector = CameraSelector.Builder()
                        .requireLensFacing(CameraSelector.LENS_FACING_FRONT)
                        .build()

                    try {
                        cameraProvider?.unbindAll()
                        cameraProvider?.bindToLifecycle(
                            lifecycleOwner,
                            cameraSelector,
                            preview,
                            imageAnalyzer
                        )
                    } catch (e: Exception) {
                        Log.e("CameraPreview", "Use case binding failed", e)
                    }
                }, ContextCompat.getMainExecutor(context))
            }
        )

        // Detection status overlay
        if (showOverlay && faceDetectionResult != null) {
            FaceDetectionOverlay(
                result = faceDetectionResult,
                modifier = Modifier.align(Alignment.TopEnd)
            )
        }
    }
}

/**
 * Process camera frame for face detection
 */
private fun processImage(imageProxy: ImageProxy, onFaceDetected: (Bitmap) -> Unit) {
    try {
        val bitmap = imageProxy.toBitmap()
        onFaceDetected(bitmap)
    } catch (e: Exception) {
        Log.e("CameraPreview", "Failed to process image", e)
    } finally {
        imageProxy.close()
    }
}

/**
 * Overlay showing face detection status
 */
@Composable
fun FaceDetectionOverlay(
    result: FaceDetectionResult,
    modifier: Modifier = Modifier
) {
    val (backgroundColor, icon, statusText) = when (result.status) {
        FaceStatus.SINGLE_FACE -> Triple(
            Color(0xFF4CAF50).copy(alpha = 0.8f),
            Icons.Default.Face,
            "Terdeteksi"
        )
        FaceStatus.NO_FACE -> Triple(
            Color(0xFFF44336).copy(alpha = 0.8f),
            Icons.Default.Warning,
            "Tidak ada wajah"
        )
        FaceStatus.MULTIPLE_FACES -> Triple(
            Color(0xFFFF9800).copy(alpha = 0.8f),
            Icons.Default.Warning,
            "Banyak wajah"
        )
        FaceStatus.INITIALIZING -> Triple(
            Color(0xFF9E9E9E).copy(alpha = 0.8f),
            Icons.Default.Face,
            "Memuat..."
        )
        else -> Triple(
            Color(0xFF9E9E9E).copy(alpha = 0.8f),
            Icons.Default.Warning,
            "Error"
        )
    }

    Surface(
        modifier = modifier
            .padding(8.dp),
        shape = RoundedCornerShape(16.dp),
        color = backgroundColor
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                modifier = Modifier.size(16.dp),
                tint = Color.White
            )
            Text(
                text = statusText,
                style = MaterialTheme.typography.labelSmall,
                color = Color.White
            )
        }
    }
}

/**
 * Placeholder when camera is disabled
 */
@Composable
fun CameraDisabledPlaceholder(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .background(MaterialTheme.colorScheme.surfaceVariant),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Face,
                contentDescription = null,
                modifier = Modifier.size(48.dp),
                tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f)
            )
            Text(
                text = "Kamera Nonaktif",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f)
            )
        }
    }
}

/**
 * Compact camera preview for quiz screen corner
 */
@Composable
fun CompactCameraPreview(
    modifier: Modifier = Modifier,
    onFaceDetected: (Bitmap) -> Unit = {},
    isEnabled: Boolean = true,
    faceDetectionResult: FaceDetectionResult? = null
) {
    val borderColor = when (faceDetectionResult?.status) {
        FaceStatus.SINGLE_FACE -> Color(0xFF4CAF50)
        FaceStatus.NO_FACE -> Color(0xFFF44336)
        FaceStatus.MULTIPLE_FACES -> Color(0xFFFF9800)
        else -> MaterialTheme.colorScheme.outline
    }

    Box(
        modifier = modifier
            .size(100.dp)
            .clip(RoundedCornerShape(12.dp))
            .border(3.dp, borderColor, RoundedCornerShape(12.dp))
    ) {
        CameraPreviewWithFaceDetection(
            modifier = Modifier.fillMaxSize(),
            onFaceDetected = onFaceDetected,
            isEnabled = isEnabled,
            showOverlay = false,
            faceDetectionResult = faceDetectionResult
        )

        // Small indicator dot
        if (faceDetectionResult != null) {
            Box(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(4.dp)
                    .size(12.dp)
                    .clip(CircleShape)
                    .background(borderColor)
            )
        }
    }
}
