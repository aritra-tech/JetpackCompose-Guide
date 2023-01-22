package com.example.jetpackcompose_guide.firebase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose_guide.textfield.LoginUi
import com.example.jetpackcompose_guide.ui.theme.JetPackCompose_GuideTheme

class LogInActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginUi()
        }
    }
}

@Composable
fun LogIn() {

    Surface( color = Color.White) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 250.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
//            Row(horizontalArrangement = Arrangement.Start,
//            verticalAlignment = Alignment.CenterVertically,
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(60.dp)
//                .padding(start = 10.dp)
//            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.back),
//                    contentDescription = "",
//                    contentScale = ContentScale.FillWidth,
//                    alignment = Alignment.TopEnd,
//                    modifier = Modifier.size(30.dp)
//                )
//            }
            Column(horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)) {
                Text(
                    text = "Welcome Back",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp)
                )
                Text(
                    text = "Login to your account",
                    color = Color.Black,
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 70.dp)
                )
                var emailid by remember {
                    mutableStateOf("")
                }
                OutlinedTextField(
                    value = emailid,
                    onValueChange = {
                        emailid = it
                    },
                    leadingIcon = {
                        Icon(Icons.Default.Email, contentDescription = "email")
                    },
                    label = { Text(text = "Enter your EmailId") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)

                )
                var password by remember {
                    mutableStateOf("")
                }
                OutlinedTextField(
                    value = password,
                    onValueChange = {
                        password = it
                    },
                    leadingIcon = {
                        Icon(Icons.Default.Lock, contentDescription = "person")
                    },
                    label = { Text(text = "Enter your Password") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp)

                )
                Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End) {
                    Text(
                        text = "Forgot Password?",
                        fontSize = 15.sp,
                        modifier = Modifier.padding(bottom = 20.dp)
                    )
                }
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Black
                    ),
                    modifier = Modifier
                        .padding(20.dp)
                        .fillMaxWidth()
                        .height(60.dp),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(
                        text = "LogIn",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }
            }

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview2() {
    LogIn()
}