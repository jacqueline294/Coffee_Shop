package com.example.lab3coffeeshopapp.Screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.unit.dp

@Composable
fun DrinksListPage() {
    val drinks = listOf("Espresso", "Latte", "Cappuccino", "Mocha", "Chai latte")

    LazyColumn {
        items(drinks) { drink ->
            Text(text = drink, modifier = Modifier.padding(16.dp))
        }
    }
}
