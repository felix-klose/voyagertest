package com.example.voagertest.feature.feature1.view

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
import com.example.voagertest.common.feature2.view.navigation.Feature2NavigationParameters
import com.example.voyagertest.common.navigation.view.navigation.FeatureNavigationRoutes
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
            Text("Hello Feature 1, Screen 2!")
            Button(onClick = { navigator.push(Subscreen1(navigationUtils)) }) {
                Text(text = "Go to subscreen 1")
            }
            Button(onClick = {
                navigationUtils.navigateToFeature(
                    navigator,
                    FeatureNavigationRoutes.FEATURE_NAVIGATION_FEATURE2,
                    Feature2NavigationParameters()
                )
            }) {
                Text(text = "Go to feature 2")
            }
        }
    }
}