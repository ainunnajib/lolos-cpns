package com.cpns.lolos.util

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.*
import androidx.core.content.ContextCompat

/**
 * State holder for camera permission
 */
data class CameraPermissionState(
    val hasPermission: Boolean,
    val shouldShowRationale: Boolean,
    val isPermanentlyDenied: Boolean
)

/**
 * Composable to handle camera permission requests
 *
 * @param onPermissionResult Callback when permission result is received
 * @return A pair of (CameraPermissionState, requestPermission function)
 */
@Composable
fun rememberCameraPermissionState(
    onPermissionResult: (Boolean) -> Unit = {}
): Pair<CameraPermissionState, () -> Unit> {
    var permissionState by remember {
        mutableStateOf(
            CameraPermissionState(
                hasPermission = false,
                shouldShowRationale = false,
                isPermanentlyDenied = false
            )
        )
    }

    var hasRequestedOnce by remember { mutableStateOf(false) }

    val permissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        hasRequestedOnce = true
        permissionState = permissionState.copy(
            hasPermission = isGranted,
            isPermanentlyDenied = !isGranted && hasRequestedOnce && !permissionState.shouldShowRationale
        )
        onPermissionResult(isGranted)
    }

    val requestPermission: () -> Unit = {
        permissionLauncher.launch(Manifest.permission.CAMERA)
    }

    return Pair(permissionState, requestPermission)
}

/**
 * Check if camera permission is granted
 */
fun Context.hasCameraPermission(): Boolean {
    return ContextCompat.checkSelfPermission(
        this,
        Manifest.permission.CAMERA
    ) == PackageManager.PERMISSION_GRANTED
}

/**
 * Check if the device has a camera
 */
fun Context.hasCamera(): Boolean {
    return packageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY)
}

/**
 * Check if the device has a front camera
 */
fun Context.hasFrontCamera(): Boolean {
    return packageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA_FRONT)
}
