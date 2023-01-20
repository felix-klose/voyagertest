package com.example.voyagertest.common.navigation.view.navigation

import com.example.voyagertest.common.navigation.view.navigation.util.NavigationUtils

interface FeatureNavigationTarget {
    fun route(): NavigationRoute
    fun screen(parameters: FeatureNavigationParameters, navigationUtils: NavigationUtils):
            FeatureScreen
}