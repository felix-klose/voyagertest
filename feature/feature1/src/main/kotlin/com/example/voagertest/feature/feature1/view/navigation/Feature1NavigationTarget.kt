package com.example.voagertest.feature.feature1.view.navigation

import com.example.voagertest.feature.feature1.view.Feature1Screen
import com.example.voyagertest.common.navigation.view.navigation.*
import com.example.voyagertest.common.navigation.view.navigation.util.NavigationUtils
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class Feature1NavigationTarget @Inject constructor() : FeatureNavigationTarget {
    override fun route(): NavigationRoute = FeatureNavigationRoutes.FEATURE_NAVIGATION_FEATURE1

    override fun screen(parameters: FeatureNavigationParameters, navigationUtils: NavigationUtils):
            FeatureScreen = Feature1Screen(parameters, navigationUtils)
}