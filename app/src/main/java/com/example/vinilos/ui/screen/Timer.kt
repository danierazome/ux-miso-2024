package com.example.vinilos.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.vinilos.R
import com.example.vinilos.ui.component.NormalButton
import com.example.vinilos.ui.component.TopBar
import com.example.vinilos.ui.enumIU.ActiveAppScreen
import com.example.vinilos.ui.theme.md_theme_dark_blue_03
import com.example.vinilos.ui.theme.md_theme_dark_blue_04

@Composable
fun TimerScreen(
    navigateTo: (String) -> Unit = {},
    navigateUp: () -> Unit = {},
    modifier: Modifier = Modifier) {

    val gradientBox = Brush.linearGradient(listOf(md_theme_dark_blue_03, md_theme_dark_blue_04))

    Scaffold(
        topBar = {
            TopBar(
                title = "",
                navigateUp = navigateUp)
        }
    ) { innerPadding ->

        Box(modifier = Modifier.background(gradientBox)) {

            Column (
                Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .padding(innerPadding)
                ,
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                Text(
                    text = "Temporizador de Rutina",
                    style = MaterialTheme.typography.titleLarge
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Toca el cronómetro para ver y editar tu rutina",
                    style = MaterialTheme.typography.titleSmall,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.width(200.dp)
                )
                Spacer(modifier = Modifier.height(20.dp))
                Image(
                    painter = painterResource(R.drawable.cronometro),
                    contentDescription = "App name",
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .size(300.dp)
                )
                Spacer(modifier = Modifier.height(50.dp))

                NormalButton(
                    message = " Inicia Rutina ",
                    navigateTo = { navigateTo(ActiveAppScreen.DetailRoutine.name) })

            }
        }

    }
}