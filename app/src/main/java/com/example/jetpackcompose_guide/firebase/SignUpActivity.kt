package com.example.jetpackcompose_guide.firebase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose_guide.R

class SignUpActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SignUp()
        }
    }
}

@Composable
fun SignUp() {

    Surface( color = Color.White) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 150.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)) {
                Text(
                    text = "Create a new account!",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 35.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 15.dp)
                )
                Text(
                    text = "SignUp to create a account",
                    color = Color.Black,
                    fontWeight = FontWeight.Light,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 40.dp)
                )
                var name by remember {
                    mutableStateOf("")
                }
                OutlinedTextField(
                    value = name,
                    onValueChange = {
                        name = it
                    },
                    leadingIcon = {
                        Icon(Icons.Default.Person, contentDescription = "email")
                    },
                    label = { Text(text = "Name") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)

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
                    label = { Text(text = "Email Id") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)

                )
                var password by remember {
                    mutableStateOf("")
                }
                val passwordVisibility by remember {
                    mutableStateOf(false)
                }
                OutlinedTextField(
                    value = password,
                    onValueChange = {
                        password = it
                    },
                    leadingIcon = {
                        Icon(Icons.Default.Lock, contentDescription = "password")
                    },

                    label = { Text(text = "Password") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp)

                )
                var confirmpassword by remember {
                    mutableStateOf("")
                }
                OutlinedTextField(
                    value = confirmpassword,
                    onValueChange = {
                        confirmpassword = it
                    },
                    leadingIcon = {
                        Icon(Icons.Default.Lock, contentDescription = "password")
                    },
                    label = { Text(text = "Confirm Password") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp)

                )
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
                        text = "SignUp",
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
fun SignUpPreview() {
    SignUp()
}