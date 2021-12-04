package com.kst.jetpack.data.models

import androidx.compose.ui.graphics.Color
import com.kst.jetpack.ui.theme.HighPriorityColor
import com.kst.jetpack.ui.theme.LowPriorityColor
import com.kst.jetpack.ui.theme.MediumPriorityColor
import com.kst.jetpack.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}