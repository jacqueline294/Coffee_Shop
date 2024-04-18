package com.example.lab3coffeeshopapp

import HomePage
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController





@Composable
fun Nav(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.Screen.Start.route) {
        composable(Routes.Screen.Start.route) { StartPage(navController) }
        composable(Routes.Screen.SignUp.route) { SignUp(navController) }
        composable(Routes.Screen.Login.route) { Login(navController) }
        composable(Routes.Screen.Home.route) { HomePage(navController) }

    }