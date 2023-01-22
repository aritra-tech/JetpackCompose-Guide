package com.example.jetpackcompose_guide.core

import android.content.res.Configuration
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose_guide.ui.theme.JetPackCompose_GuideTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Testing(nameTest = "Testing Jetpack Compose")
            HelloContent()

        }
    }
}

@Composable
fun Testing(nameTest: String) {
    Text(
        text = nameTest,
        color = Color.White,
    )
}
@Composable
fun HelloContent() {
    Column(modifier = Modifier.padding(20.dp)) {
        Text(
            text = "Hello!",
            modifier = Modifier.padding(bottom = 10.dp),
            style = MaterialTheme.typography.h5
        )
        OutlinedTextField(
            value = "",
            onValueChange = { },
            label = { Text("Name") }
        )
        OutlinedTextField(
            value = "",
            onValueChange = { },
            label = { Text("Password") }
        )
    }
}
//@Composable
//fun HelloContent() {
//    Column(modifier = Modifier.padding(16.dp)) {
//        var name by remember { mutableStateOf("") }
//        if (name.isNotEmpty()) {
//            Text(
//                text = "Hello, $name!",
//                modifier = Modifier.padding(bottom = 8.dp),
//                style = MaterialTheme.typography.h5
//            )
//        }
//        OutlinedTextField(
//            value = name,
//            onValueChange = { name = it },
//            label = { Text("Name") }
//        )
//    }
//}
@Preview
@Composable
fun DefaultPreview() {
//    Testing(nameTest = "Testing Jetpack Compose")
    HelloContent()
}