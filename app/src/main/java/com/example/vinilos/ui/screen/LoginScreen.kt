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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.vinilos.R
import com.example.vinilos.ui.component.NormalButton
import com.example.vinilos.ui.enumIU.ActiveAppScreen
import com.example.vinilos.ui.theme.md_theme_dark_blue_03
import com.example.vinilos.ui.theme.md_theme_dark_blue_04

@Composable
fun Login(
    modifier: Modifier = Modifier,
    navigateTo: (String) -> Unit = {}
) {
    val gradientBox = Brush.linearGradient(listOf(md_theme_dark_blue_03, md_theme_dark_blue_04))

    Box(modifier = Modifier.background(gradientBox)) {
        Column (
            Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
            ){

            Image(
                painter = painterResource(R.drawable.icon_marca),
                contentDescription = "App name",
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .size(300.dp)
            )

            Spacer(modifier = Modifier.height(60.dp))

            NormalButton(
                message = "Continua con Google",
                navigateTo = { navigateTo(ActiveAppScreen.SelectAccount.name) })

            Spacer(modifier = Modifier.height(30.dp))

            NormalButton(
                message = "Continua con Facebook",
                navigateTo = { navigateTo(ActiveAppScreen.SelectAccount.name) })

        }
    }

}

@Composable
@Preview
fun PreviewLogin() {
    Login()
}
