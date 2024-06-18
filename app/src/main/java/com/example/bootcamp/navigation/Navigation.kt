package com.example.bootcamp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bootcamp.ui.home.view.HomeScreen

@Composable
fun Navigation(
    navController: NavController
) {

    NavHost(
        navController = navController as NavHostController, startDestination = Screens.HOME_SCREEN
    ) {
        composable(Screens.HOME_SCREEN) {
            HomeScreen(navController)
        }
    }
}