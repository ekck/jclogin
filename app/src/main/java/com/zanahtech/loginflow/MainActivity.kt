package com.zanahtech.loginflow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zanahtech.loginflow.ui.theme.GreenJC
import com.zanahtech.loginflow.ui.theme.LoginflowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginflowTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun LoginScreen (onLoginSuccess: () -> Unit){
    var username by remember { mutableStateOf("")}
    var password by remember { mutableStateOf("") }
    val context = LocalContext.current.applicationContext

    Column (modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 26.dp, vertical = 140.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
     OutlinedTextField(value = username, onValueChange = {username = it},
         label = { Text(text = "Username")},
         shape = RoundedCornerShape(20.dp),
         colors = TextFieldDefaults.colors(
             focusedLeadingIconColor = GreenJC,
             unfocusedLeadingIconColor = GreenJC,
             focusedLabelColor = GreenJC,
             unfocusedLabelColor = GreenJC,
             focusedContainerColor = Color.White,
             unfocusedContainerColor = Color.White,
             focusedIndicatorColor = GreenJC,
             unfocusedIndicatorColor = GreenJC,
             unfocusedPlaceholderColor = GreenJC
         ), leadingIcon = {
             Icon(imageVector = Icons.Default.Person, contentDescription = "Username")
         },
         modifier = Modifier.fillMaxWidth()
             .padding(bottom = 8.dp)
     )

        OutlinedTextField(value = username, onValueChange = {username = it},
            label = { Text(text = "Username")},
            shape = RoundedCornerShape(20.dp),
            colors = TextFieldDefaults.colors(
                focusedLeadingIconColor = GreenJC,
                unfocusedLeadingIconColor = GreenJC,
                focusedLabelColor = GreenJC,
                unfocusedLabelColor = GreenJC,
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                focusedIndicatorColor = GreenJC,
                unfocusedIndicatorColor = GreenJC,
                unfocusedPlaceholderColor = GreenJC
            ), leadingIcon = {
                Icon(imageVector = Icons.Default.Person, contentDescription = "Username")
            },
            modifier = Modifier.fillMaxWidth()
                .padding(bottom = 8.dp)
        )
    }
}