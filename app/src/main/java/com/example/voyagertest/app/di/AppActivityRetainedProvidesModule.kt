package com.example.voyagertest.app.di

import com.example.voagertest.common.feature1.view.navigation.Feature1NavigationParameters
import com.example.voyagertest.common.navigation.di.DefaultNavigationTarget
import com.example.voyagertest.common.navigation.view.navigation.NavigationParameters
import com.example.voyagertest.common.navigation.view.navigation.NavigationRoute
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@Module
@InstallIn(ActivityRetainedComponent::class)
class AppActivityRetainedProvidesModule {
    @Provides
    @DefaultNavigationTarget
    fun provideDefaultNavigationTarget() : NavigationRoute
        = NavigationRoute.FEATURE_NAVIGATION_FEATURE1

    @Provides
    @DefaultNavigationTarget
    fun provideDefaultNavigationParameters() : NavigationParameters
        = Feature1NavigationParameters
}