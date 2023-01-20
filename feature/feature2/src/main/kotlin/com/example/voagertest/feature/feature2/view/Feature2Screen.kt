package com.example.voagertest.feature.feature2.view

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import com.example.voagertest.common.feature2.view.navigation.Feature2NavigationParameters
import com.example.voyagertest.common.navigation.view.navigation.FeatureNavigationParameters
import com.example.voyagertest.common.navigation.view.navigation.FeatureScreen
import com.example.voyagertest.common.navigation.view.navigation.util.NavigationUtils

class Feature2Screen(parameters: FeatureNavigationParameters, navigationUtils: NavigationUtils) :
    FeatureScreen(parameters = parameters, navigationUtils = navigationUtils) {

    @Composable
    override fun Content() {
        if (parameters !is Feature2NavigationParameters) {
            throw IllegalArgumentException(
                "Illegal ParameterType: expected Feature2NavigationParameters, got " +
                        parameters.javaClass.name
            )
        }

        Navigator(screen = Subscreen1(navigationUtils))
    }
}