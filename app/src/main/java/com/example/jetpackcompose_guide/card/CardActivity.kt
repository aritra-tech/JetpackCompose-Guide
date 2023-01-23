package com.example.jetpackcompose_guide.card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose_guide.ui.theme.JetPackCompose_GuideTheme

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleCard()
            RoundedCard()
            CardWithBorder()
        }
    }
}

@Composable
fun SimpleCard() {
    Card(elevation = 15.dp, modifier = Modifier
        .padding(20.dp)
        .height(40.dp)) {
        Text(
            text = "This is a Simple Card Preview",
            modifier = Modifier.padding(10.dp),
        )
    }
}

@Composable
fun RoundedCard() {
    Card(elevation = 15.dp, modifier = Modifier
        .padding(20.dp)
        .height(40.dp),
    shape = RoundedCornerShape(10.dp) // you can set your radius according to your choice
    ) {
        Text(
            text = "This is a Rounded Card Preview",
            modifier = Modifier.padding(10.dp),
        )
    }
}

@Composable
fun CardWithBorder() {
    Card(elevation = 15.dp, modifier = Modifier
        .padding(20.dp)
        .height(40.dp),
    border = BorderStroke(2.dp, Color.Black)  // you can set your ow color according to your choice
    ) {
        Text(
            text = "Card with black border",
            modifier = Modifier.padding(10.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SimpleCardPreview() {
    SimpleCard()
}

@Preview(showBackground = true)
@Composable
fun RoundedCardPreview(){
    RoundedCard()
}

@Preview(showBackground = true)
@Composable
fun CardWithBorderPreview(){
    CardWithBorder()
}