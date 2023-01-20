package com.example.voyagertest.common.navigation.view.navigation

import cafe.adriel.voyager.core.screen.Screen
import com.example.voyagertest.common.navigation.view.navigation.util.NavigationUtils

abstract class FeatureScreen(
    val parameters: FeatureNavigationParameters,
    val navigationUtils: NavigationUtils
) : Screen