package com.example.vinilos.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.vinilos.ui.enumIU.ActiveAppScreen
import com.example.vinilos.ui.enumIU.UserType

@Composable
fun BottomBarVisitor(selectedItem: String, modifier: Modifier = Modifier, onSelect: (String) -> Unit = {}) {

    NavigationBar {
        ActiveAppScreen.values().filter { it.inBar && it.userType == UserType.Visitor }.forEach { item ->
            NavigationBarItem(
                icon = { Icon(item.icon, contentDescription = item.label) },
                label = { Text(item.label) },
                selected = selectedItem == item.name,
                onClick = { onSelect(item.name) }
            )
        }
    }
}
@Preview
@Composable
fun PreviewBottomBarVisitor(){
    BottomBarVisitor("Home")
}

@Composable
fun BottomBarCollector(selectedItem: String, modifier: Modifier = Modifier, onSelect: (String) -> Unit = {}) {

    NavigationBar {
        ActiveAppScreen.values().filter { it.inBar && it.userType == UserType.Collector }.forEach { item ->
            NavigationBarItem(
                icon = { Icon(item.icon, contentDescription = item.label) },
                label = { Text(item.label) },
                selected = selectedItem == item.name,
                onClick = { onSelect(item.name) }
            )
        }
    }
}
@Preview
@Composable
fun PreviewBottomBarCollector(){
    BottomBarCollector("Home")
}

@Composable
fun TopBar(
    title: String,
    navigateUp: () -> Unit,
    navigateTo: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = {
            Text(
                text = title
            )
        },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = Color.Transparent
        ),
        modifier = modifier,
        navigationIcon = {
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "GO BACK BUTTON"
                    )
                }
                IconButton(onClick = navigateTo) {
                    Icon(
                        modifier = Modifier
                            .background(color = Color.Black, shape = RoundedCornerShape(15.dp)),
                        imageVector = Icons.Filled.Home,
                        contentDescription = "GO BACK HOME"
                    )
                }
            }
        }
    )
}