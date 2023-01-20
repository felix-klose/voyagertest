package com.example.voagertest.feature.feature1.di

import com.example.voagertest.feature.feature1.view.navigation.Feature1NavigationTarget
import com.example.voyagertest.common.navigation.view.navigation.FeatureNavigationTarget
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(ActivityRetainedComponent::class)
class Feature1ActivityRetainedProvidesModule {

    @Provides
    @IntoSet
    fun provideFeature1NavigationTarget(feature1NavigationTarget: Feature1NavigationTarget):
            FeatureNavigationTarget = feature1NavigationTarget
}