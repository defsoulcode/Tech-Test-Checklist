package com.example.checklist.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.checklist.ui.screens.Login
import com.example.checklist.ui.screens.main.MainScreen
import com.example.checklist.ui.screens.registration.RegistrationScreen

@ExperimentalComposeUiApi
@Composable
fun MainNav(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = Destination.LOGIN) {
        composable(Destination.LOGIN) {
            Login(navController = navController)
        }
        composable(Destination.REGISTRATION) {
            RegistrationScreen(navController = navController)
        }
        composable("${Destination.MAIN}/{token}"){
            MainScreen(token = it.arguments?.getString("token"))
        }
    }
}

object Destination{
    const val LOGIN = "login"
    const val REGISTRATION = "registration"
    const val MAIN = "main"
}