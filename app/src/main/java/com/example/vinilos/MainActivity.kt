package com.example.vinilos


import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.vinilos.ui.screen.ActiveApp
import com.example.vinilos.ui.theme.VinilosTheme


class MainActivity : ComponentActivity() {

    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        val callback = object : OnBackPressedCallback(enabled=true) {

            override fun handleOnBackPressed() {
                Toast.makeText(this@MainActivity, "Cerrando la app", Toast.LENGTH_LONG)
                    .show()
                finish()
            }
        }
        super.onCreate(savedInstanceState)
        //OnBackPressedDispatcher.
        setContent {
            VinilosTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ActiveApp()
                }
            }
        }
        this.onBackPressedDispatcher.addCallback( callback)

    }


}



