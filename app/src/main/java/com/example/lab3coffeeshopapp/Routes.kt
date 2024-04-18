package com.example.lab3coffeeshopapp

object Routes {
    sealed class Screen(val route: String) {
    object Start : Screen("start")
    object SignUp : Screen("signup")
    object Login : Screen("login")
    object Home : Screen("home")
}

}
}