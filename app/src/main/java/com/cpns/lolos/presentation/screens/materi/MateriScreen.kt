package com.cpns.lolos.presentation.screens.materi

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.cpns.lolos.domain.model.TiuSubCategory
import com.cpns.lolos.domain.model.TkpSubCategory
import com.cpns.lolos.domain.model.TwkSubCategory
import com.cpns.lolos.presentation.theme.*

@Composable
fun MateriScreen(
    onNavigateToCategory: (String) -> Unit,
    onNavigateToSubCategory: (String, String) -> Unit
) {
    var expandedCategory by remember { mutableStateOf<String?>("TWK") }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        item {
            Text(
                text = "Materi Belajar",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Pelajari materi SKD CPNS secara lengkap",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Spacer(modifier = Modifier.height(8.dp))
        }

        // TWK Category
        item {
            CategoryExpandableCard(
                title = "TWK",
                subtitle = "Tes Wawasan Kebangsaan",
                description = "30 soal • Passing grade: 65",
                color = TwkColor,
                icon = Icons.Filled.Flag,
                isExpanded = expandedCategory == "TWK",
                onToggle = {
                    expandedCategory = if (expandedCategory == "TWK") null else "TWK"
                },
                subCategories = TwkSubCategory.all,
                onSubCategoryClick = { subCategory ->
                    onNavigateToSubCategory("TWK", subCategory)
                }
            )
        }

        // TIU Category
        item {
            CategoryExpandableCard(
                title = "TIU",
                subtitle = "Tes Intelegensi Umum",
                description = "35 soal • Passing grade: 80",
                color = TiuColor,
                icon = Icons.Filled.Psychology,
                isExpanded = expandedCategory == "TIU",
                onToggle = {
                    expandedCategory = if (expandedCategory == "TIU") null else "TIU"
                },
                subCategories = TiuSubCategory.all,
                onSubCategoryClick = { subCategory ->
                    onNavigateToSubCategory("TIU", subCategory)
                }
            )
        }

        // TKP Category
        item {
            CategoryExpandableCard(
                title = "TKP",
                subtitle = "Tes Karakteristik Pribadi",
                description = "45 soal • Passing grade: 166",
                color = TkpColor,
                icon = Icons.Filled.Person,
                isExpanded = expandedCategory == "TKP",
                onToggle = {
                    expandedCategory = if (expandedCategory == "TKP") null else "TKP"
                },
                subCategories = TkpSubCategory.all,
                onSubCategoryClick = { subCategory ->
                    onNavigateToSubCategory("TKP", subCategory)
                }
            )
        }

        // SKB Category
        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onNavigateToCategory("SKB") },
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surface
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
                            .size(48.dp)
                            .background(SkbColor.copy(alpha = 0.1f), RoundedCornerShape(12.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Work,
                            contentDescription = null,
                            tint = SkbColor
                        )
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "SKB",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Seleksi Kompetensi Bidang",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Text(
                            text = "Materi sesuai formasi jabatan",
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                    Surface(
                        color = Secondary.copy(alpha = 0.1f),
                        shape = RoundedCornerShape(4.dp)
                    ) {
                        Text(
                            text = "PREMIUM",
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                            style = MaterialTheme.typography.labelSmall,
                            color = Secondary,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun CategoryExpandableCard(
    title: String,
    subtitle: String,
    description: String,
    color: Color,
    icon: ImageVector,
    isExpanded: Boolean,
    onToggle: () -> Unit,
    subCategories: List<Pair<String, String>>,
    onSubCategoryClick: (String) -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        )
    ) {
        Column {
            // Header
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onToggle() }
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .background(color.copy(alpha = 0.1f), RoundedCornerShape(12.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = null,
                        tint = color
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = title,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = subtitle,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Text(
                        text = description,
                        style = MaterialTheme.typography.labelSmall,
                        color = color
                    )
                }
                Icon(
                    imageVector = if (isExpanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }

            // Expanded content
            if (isExpanded) {
                HorizontalDivider(modifier = Modifier.padding(horizontal = 16.dp))
                Column(
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                ) {
                    subCategories.forEach { (key, displayName) ->
                        SubCategoryItem(
                            name = displayName,
                            progress = (0..100).random() / 100f, // TODO: Real progress
                            onClick = { onSubCategoryClick(key) }
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun SubCategoryItem(
    name: String,
    progress: Float,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Filled.MenuBook,
            contentDescription = null,
            modifier = Modifier.size(20.dp),
            tint = MaterialTheme.colorScheme.onSurfaceVariant
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = name,
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(modifier = Modifier.height(4.dp))
            LinearProgressIndicator(
                progress = { progress },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(4.dp),
                color = MaterialTheme.colorScheme.primary,
                trackColor = MaterialTheme.colorScheme.surfaceVariant,
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = "${(progress * 100).toInt()}%",
            style = MaterialTheme.typography.labelSmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
        Icon(
            imageVector = Icons.Filled.ChevronRight,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}
