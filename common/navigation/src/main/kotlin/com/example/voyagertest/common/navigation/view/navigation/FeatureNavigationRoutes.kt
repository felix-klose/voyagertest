package com.example.voyagertest.common.navigation.view.navigation

enum class FeatureNavigationRoutes : NavigationRoute {
    FEATURE_NAVIGATION_FEATURE1, FEATURE_NAVIGATION_FEATURE2;

    override fun routeName(): String = name
}