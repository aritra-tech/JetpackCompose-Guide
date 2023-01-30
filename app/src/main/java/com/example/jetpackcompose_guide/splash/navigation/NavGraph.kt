package com.example.jetpackcompose_guide.splash.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jetpackcompose_guide.splash.SplashScreen

@Composable
fun SetNavGraph(navController: NavHostController){

    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ){
        composable(route = Screen.Splash.route){
            SplashScreen(navController = navController)
        }
        composable(route = Screen.Home.route){
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
            ){
                Text(
                    text = "Hello Jetpack User's",
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}