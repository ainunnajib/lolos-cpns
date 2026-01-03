package com.cpns.lolos.presentation.screens.tryout

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.cpns.lolos.domain.model.QuizType
import com.cpns.lolos.presentation.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TryOutScreen(
    onStartQuiz: (sessionId: String) -> Unit,
    viewModel: TryOutViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()

    var showConfirmDialog by remember { mutableStateOf(false) }
    var selectedQuizType by remember { mutableStateOf<QuizType?>(null) }

    // Navigate when session is created
    LaunchedEffect(uiState.createdSessionId) {
        uiState.createdSessionId?.let { sessionId ->
            onStartQuiz(sessionId)
            viewModel.clearCreatedSession()
        }
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Text(
                text = "Pilih Try Out",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Simulasi tes dengan waktu seperti ujian asli",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        // Full Try Out Card
        item {
            TryOutTypeCard(
                title = "Try Out SKD Lengkap",
                description = "Simulasi CAT BKN dengan 110 soal",
                details = listOf(
                    "30 soal TWK",
                    "35 soal TIU",
                    "45 soal TKP"
                ),
                duration = "100 menit",
                icon = Icons.Filled.Assignment,
                isPrimary = true,
                onClick = {
                    selectedQuizType = QuizType.TRYOUT_FULL
                    showConfirmDialog = true
                }
            )
        }

        item {
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Latihan Per Kategori",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.SemiBold
            )
        }

        // Category Practice Cards
        item {
            TryOutTypeCard(
                title = "Latihan TWK",
                description = "Tes Wawasan Kebangsaan",
                details = listOf("30 soal", "Passing grade: 65"),
                duration = "30 menit",
                icon = Icons.Filled.Flag,
                color = TwkColor,
                onClick = {
                    selectedQuizType = QuizType.LATIHAN_TWK
                    showConfirmDialog = true
                }
            )
        }

        item {
            TryOutTypeCard(
                title = "Latihan TIU",
                description = "Tes Intelegensi Umum",
                details = listOf("35 soal", "Passing grade: 80"),
                duration = "35 menit",
                icon = Icons.Filled.Psychology,
                color = TiuColor,
                onClick = {
                    selectedQuizType = QuizType.LATIHAN_TIU
                    showConfirmDialog = true
                }
            )
        }

        item {
            TryOutTypeCard(
                title = "Latihan TKP",
                description = "Tes Karakteristik Pribadi",
                details = listOf("45 soal", "Passing grade: 166"),
                duration = "45 menit",
                icon = Icons.Filled.Person,
                color = TkpColor,
                onClick = {
                    selectedQuizType = QuizType.LATIHAN_TKP
                    showConfirmDialog = true
                }
            )
        }

        item {
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Try Out Cepat",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.SemiBold
            )
        }

        item {
            TryOutTypeCard(
                title = "Try Out Mini",
                description = "Latihan cepat 30 soal campuran",
                details = listOf("10 TWK", "10 TIU", "10 TKP"),
                duration = "30 menit",
                icon = Icons.Filled.Timer,
                onClick = {
                    selectedQuizType = QuizType.TRYOUT_MINI
                    showConfirmDialog = true
                }
            )
        }
    }

    // Confirmation Dialog
    if (showConfirmDialog && selectedQuizType != null) {
        AlertDialog(
            onDismissRequest = { showConfirmDialog = false },
            title = {
                Text(text = "Mulai ${selectedQuizType?.displayName}?")
            },
            text = {
                Column {
                    Text("Anda akan memulai sesi try out dengan:")
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("• ${selectedQuizType?.questionCount} soal")
                    Text("• Waktu: ${selectedQuizType?.timeLimit} menit")
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Pastikan Anda memiliki waktu yang cukup dan tidak terganggu.",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        showConfirmDialog = false
                        selectedQuizType?.let { type ->
                            viewModel.startQuiz(type)
                        }
                    },
                    enabled = !uiState.isCreatingSession
                ) {
                    if (uiState.isCreatingSession) {
                        CircularProgressIndicator(
                            modifier = Modifier.size(16.dp),
                            strokeWidth = 2.dp
                        )
                    } else {
                        Text("Mulai")
                    }
                }
            },
            dismissButton = {
                TextButton(onClick = { showConfirmDialog = false }) {
                    Text("Batal")
                }
            }
        )
    }
}

@Composable
private fun TryOutTypeCard(
    title: String,
    description: String,
    details: List<String>,
    duration: String,
    icon: ImageVector,
    color: androidx.compose.ui.graphics.Color = MaterialTheme.colorScheme.primary,
    isPrimary: Boolean = false,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        colors = CardDefaults.cardColors(
            containerColor = if (isPrimary) {
                MaterialTheme.colorScheme.primary
            } else {
                MaterialTheme.colorScheme.surface
            }
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(56.dp)
                    .background(
                        if (isPrimary) {
                            MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.2f)
                        } else {
                            color.copy(alpha = 0.1f)
                        },
                        RoundedCornerShape(12.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = if (isPrimary) {
                        MaterialTheme.colorScheme.onPrimary
                    } else {
                        color
                    },
                    modifier = Modifier.size(28.dp)
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = if (isPrimary) {
                        MaterialTheme.colorScheme.onPrimary
                    } else {
                        MaterialTheme.colorScheme.onSurface
                    }
                )
                Text(
                    text = description,
                    style = MaterialTheme.typography.bodySmall,
                    color = if (isPrimary) {
                        MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.8f)
                    } else {
                        MaterialTheme.colorScheme.onSurfaceVariant
                    }
                )
                Spacer(modifier = Modifier.height(4.dp))
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    details.forEach { detail ->
                        Text(
                            text = detail,
                            style = MaterialTheme.typography.labelSmall,
                            color = if (isPrimary) {
                                MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.7f)
                            } else {
                                MaterialTheme.colorScheme.onSurfaceVariant
                            }
                        )
                    }
                }
            }

            Column(horizontalAlignment = Alignment.End) {
                Icon(
                    imageVector = Icons.Filled.AccessTime,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp),
                    tint = if (isPrimary) {
                        MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.7f)
                    } else {
                        MaterialTheme.colorScheme.onSurfaceVariant
                    }
                )
                Text(
                    text = duration,
                    style = MaterialTheme.typography.labelSmall,
                    color = if (isPrimary) {
                        MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.7f)
                    } else {
                        MaterialTheme.colorScheme.onSurfaceVariant
                    }
                )
            }
        }
    }
}
