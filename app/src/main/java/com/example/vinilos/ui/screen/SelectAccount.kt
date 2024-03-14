package com.example.vinilos.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import com.example.vinilos.ui.component.NormalButton
import com.example.vinilos.ui.enumIU.ActiveAppScreen
import com.example.vinilos.ui.theme.md_theme_dark_blue_03
import com.example.vinilos.ui.theme.md_theme_dark_blue_04
import com.example.vinilos.ui.theme.md_theme_dark_oxford_blue

@Composable
fun SelectAccount(
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
                text = "Selecciona tu cuenta",
                style = MaterialTheme.typography.titleLarge
            )
            Spacer(modifier = Modifier.height(100.dp))
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = md_theme_dark_oxford_blue,
                ),
                modifier = Modifier
                    .size(width = 300.dp, height = 350.dp)
            ) {
                Column (
                    modifier = modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Spacer(modifier = Modifier.height(50.dp))

                    NormalButton(
                        message = "daniel_erazo@gmail.com",
                        navigateTo = { navigateTo(ActiveAppScreen.WelcomeUser.name) })

                    Spacer(modifier = Modifier.height(100.dp))

                    NormalButton(
                        message = "santi_rassa0@gmail.com",
                        navigateTo = { navigateTo(ActiveAppScreen.WelcomeUser.name) }
                    )

                    Spacer(modifier = Modifier.height(40.dp))
                }

            }

        }
    }

}