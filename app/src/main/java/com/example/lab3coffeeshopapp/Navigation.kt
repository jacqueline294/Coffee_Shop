package com.example.lab3coffeeshopapp


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab3coffeeshopapp.Screens.DrinksListPage
import com.example.lab3coffeeshopapp.Screens.LoginPage
import com.example.lab3coffeeshopapp.Screens.MapPage
import com.example.lab3coffeeshopapp.Screens.RegistrationPage


@Composable
fun AppNavigator() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "login") {
        composable("login") { LoginPage() }
        composable("SignUp") { RegistrationPage() }
        composable("drinks") { DrinksListPage() }
        composable("map") { MapPage() }
    }
}



