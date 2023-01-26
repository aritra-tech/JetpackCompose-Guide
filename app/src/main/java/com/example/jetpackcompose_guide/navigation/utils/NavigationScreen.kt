package com.example.jetpackcompose_guide.navigation.utils

sealed class NavigationScreen(val route:String){

    object FirstScreen : NavigationScreen("firstscreen")
    object SecondScreen : NavigationScreen("secondscreen")
}

