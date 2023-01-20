package com.example.voagertest.feature.feature2.view

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import com.example.voagertest.common.feature2.view.navigation.Feature2NavigationParameters
import com.example.voagertest.feature.feature2.view.screens.Subscreen1
import com.example.voyagertest.common.navigation.view.navigation.NavigationParameters
import com.example.voyagertest.common.navigation.view.navigation.FeatureBaseScreen
import com.example.voyagertest.common.navigation.view.navigation.util.NavigationUtils

class Feature2BaseScreen(parameters: NavigationParameters, navigationUtils: NavigationUtils) :
    FeatureBaseScreen(parameters = parameters, navigationUtils = navigationUtils) {

    @Composable
    override fun Content() {
        checkParameterType(Feature2NavigationParameters::class)

        Navigator(screen = Subscreen1(navigationUtils))
    }
}