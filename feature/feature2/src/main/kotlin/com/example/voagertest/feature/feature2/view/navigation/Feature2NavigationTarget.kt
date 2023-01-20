package com.example.voagertest.feature.feature2.view.navigation

import com.example.voagertest.feature.feature2.view.Feature2BaseScreen
import com.example.voyagertest.common.navigation.view.navigation.*
import com.example.voyagertest.common.navigation.view.navigation.util.NavigationUtils
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class Feature2NavigationTarget @Inject constructor() : NavigationTarget {
    override fun createScreen(parameters: NavigationParameters, navigationUtils: NavigationUtils):
            FeatureBaseScreen = Feature2BaseScreen(parameters, navigationUtils)
}