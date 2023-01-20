package com.example.voagertest.feature.feature2.view.navigation

import com.example.voagertest.feature.feature2.view.Feature2Screen
import com.example.voyagertest.common.navigation.view.navigation.*
import com.example.voyagertest.common.navigation.view.navigation.util.NavigationUtils
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class Feature2NavigationTarget @Inject constructor() : FeatureNavigationTarget {
    override fun route(): NavigationRoute = FeatureNavigationRoutes.FEATURE_NAVIGATION_FEATURE2

    override fun screen(parameters: FeatureNavigationParameters, navigationUtils: NavigationUtils):
            FeatureScreen = Feature2Screen(parameters, navigationUtils)
}