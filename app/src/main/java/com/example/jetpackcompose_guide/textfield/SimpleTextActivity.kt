package com.example.jetpackcompose_guide.textfield

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose_guide.ui.theme.JetPackCompose_GuideTheme

class SimpleTextActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                content =  {
                    LoginUi()
                }
            )
        }
    }
}
@Composable
fun SimpleText(text: String) {
    Text(
        text = text,
        color = Color.White
    )
}

@Preview
@Composable
fun LoginUi(){
    SimpleText(text = "Learning Jetpack Compose")
}

