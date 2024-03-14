package com.example.vinilos.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.vinilos.ui.theme.md_theme_dark_blue_01
import com.example.vinilos.ui.theme.md_theme_dark_blue_02
import com.example.vinilos.ui.theme.md_theme_dark_oxford_orange


@Composable
fun NormalButton(
    message: String,
    navigateTo: () -> Unit = {},
    modifier: Modifier = Modifier) {
    val gradientButton = Brush.linearGradient(listOf(md_theme_dark_blue_01, md_theme_dark_blue_02))

    Button(
        onClick = navigateTo,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        ),
        modifier = modifier
            .padding(vertical = 5.dp)
            .background(brush = gradientButton, shape = RoundedCornerShape(50.dp))
    ) {
        Text(message, color = Color.White)
    }
}

@Composable
fun SpecialButton(
    message: String,
    navigateTo: () -> Unit = {},
    modifier: Modifier = Modifier) {
    val gradientButton = Brush.linearGradient(listOf(md_theme_dark_oxford_orange, md_theme_dark_blue_01))

    Button(
        onClick = navigateTo,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        ),
        modifier = modifier
            .padding(vertical = 5.dp)
            .background(brush = gradientButton, shape = RoundedCornerShape(50.dp))
    ) {
        Text(message, color = Color.White)
    }
}