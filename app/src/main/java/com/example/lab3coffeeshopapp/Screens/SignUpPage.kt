package com.example.lab3coffeeshopapp.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.lab3coffeeshopapp.Credentials

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
            onChange = { data -> credentials = credentials.copy(login = data) },
            modifier = Modifier.fillMaxWidth()
        )
        PasswordField(
            onChange = { data -> credentials = credentials.copy(pwd = data) },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(10.dp))
        LabeledCheckbox(
            onCheckChanged = {
                credentials = credentials.copy(remember = !credentials.remember)
            },
            isChecked = credentials.remember
        )
        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                // Save credentials using Jetpack Credential Manager
                saveCredentials(credentials)
            },
            enabled = credentials.isNotEmpty(),
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Register")
        }
    }
}

@Composable
fun LoginField(onChange: Any, modifier: Modifier) {

}

@Composable
fun PasswordField(onChange: Any, modifier: Modifier) {

}

@Composable
fun LabeledCheckbox(onCheckChanged: () -> Unit, isChecked: Boolean) {

}

fun Button(onClick: () -> Unit, enabled: Unit, shape: RoundedCornerShape, modifier: Modifier, content: RowScope.() -> Unit) {

}

fun saveCredentials(credentials: Credentials) {

}











