package com.example.eventregestration

import android.R.attr.label
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.eventregestration.ui.theme.EventregestrationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EventregestrationTheme {
                event()
            }
        }
    }
}

@Composable

fun event(){
    var event by remember { mutableStateOf(" ") }
    var date by remember { mutableStateOf(" ") }
    Column(modifier = Modifier
        .fillMaxSize()
        , horizontalAlignment = Alignment.CenterHorizontally
        , verticalArrangement = Arrangement.Center
    ){
        Text("Tech Fest")
        Text("john dose")
        Text("12306325")
        TextField(value = event, onValueChange = {event = it},label = {Text("enter event category")})
        TextField(value = date, onValueChange = {date = it},label = { Text("date")})
        var context= LocalContext.current
        Button(onClick = {
            Toast.makeText(context, "event registered", Toast.LENGTH_SHORT).show()
        }) {Text("register")}
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    EventregestrationTheme {
        event()
    }
}