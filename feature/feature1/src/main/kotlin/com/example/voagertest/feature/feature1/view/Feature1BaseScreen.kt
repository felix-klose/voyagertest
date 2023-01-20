package com.example.voagertest.feature.feature1.view

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import com.example.voagertest.common.feature1.view.navigation.Feature1NavigationParameters
import com.example.voagertest.feature.feature1.view.screens.Subscreen1
import com.example.voyagertest.common.navigation.view.navigation.NavigationParameters
import com.example.voyagertest.common.navigation.view.navigation.FeatureBaseScreen
import com.example.voyagertest.common.navigation.view.navigation.util.NavigationUtils

class Feature1BaseScreen(parameters: NavigationParameters, navigationUtils: NavigationUtils) :
    FeatureBaseScreen(parameters = parameters, navigationUtils = navigationUtils) {

    @Composable
    override fun Content() {
        checkParameterType(Feature1NavigationParameters::class)

        Navigator(screen = Subscreen1(navigationUtils))
    }
}