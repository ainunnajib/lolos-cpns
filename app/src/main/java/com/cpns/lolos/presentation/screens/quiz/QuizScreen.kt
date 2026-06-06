package com.cpns.lolos.presentation.screens.quiz

import androidx.compose.animation.*
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.cpns.lolos.data.facedetection.FaceStatus
import com.cpns.lolos.presentation.components.CameraPermissionBanner
import com.cpns.lolos.presentation.components.CameraPermissionDialog
import com.cpns.lolos.presentation.components.CompactCameraPreview
import com.cpns.lolos.presentation.theme.*
import com.cpns.lolos.util.hasCameraPermission
import com.cpns.lolos.util.rememberCameraPermissionState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuizScreen(
    sessionId: String,
    onFinish: () -> Unit,
    onBack: () -> Unit,
    viewModel: QuizViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    val context = LocalContext.current

    var showExitDialog by remember { mutableStateOf(false) }
    var showFinishDialog by remember { mutableStateOf(false) }
    var showPermissionDialog by remember { mutableStateOf(false) }

    // Camera permission state
    val (permissionState, requestPermission) = rememberCameraPermissionState { granted ->
        if (granted) {
            viewModel.enableProctoring()
        }
        showPermissionDialog = false
    }

    // Check initial permission on launch
    LaunchedEffect(Unit) {
        val hasPermission = context.hasCameraPermission()
        viewModel.setCameraPermission(hasPermission)
        if (!hasPermission && !uiState.proctoring.isEnabled) {
            // Show permission prompt after a short delay
            kotlinx.coroutines.delay(1000)
            showPermissionDialog = true
        } else if (hasPermission) {
            viewModel.enableProctoring()
        }
    }

    // Navigate to result when finished
    LaunchedEffect(uiState.isFinished) {
        if (uiState.isFinished) {
            onFinish()
        }
    }

    // Loading state
    if (uiState.isLoading) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator()
        }
        return
    }

    // Error state
    if (uiState.error != null) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(uiState.error!!, color = MaterialTheme.colorScheme.error)
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = onBack) {
                    Text("Kembali")
                }
            }
        }
        return
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
                            tint = if (uiState.isTimeWarning) Error else MaterialTheme.colorScheme.primary
                        )
                        Text(
                            text = uiState.timeString,
                            fontWeight = FontWeight.Bold,
                            color = if (uiState.isTimeWarning) Error else MaterialTheme.colorScheme.onSurface
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = { showExitDialog = true }) {
                        Icon(Icons.Filled.Close, contentDescription = "Keluar")
                    }
                },
                actions = {
                    // Proctoring indicator
                    if (uiState.proctoring.isEnabled) {
                        val statusColor = when (uiState.proctoring.faceDetectionResult?.status) {
                            FaceStatus.SINGLE_FACE -> Success
                            FaceStatus.NO_FACE, FaceStatus.MULTIPLE_FACES -> Error
                            else -> MaterialTheme.colorScheme.outline
                        }
                        Icon(
                            imageVector = Icons.Filled.Face,
                            contentDescription = "Proctoring",
                            tint = statusColor,
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                    }

                    Text(
                        text = "${uiState.answeredQuestions.size}/${uiState.totalQuestions}",
                        style = MaterialTheme.typography.labelLarge
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                }
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                // Proctoring warning banner
                AnimatedVisibility(
                    visible = uiState.proctoring.isWarning && uiState.proctoring.isEnabled,
                    enter = slideInVertically() + fadeIn(),
                    exit = slideOutVertically() + fadeOut()
                ) {
                    Surface(
                        modifier = Modifier.fillMaxWidth(),
                        color = Error.copy(alpha = 0.9f)
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                Icons.Filled.Warning,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = uiState.proctoring.warningMessage ?: "Peringatan",
                                color = Color.White,
                                style = MaterialTheme.typography.bodySmall
                            )
                        }
                    }
                }

                // Camera permission banner (if not enabled)
                if (!uiState.proctoring.isEnabled && !uiState.proctoring.hasCameraPermission) {
                    CameraPermissionBanner(
                        onRequestPermission = { showPermissionDialog = true },
                        isPermanentlyDenied = permissionState.isPermanentlyDenied,
                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                    )
                }

                // Question Navigator
                LazyRow(
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(uiState.totalQuestions) { index ->
                        QuestionNavigatorItem(
                            number = index + 1,
                            isAnswered = uiState.answeredQuestions.contains(index),
                            isMarked = uiState.markedQuestions.contains(index),
                            isCurrent = uiState.currentQuestionIndex == index,
                            onClick = { viewModel.goToQuestion(index) }
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
                    val currentQuestion = uiState.currentQuestion

                    if (currentQuestion != null) {
                        // Category Badge
                        Surface(
                            color = when (currentQuestion.category.name) {
                                "TWK" -> TwkColor.copy(alpha = 0.1f)
                                "TIU" -> TiuColor.copy(alpha = 0.1f)
                                "TKP" -> TkpColor.copy(alpha = 0.1f)
                                else -> MaterialTheme.colorScheme.primaryContainer
                            },
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Text(
                                text = "${currentQuestion.category.displayName} - ${currentQuestion.subCategory}",
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                                style = MaterialTheme.typography.labelSmall,
                                color = when (currentQuestion.category.name) {
                                    "TWK" -> TwkColor
                                    "TIU" -> TiuColor
                                    "TKP" -> TkpColor
                                    else -> MaterialTheme.colorScheme.primary
                                }
                            )
                        }

                        Spacer(modifier = Modifier.height(16.dp))

                        // Question Number & Text
                        Text(
                            text = "Soal ${uiState.currentQuestionIndex + 1}",
                            style = MaterialTheme.typography.labelMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = currentQuestion.questionText,
                            style = MaterialTheme.typography.bodyLarge
                        )

                        Spacer(modifier = Modifier.height(24.dp))

                        // Answer Options
                        currentQuestion.options.forEachIndexed { index, option ->
                            AnswerOption(
                                text = option,
                                isSelected = uiState.selectedAnswer == index,
                                onClick = { viewModel.selectAnswer(index) }
                            )
                            Spacer(modifier = Modifier.height(12.dp))
                        }
                    }
                }

                // Bottom Actions
                Surface(shadowElevation = 8.dp) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Mark for review
                        TextButton(onClick = { viewModel.toggleMarkForReview() }) {
                            Icon(
                                imageVector = if (uiState.isMarkedForReview) Icons.Filled.Bookmark else Icons.Filled.BookmarkBorder,
                                contentDescription = null,
                                tint = if (uiState.isMarkedForReview) Warning else MaterialTheme.colorScheme.onSurfaceVariant
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = if (uiState.isMarkedForReview) "Ditandai" else "Tandai",
                                color = if (uiState.isMarkedForReview) Warning else MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            if (uiState.currentQuestionIndex > 0) {
                                OutlinedButton(onClick = { viewModel.previousQuestion() }) {
                                    Icon(Icons.Filled.ArrowBack, contentDescription = null)
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text("Sebelumnya")
                                }
                            }

                            if (uiState.currentQuestionIndex < uiState.totalQuestions - 1) {
                                Button(onClick = { viewModel.nextQuestion() }) {
                                    Text("Selanjutnya")
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Icon(Icons.Filled.ArrowForward, contentDescription = null)
                                }
                            } else {
                                Button(
                                    onClick = { showFinishDialog = true },
                                    colors = ButtonDefaults.buttonColors(containerColor = Success)
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

            // Camera Preview (bottom-right corner)
            if (uiState.proctoring.isEnabled) {
                CompactCameraPreview(
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .padding(end = 16.dp, bottom = 100.dp),
                    onFaceDetected = { bitmap -> viewModel.processFrame(bitmap) },
                    isEnabled = true,
                    faceDetectionResult = uiState.proctoring.faceDetectionResult
                )
            }
        }
    }

    // Camera Permission Dialog
    if (showPermissionDialog) {
        CameraPermissionDialog(
            onDismiss = { showPermissionDialog = false },
            onRequestPermission = requestPermission,
            isPermanentlyDenied = permissionState.isPermanentlyDenied,
            onContinueWithoutCamera = { showPermissionDialog = false }
        )
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
                        viewModel.abandonQuiz()
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
                    Text("Anda telah menjawab ${uiState.answeredQuestions.size} dari ${uiState.totalQuestions} soal.")
                    if (uiState.answeredQuestions.size < uiState.totalQuestions) {
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Masih ada ${uiState.totalQuestions - uiState.answeredQuestions.size} soal yang belum dijawab.",
                            color = Warning
                        )
                    }
                    if (uiState.proctoring.isEnabled && uiState.proctoring.warningCount > 0) {
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Peringatan pengawasan: ${uiState.proctoring.warningCount}x",
                            color = Error,
                            style = MaterialTheme.typography.bodySmall
                        )
                    }
                }
            },
            confirmButton = {
                Button(onClick = {
                    viewModel.finishQuiz()
                    showFinishDialog = false
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
