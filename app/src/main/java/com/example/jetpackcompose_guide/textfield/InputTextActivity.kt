package com.example.jetpackcompose_guide.textfield

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose_guide.ui.theme.JetPackCompose_GuideTheme

class InputTextActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            SimpleTextInputComponent()
        }
    }
}

@Composable
fun SimpleTextInputComponent() {

    Surface(color = Color.DarkGray, modifier = Modifier.padding(20.dp)) {
        var text by remember {
            mutableStateOf(TextFieldValue("Enter your name here")) }
        BasicTextField(
            value = text,
            modifier = Modifier.padding(10.dp).fillMaxWidth(),
            textStyle = TextStyle(
                color = Color.White,
                fontSize = 15.sp,
            ),
            onValueChange = {
                text = it
            }
        )
    }
}

@Preview
@Composable
fun SimpleTextInputComponentPreview() {
    JetPackCompose_GuideTheme {
        SimpleTextInputComponent()
    }
}