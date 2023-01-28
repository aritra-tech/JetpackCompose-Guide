package com.example.jetpackcompose_guide.bottomnav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.jetpackcompose_guide.R

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {

    object Home : NavigationItem("home", R.drawable.home, "Home")
    object Music : NavigationItem("cart", R.drawable.cart, "Music")
    object Profile : NavigationItem("profile", R.drawable.person, "Profile")
}
