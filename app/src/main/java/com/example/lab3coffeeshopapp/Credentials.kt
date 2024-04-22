package com.example.lab3coffeeshopapp

import android.content.Context
import android.credentials.CredentialManager
import android.net.wifi.hotspot2.pps.Credential

data class Credentials(
    var login: String = "",
    var pwd: String = "",
    var remember: Boolean = false
) {
    fun isNotEmpty() {


        fun saveCredentials(
            context: Context,
            credentials: com.example.lab3coffeeshopapp.Credentials
        ) {
            val credentialManager = CredentialManager.getInstance(context)
            val credential = Credential.Builder(credentials., credentials.pwd)
                .setAccountType("com.example.coffeeshopapp")
                .build()

            credentialManager.saveCredential(credential)
        }
    }
}

fun retrieveSavedCredentials(context: Context): Credentials? {
    val credentialManager = CredentialManager.getInstance(context)
    val credentials = credentialManager.getCredential("com.example.coffeeshopapp")

    return credentials?.let {
        Credentials(
            login = it.id,
            pwd = it.password,
            remember = true // Assuming the user wants to remember their login
        )
    }
}
