package com.example.lab3coffeeshopapp.Screens

import android.net.Credentials
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun RegistrationPage() {
    var credentials by remember { mutableStateOf(Credentials()) }
    val context = LocalContext.current

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 30.dp)
    ) {
        LoginField(
            value = credentials.login,
            onChange = { data -> credentials = credentials.copy(login = data) },
            modifier = Modifier.fillMaxWidth()
        )
        PasswordField(
            value = credentials.pwd,
            onChange = { data -> credentials = credentials.copy(pwd = data) },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(10.dp))
        LabeledCheckbox(
            label = "Remember Me",
            onCheckChanged = {
                credentials = credentials.copy(remember = !credentials.remember)
            },
            isChecked = credentials.remember
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                // Save credentials using Jetpack Credential Manager
                saveCredentials(context, credentials)
            },
            enabled = credentials.isNotEmpty(),
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Register")
        }
    }
}
