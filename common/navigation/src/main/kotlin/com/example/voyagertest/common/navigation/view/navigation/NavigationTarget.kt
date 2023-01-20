package com.example.voyagertest.common.navigation.view.navigation

import com.example.voyagertest.common.navigation.view.navigation.util.NavigationUtils

interface NavigationTarget {
    fun createScreen(parameters: NavigationParameters, navigationUtils: NavigationUtils):
            FeatureBaseScreen
}