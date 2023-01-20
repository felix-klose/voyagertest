package com.example.voagertest.feature.feature1.view

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import com.example.voagertest.common.feature1.view.navigation.Feature1NavigationParameters
import com.example.voyagertest.common.navigation.view.navigation.FeatureNavigationParameters
import com.example.voyagertest.common.navigation.view.navigation.FeatureScreen
import com.example.voyagertest.common.navigation.view.navigation.util.NavigationUtils

class Feature1Screen(parameters: FeatureNavigationParameters, navigationUtils: NavigationUtils) :
    FeatureScreen(parameters = parameters, navigationUtils = navigationUtils) {

    @Composable
    override fun Content() {
        if (parameters !is Feature1NavigationParameters) {
            throw IllegalArgumentException(
                "Illegal ParameterType: expected Feature1NavigationParameters, got " +
                        parameters.javaClass.name
            )
        }

        Navigator(screen = Subscreen1(navigationUtils))
    }
}