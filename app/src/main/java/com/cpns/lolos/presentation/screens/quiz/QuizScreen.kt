package com.cpns.lolos.presentation.screens.quiz

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.cpns.lolos.presentation.theme.*
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuizScreen(
    sessionId: String,
    onFinish: () -> Unit,
    onBack: () -> Unit
) {
    // TODO: Get from ViewModel
    var currentQuestionIndex by remember { mutableIntStateOf(0) }
    var selectedAnswer by remember { mutableStateOf<Int?>(null) }
    var isMarkedForReview by remember { mutableStateOf(false) }
    var remainingTimeSeconds by remember { mutableIntStateOf(100 * 60) } // 100 minutes
    var showExitDialog by remember { mutableStateOf(false) }
    var showFinishDialog by remember { mutableStateOf(false) }

    // Mock data - replace with real data from ViewModel
    val totalQuestions = 110
    val answeredQuestions = remember { mutableStateListOf<Int>() }
    val markedQuestions = remember { mutableStateListOf<Int>() }

    // Timer
    LaunchedEffect(Unit) {
        while (remainingTimeSeconds > 0) {
            delay(1000)
            remainingTimeSeconds--
        }
        // Auto finish when time's up
        onFinish()
    }

    val timeString = remember(remainingTimeSeconds) {
        val minutes = remainingTimeSeconds / 60
        val seconds = remainingTimeSeconds % 60
        String.format("%02d:%02d", minutes, seconds)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Filled.AccessTime,
                            contentDescription = null,
                            tint = if (remainingTimeSeconds < 300) Error else MaterialTheme.colorScheme.primary
                        )
                        Text(
                            text = timeString,
                            fontWeight = FontWeight.Bold,
                            color = if (remainingTimeSeconds < 300) Error else MaterialTheme.colorScheme.onSurface
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = { showExitDialog = true }) {
                        Icon(Icons.Filled.Close, contentDescription = "Keluar")
                    }
                },
                actions = {
                    Text(
                        text = "${answeredQuestions.size}/$totalQuestions",
                        style = MaterialTheme.typography.labelLarge
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            // Question Navigator
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(totalQuestions) { index ->
                    QuestionNavigatorItem(
                        number = index + 1,
                        isAnswered = answeredQuestions.contains(index),
                        isMarked = markedQuestions.contains(index),
                        isCurrent = currentQuestionIndex == index,
                        onClick = { currentQuestionIndex = index }
                    )
                }
            }

            HorizontalDivider()

            // Question Content
            Column(
                modifier = Modifier
                    .weight(1f)
                    .verticalScroll(rememberScrollState())
                    .padding(16.dp)
            ) {
                // Category Badge
                Surface(
                    color = TwkColor.copy(alpha = 0.1f),
                    shape = RoundedCornerShape(4.dp)
                ) {
                    Text(
                        text = "TWK - Pancasila",
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                        style = MaterialTheme.typography.labelSmall,
                        color = TwkColor
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Question Number & Text
                Text(
                    text = "Soal ${currentQuestionIndex + 1}",
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Pancasila sebagai dasar negara Indonesia pertama kali diusulkan oleh Ir. Soekarno pada tanggal...",
                    style = MaterialTheme.typography.bodyLarge
                )

                Spacer(modifier = Modifier.height(24.dp))

                // Answer Options
                val options = listOf(
                    "A. 1 Juni 1945",
                    "B. 17 Agustus 1945",
                    "C. 18 Agustus 1945",
                    "D. 22 Juni 1945",
                    "E. 1 Oktober 1945"
                )

                options.forEachIndexed { index, option ->
                    AnswerOption(
                        text = option,
                        isSelected = selectedAnswer == index,
                        onClick = {
                            selectedAnswer = index
                            if (!answeredQuestions.contains(currentQuestionIndex)) {
                                answeredQuestions.add(currentQuestionIndex)
                            }
                        }
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                }
            }

            // Bottom Actions
            Surface(
                shadowElevation = 8.dp
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Mark for review
                    TextButton(
                        onClick = {
                            isMarkedForReview = !isMarkedForReview
                            if (isMarkedForReview) {
                                if (!markedQuestions.contains(currentQuestionIndex)) {
                                    markedQuestions.add(currentQuestionIndex)
                                }
                            } else {
                                markedQuestions.remove(currentQuestionIndex)
                            }
                        }
                    ) {
                        Icon(
                            imageVector = if (isMarkedForReview) Icons.Filled.Bookmark else Icons.Filled.BookmarkBorder,
                            contentDescription = null,
                            tint = if (isMarkedForReview) Warning else MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = if (isMarkedForReview) "Ditandai" else "Tandai",
                            color = if (isMarkedForReview) Warning else MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }

                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        if (currentQuestionIndex > 0) {
                            OutlinedButton(onClick = { currentQuestionIndex-- }) {
                                Icon(Icons.Filled.ArrowBack, contentDescription = null)
                                Spacer(modifier = Modifier.width(4.dp))
                                Text("Sebelumnya")
                            }
                        }

                        if (currentQuestionIndex < totalQuestions - 1) {
                            Button(onClick = { currentQuestionIndex++ }) {
                                Text("Selanjutnya")
                                Spacer(modifier = Modifier.width(4.dp))
                                Icon(Icons.Filled.ArrowForward, contentDescription = null)
                            }
                        } else {
                            Button(
                                onClick = { showFinishDialog = true },
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Success
                                )
                            ) {
                                Text("Selesai")
                                Spacer(modifier = Modifier.width(4.dp))
                                Icon(Icons.Filled.Check, contentDescription = null)
                            }
                        }
                    }
                }
            }
        }
    }

    // Exit Dialog
    if (showExitDialog) {
        AlertDialog(
            onDismissRequest = { showExitDialog = false },
            title = { Text("Keluar dari Try Out?") },
            text = {
                Text("Progress Anda akan hilang jika keluar sekarang. Yakin ingin keluar?")
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        showExitDialog = false
                        onBack()
                    },
                    colors = ButtonDefaults.textButtonColors(contentColor = Error)
                ) {
                    Text("Keluar")
                }
            },
            dismissButton = {
                Button(onClick = { showExitDialog = false }) {
                    Text("Lanjutkan")
                }
            }
        )
    }

    // Finish Dialog
    if (showFinishDialog) {
        AlertDialog(
            onDismissRequest = { showFinishDialog = false },
            title = { Text("Selesaikan Try Out?") },
            text = {
                Column {
                    Text("Anda telah menjawab ${answeredQuestions.size} dari $totalQuestions soal.")
                    if (answeredQuestions.size < totalQuestions) {
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Masih ada ${totalQuestions - answeredQuestions.size} soal yang belum dijawab.",
                            color = Warning
                        )
                    }
                }
            },
            confirmButton = {
                Button(onClick = {
                    showFinishDialog = false
                    onFinish()
                }) {
                    Text("Selesai")
                }
            },
            dismissButton = {
                TextButton(onClick = { showFinishDialog = false }) {
                    Text("Kembali")
                }
            }
        )
    }
}

@Composable
private fun QuestionNavigatorItem(
    number: Int,
    isAnswered: Boolean,
    isMarked: Boolean,
    isCurrent: Boolean,
    onClick: () -> Unit
) {
    val backgroundColor = when {
        isCurrent -> MaterialTheme.colorScheme.primary
        isMarked -> Warning
        isAnswered -> Answered
        else -> Unanswered
    }

    Box(
        modifier = Modifier
            .size(36.dp)
            .clip(CircleShape)
            .background(backgroundColor)
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = number.toString(),
            style = MaterialTheme.typography.labelMedium,
            color = Color.White,
            fontWeight = if (isCurrent) FontWeight.Bold else FontWeight.Normal
        )
    }
}

@Composable
private fun AnswerOption(
    text: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .clickable { onClick() }
            .then(
                if (isSelected) {
                    Modifier.border(2.dp, MaterialTheme.colorScheme.primary, RoundedCornerShape(12.dp))
                } else {
                    Modifier.border(1.dp, MaterialTheme.colorScheme.outline, RoundedCornerShape(12.dp))
                }
            ),
        color = if (isSelected) {
            MaterialTheme.colorScheme.primaryContainer
        } else {
            MaterialTheme.colorScheme.surface
        }
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = isSelected,
                onClick = onClick
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = text,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}
