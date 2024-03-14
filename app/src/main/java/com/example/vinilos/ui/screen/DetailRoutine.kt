package com.example.vinilos.ui.screen

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
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import com.example.vinilos.ui.component.NormalButton
import com.example.vinilos.ui.component.SpecialButton
import com.example.vinilos.ui.component.TopBar
import com.example.vinilos.ui.enumIU.ActiveAppScreen
import com.example.vinilos.ui.theme.md_theme_dark_blue_03
import com.example.vinilos.ui.theme.md_theme_dark_blue_04
import com.example.vinilos.ui.theme.md_theme_dark_oxford_blue


@Composable
fun DetailRoutine(
    navigateTo: (String) -> Unit = {},
    navigateUp: () -> Unit = {},
    modifier: Modifier = Modifier) {

    val gradientBox = Brush.linearGradient(listOf(md_theme_dark_blue_03, md_theme_dark_blue_04))

    Scaffold(
        topBar = {
            TopBar(
                title = "",
                navigateUp = navigateUp,
                navigateTo = {navigateTo(ActiveAppScreen.WelcomeUser.name)})
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
                    text = "Detalles de Rutina",
                    style = MaterialTheme.typography.titleLarge
                )
                Spacer(modifier = Modifier.height(40.dp))
                Text(
                    text = "Ejercicios de Rutina",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(10.dp))
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = md_theme_dark_oxford_blue,
                    ),
                    modifier = Modifier
                        .size(width = 300.dp, height = 150.dp)
                ) {
                    Column (
                        modifier = modifier
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){

                        Spacer(modifier = Modifier.height(10.dp))

                        NormalButton(
                            message = "Extensión de rodilla",
                            navigateTo = { navigateTo("${ActiveAppScreen.DetailExercise.name}/0") })

                        Spacer(modifier = Modifier.height(10.dp))

                        NormalButton(
                            message = "Extensión de muñeca",
                            navigateTo = { navigateTo("${ActiveAppScreen.DetailExercise.name}/1") }
                        )
                    }

                }

                Spacer(modifier = Modifier.height(70.dp))

                SpecialButton(
                    message = "        Iniciar        ",
                    navigateTo = { navigateTo("${ActiveAppScreen.DetailExercise.name}/0") })
                Spacer(modifier = Modifier.height(10.dp))
                NormalButton(
                    message = "  Salir de la rutina ",
                    navigateTo = { navigateTo(ActiveAppScreen.Timer.name) })
                Spacer(modifier = Modifier.height(10.dp))
                NormalButton(
                    message = "Finalizar con Reporte",
                    navigateTo = { navigateTo(ActiveAppScreen.Timer.name) })
            }
        }

    }
}