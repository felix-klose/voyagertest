package com.example.voagertest.feature.feature2.di

import com.example.voagertest.feature.feature2.view.navigation.Feature2NavigationTarget
import com.example.voyagertest.common.navigation.view.navigation.FeatureNavigationTarget
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(ActivityRetainedComponent::class)
class Feature2ActivityRetainedProvidesModule {

    @Provides
    @IntoSet
    fun provideFeature2NavigationTarget(feature2NavigationTarget: Feature2NavigationTarget):
            FeatureNavigationTarget = feature2NavigationTarget
}