package com.example.lab3coffeeshopapp.Screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun MapPage() {
    AndroidView(
        factory = { context ->
            MapView(context).apply {
                onCreate(Bundle())
                getMapAsync { googleMap ->
                    // Customize your map here
                    googleMap.uiSettings.isZoomControlsEnabled = true
                }
            }
        },
        modifier = Modifier.fillMaxSize()
    )
}




