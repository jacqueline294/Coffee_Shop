package com.example.lab3coffeeshopapp


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab3coffeeshopapp.Screens.HomePage
import com.example.lab3coffeeshopapp.Screens.Login
import com.example.lab3coffeeshopapp.Screens.SignUpPage


@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.Screen.SignUp.route) {
        composable(Routes.Screen.SignUp.route) { SignUpPage(navController) }
        composable(Routes.Screen.Login.route) { Login(navController) }
        composable(Routes.Screen.Home.route) { HomePage(navController) }

    }
}