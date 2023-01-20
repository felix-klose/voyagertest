package com.example.voagertest.feature.feature2.di

import com.example.voagertest.feature.feature2.view.navigation.Feature2NavigationTarget
import com.example.voyagertest.common.navigation.di.NavigationTargetMapKey
import com.example.voyagertest.common.navigation.view.navigation.NavigationTarget
import com.example.voyagertest.common.navigation.view.navigation.NavigationRoute
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.multibindings.IntoMap

@Module
@InstallIn(ActivityRetainedComponent::class)
class Feature2ActivityRetainedProvidesModule {

    @Provides
    @NavigationTargetMapKey(NavigationRoute.FEATURE_NAVIGATION_FEATURE2)
    @IntoMap
    fun provideFeature1NavigationTarget(feature2NavigationTarget: Feature2NavigationTarget):
            NavigationTarget = feature2NavigationTarget
}