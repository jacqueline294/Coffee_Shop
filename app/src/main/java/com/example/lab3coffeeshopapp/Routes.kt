package com.example.lab3coffeeshopapp

object Routes {
    sealed class Screen(val route: String) {

    object SignUp : Screen("signUpPage")
    object Login : Screen("login")
    object Home : Screen("HomePage")
}

}
