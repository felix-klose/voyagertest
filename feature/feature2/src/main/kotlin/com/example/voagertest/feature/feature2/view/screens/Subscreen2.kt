package com.example.voagertest.feature.feature2.view.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.example.voagertest.common.feature1.view.navigation.Feature1NavigationParameters
import com.example.voyagertest.common.navigation.view.navigation.NavigationRoute
import com.example.voyagertest.common.navigation.view.navigation.util.NavigationUtils

class Subscreen2(val navigationUtils: NavigationUtils) : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Hello Feature 2, Screen 2!")
            Button(onClick = { navigator.push(Subscreen1(navigationUtils)) }) {
                Text(text = "Go to subscreen 1")
            }
            Button(onClick = {
                navigationUtils.navigateToRoute(
                    navigator,
                    NavigationRoute.FEATURE_NAVIGATION_FEATURE1,
                    Feature1NavigationParameters
                )
            }) {
                Text(text = "Go to feature 1")
            }
        }
    }
}