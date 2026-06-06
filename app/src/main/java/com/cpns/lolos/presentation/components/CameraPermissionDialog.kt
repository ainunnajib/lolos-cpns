package com.cpns.lolos.presentation.components

import android.content.Intent
import android.net.Uri
import android.provider.Settings
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

/**
 * Dialog to request camera permission for face detection proctoring
 *
 * @param onDismiss Called when user dismisses the dialog
 * @param onRequestPermission Called when user wants to grant permission
 * @param isPermanentlyDenied True if permission was permanently denied
 * @param onContinueWithoutCamera Called when user chooses to continue without camera
 */
@Composable
fun CameraPermissionDialog(
    onDismiss: () -> Unit,
    onRequestPermission: () -> Unit,
    isPermanentlyDenied: Boolean = false,
    onContinueWithoutCamera: (() -> Unit)? = null
) {
    val context = LocalContext.current

    AlertDialog(
        onDismissRequest = onDismiss,
        icon = {
            Icon(
                imageVector = if (isPermanentlyDenied) Icons.Default.Settings else Icons.Default.CameraAlt,
                contentDescription = null,
                modifier = Modifier.size(48.dp),
                tint = MaterialTheme.colorScheme.primary
            )
        },
        title = {
            Text(
                text = if (isPermanentlyDenied) {
                    "Izin Kamera Diperlukan"
                } else {
                    "Aktifkan Pengawasan Ujian"
                },
                style = MaterialTheme.typography.headlineSmall,
                textAlign = TextAlign.Center
            )
        },
        text = {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = if (isPermanentlyDenied) {
                        "Anda telah menolak izin kamera secara permanen. " +
                                "Untuk menggunakan fitur pengawasan ujian, " +
                                "silakan buka Pengaturan dan aktifkan izin kamera untuk aplikasi ini."
                    } else {
                        "Fitur deteksi wajah memerlukan akses kamera untuk:\n\n" +
                                "• Simulasi pengawasan ujian CAT\n" +
                                "• Memastikan fokus selama latihan\n" +
                                "• Persiapan menghadapi ujian sesungguhnya\n\n" +
                                "Kamera hanya digunakan secara lokal dan tidak merekam atau menyimpan data."
                    },
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Center
                )
            }
        },
        confirmButton = {
            Button(
                onClick = {
                    if (isPermanentlyDenied) {
                        // Open app settings
                        val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
                            data = Uri.fromParts("package", context.packageName, null)
                        }
                        context.startActivity(intent)
                        onDismiss()
                    } else {
                        onRequestPermission()
                    }
                }
            ) {
                Text(
                    text = if (isPermanentlyDenied) "Buka Pengaturan" else "Izinkan Kamera"
                )
            }
        },
        dismissButton = {
            if (onContinueWithoutCamera != null) {
                TextButton(onClick = {
                    onContinueWithoutCamera()
                    onDismiss()
                }) {
                    Text("Lanjut Tanpa Kamera")
                }
            } else {
                TextButton(onClick = onDismiss) {
                    Text("Batal")
                }
            }
        }
    )
}

/**
 * Compact camera permission banner for inline display
 */
@Composable
fun CameraPermissionBanner(
    onRequestPermission: () -> Unit,
    isPermanentlyDenied: Boolean = false,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current

    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.secondaryContainer
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "Pengawasan Ujian",
                    style = MaterialTheme.typography.titleSmall
                )
                Text(
                    text = if (isPermanentlyDenied) {
                        "Izin kamera ditolak. Buka pengaturan untuk mengaktifkan."
                    } else {
                        "Aktifkan kamera untuk simulasi pengawasan"
                    },
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSecondaryContainer.copy(alpha = 0.7f)
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            FilledTonalButton(
                onClick = {
                    if (isPermanentlyDenied) {
                        val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
                            data = Uri.fromParts("package", context.packageName, null)
                        }
                        context.startActivity(intent)
                    } else {
                        onRequestPermission()
                    }
                }
            ) {
                Text(if (isPermanentlyDenied) "Pengaturan" else "Aktifkan")
            }
        }
    }
}
