package com.example.lab3coffeeshopapp

import android.content.Context
import android.credentials.CredentialManager
import android.net.Credentials
import android.net.wifi.hotspot2.pps.Credential

data class Credentials(
    var login: String = "",
    var pwd: String = "",
    var remember: Boolean = false
)




fun saveCredentials(context: Context, credentials: Credentials) {
    val credentialManager = CredentialManager.getInstance(context)
    val credential = Credential.Builder(credentials., credentials.pwd)
        .setAccountType("com.example.coffeeshopapp")
        .build()

    credentialManager.saveCredential(credential)
}
