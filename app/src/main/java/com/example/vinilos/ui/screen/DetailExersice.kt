package com.example.vinilos.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.vinilos.R
import com.example.vinilos.ui.component.NormalButton
import com.example.vinilos.ui.component.SpecialButton
import com.example.vinilos.ui.component.TopBar
import com.example.vinilos.ui.enumIU.ActiveAppScreen
import com.example.vinilos.ui.theme.md_theme_dark_blue_03
import com.example.vinilos.ui.theme.md_theme_dark_blue_04


@Composable
fun DetailExercise(
    id: Int,
    navigateTo: (String) -> Unit = {},
    navigateUp: () -> Unit = {},
    modifier: Modifier = Modifier) {

    val gradientBox = Brush.linearGradient(listOf(md_theme_dark_blue_03, md_theme_dark_blue_04))

    val exercises = listOf<Exercise>(
        Exercise(
            "Extensión de Rodilla",
            "Para realizar una extensión de rodilla, siéntate en una silla con la espalda recta. Lentamente, estira una pierna hasta que esté horizontal al suelo. Mantén la posición 2-3 segundos. Regresa suavemente al inicio.",
            R.drawable.rodilla
        ),
        Exercise(
            "Extensión de Muñeca",
            "Para una extensión de muñeca, apoya el antebrazo en una mesa, palma hacia abajo. Deja la muñeca libre al borde. Levanta la mano hacia arriba, manteniendo el antebrazo quieto. Sostén 2-3 segundos. Baja suavemente.",
            R.drawable.muneca
        ),
    )

    Scaffold(
        topBar = {
            TopBar(
                title = "",
                navigateUp = navigateUp
            )
        }
    ) { innerPadding ->

        Box(modifier = Modifier.background(gradientBox)) {

            Column(
                Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .padding(innerPadding)
                    .verticalScroll(rememberScrollState()),

                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = exercises[id].name,
                    style = MaterialTheme.typography.titleLarge
                )
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    text = "Ejemplo en video",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(10.dp))
                Image(
                    painter = painterResource(R.drawable.video),
                    contentScale = ContentScale.Crop,
                    contentDescription = "App name",
                    modifier = Modifier
                        .padding(horizontal = 0.dp, vertical = 0.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .width(300.dp)
                        .height(200.dp)
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Área Objetivo",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(10.dp))
                Image(
                    painter = painterResource(exercises[id].imageId),
                    contentScale = ContentScale.Crop,
                    contentDescription = "App name",
                    modifier = Modifier
                        .padding(horizontal = 0.dp, vertical = 0.dp)
                        .size(150.dp)
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = exercises[id].description,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(horizontal = 20.dp)
                )
                Spacer(modifier = Modifier.height(30.dp))
                
                SetButtons(id = id, navigateTo)
                
                Spacer(modifier = Modifier.height(30.dp))

            }
        }

    }
}


@Composable
fun SetButtons(id: Int, navigateTo: (String) -> Unit = {},) {
    if (id == 0) {
        NormalButton(
            message = "Siguiente",
            navigateTo = { navigateTo("${ActiveAppScreen.DetailExercise.name}/1") })
    }else {
        Row (
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            NormalButton(
                message = "Anterior",
                navigateTo = { navigateTo("${ActiveAppScreen.DetailExercise.name}/0") })
            SpecialButton(
                message = "Finalizar",
                navigateTo = { navigateTo(ActiveAppScreen.Timer.name) })
        }
    }
}
