package com.example.jetpackcompose_guide.navigation.screens

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.jetpackcompose_guide.navigation.utils.NavigationScreen

@Composable
fun FirstScreen(navHostController: NavHostController){
    
    Button(onClick = {
        navHostController.navigate(NavigationScreen.SecondScreen.route)
    }) {
        Text(text = "Click here")
    }

}