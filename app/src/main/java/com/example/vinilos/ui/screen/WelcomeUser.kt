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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.vinilos.R
import com.example.vinilos.ui.component.NormalButton
import com.example.vinilos.ui.enumIU.ActiveAppScreen
import com.example.vinilos.ui.theme.md_theme_dark_blue_03
import com.example.vinilos.ui.theme.md_theme_dark_blue_04

@Composable
fun WelcomeUser(
    modifier: Modifier = Modifier,
    navigateTo: (String) -> Unit = {}
) {
    val gradientBox = Brush.linearGradient(listOf(md_theme_dark_blue_03, md_theme_dark_blue_04))

    Box(modifier = Modifier.background(gradientBox)) {

        Column (
            Modifier
                .fillMaxHeight()
                .fillMaxWidth()
            ,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            Text(
                text = "Bienvenido Daniel",
                style = MaterialTheme.typography.titleLarge
            )
            Spacer(modifier = Modifier.height(20.dp))
            Image(
                painter = painterResource(R.drawable.user_icon),
                contentDescription = "App name",
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .size(350.dp)
            )
            Spacer(modifier = Modifier.height(80.dp))

            NormalButton(
                message = " Inicia Aquí ",
                navigateTo = { navigateTo(ActiveAppScreen.Timer.name) })

            Spacer(modifier = Modifier.height(40.dp))

            NormalButton(
                message = "Cerrar Sesión",
                navigateTo = { navigateTo(ActiveAppScreen.Login.name) }
            )

        }
    }

}