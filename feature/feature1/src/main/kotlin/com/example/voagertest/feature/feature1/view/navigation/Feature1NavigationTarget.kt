package com.example.voagertest.feature.feature1.view.navigation

import com.example.voagertest.feature.feature1.view.Feature1BaseScreen
import com.example.voyagertest.common.navigation.view.navigation.*
import com.example.voyagertest.common.navigation.view.navigation.util.NavigationUtils
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class Feature1NavigationTarget @Inject constructor() : NavigationTarget {
    override fun createScreen(parameters: NavigationParameters, navigationUtils: NavigationUtils):
            FeatureBaseScreen = Feature1BaseScreen(parameters, navigationUtils)
}