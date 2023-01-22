package com.example.jetpackcompose_guide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose_guide.ui.theme.JetPackCompose_GuideTheme

class Buttons : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleButton()
            ColourfulButton()
            ButtonWithIcon()
            RoundedButton()
        }
    }
}

@Composable
fun SimpleButton() {
    Button(onClick = {/*TODO*/ }, Modifier.padding(10.dp))
    {
        Text(text = "Simple Button")
    }
}

@Composable
fun ColourfulButton() {
    Button(onClick = {/*TODO*/ }, Modifier.padding(10.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Black
        ),
    )
    {
        Text(
            text = "You can add your own color in the backgroundColor attribute",
            color = Color.White,
            fontSize = 10.sp
        )
    }
}

@Composable
fun ButtonWithIcon() {
    Button(onClick = {/*TODO*/ }, Modifier.padding(10.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Red
        ),
    )
    {
        Image(
            painter = painterResource(id = R.drawable.delete),
            contentDescription = "Delete icon",
            modifier = Modifier.size(20.dp)
        )
        Text(
            text = "Delete Permanently?",
            color = Color.White,
            modifier = Modifier.padding(start = 5.dp)
        )
    }
}

@Composable
fun RoundedButton() {
    Button(onClick = {/*TODO*/ }, Modifier.padding(10.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.White
        ),
        shape = RoundedCornerShape(10.dp)
    )
    {
        Image(
            painter = painterResource(id = R.drawable.cart),
            contentDescription = "Delete icon",
            modifier = Modifier.size(20.dp)
        )
        Text(
            text = "Add to cart",
            color = Color.Black,
            modifier = Modifier.padding(start = 5.dp)
        )
    }
}

@Preview
@Composable
fun SimpleButtonPreview() {
    SimpleButton()
}

@Preview
@Composable
fun ColourfulButtonPreview() {
    ColourfulButton()
}

@Preview
@Composable
fun ButtonWithIconPreview() {
    ButtonWithIcon()
}

@Preview
@Composable
fun RoundedButtonPreview() {
    RoundedButton()
}