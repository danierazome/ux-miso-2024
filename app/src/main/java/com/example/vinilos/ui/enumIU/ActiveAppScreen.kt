package com.example.vinilos.ui.enumIU

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Login
import androidx.compose.ui.graphics.vector.ImageVector



enum class ActiveAppScreen(val icon: ImageVector, val inBar: Boolean, val userType: UserType, val label: String) {
    Login(Icons.Filled.Login, false, UserType.None, "Login"),
    SelectAccount(Icons.Filled.Login, false, UserType.None, "SelectAccount"),
    WelcomeUser(Icons.Filled.Login, false, UserType.None, "SelectAccount"),
    Timer(Icons.Filled.Login, false, UserType.None, "SelectAccount"),
    DetailRoutine(Icons.Filled.Login, false, UserType.None, "SelectAccount"),
    DetailExercise(Icons.Filled.Home, true, UserType.Visitor, "Home")
}