package com.example.vinilos.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.vinilos.ui.enumIU.ActiveAppScreen


@Composable
@Preview
fun ActiveApp(navController: NavHostController = rememberNavController()) {

    NavHost(
        navController = navController,
        startDestination = ActiveAppScreen.Login.name
    ) {
        composable(route = ActiveAppScreen.Login.name) {
            Login(
                navigateTo = {
                    navController.navigate(it)
                }
            )
        }
        composable(route = ActiveAppScreen.SelectAccount.name) {
            SelectAccount(
                navigateTo = {
                    navController.navigate(it)
                }
            )
        }

        composable(route = ActiveAppScreen.WelcomeUser.name) {
            WelcomeUser(
                navigateTo = {
                    navController.navigate(it)
                }
            )
        }

        composable(route = ActiveAppScreen.Timer.name) {
            TimerScreen(
                navigateTo = {
                    navController.navigate(it)
                },
                navigateUp = {navController.navigateUp()}
            )
        }

        composable(route = ActiveAppScreen.DetailRoutine.name) {
            DetailRoutine(
                navigateTo = {
                    navController.navigate(it)
                },
                navigateUp = {navController.navigateUp()}
            )
        }

        composable(
            "${ActiveAppScreen.DetailExercise.name}/{id}",
            arguments = listOf(
                navArgument("id") { type = NavType.IntType })
        ) { backStackEntry ->
            val arguments = requireNotNull(backStackEntry.arguments)
            val id = arguments.getInt("id")
            DetailExercise(
                id= id,
                navigateTo = {
                    navController.navigate(it)
                },
                navigateUp = {navController.navigateUp()}
            )
        }
    }
}