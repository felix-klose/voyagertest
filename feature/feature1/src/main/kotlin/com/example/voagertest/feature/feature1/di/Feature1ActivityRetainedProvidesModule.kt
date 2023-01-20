package com.example.voagertest.feature.feature1.di

import com.example.voagertest.feature.feature1.view.navigation.Feature1NavigationTarget
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
class Feature1ActivityRetainedProvidesModule {

    @Provides
    @NavigationTargetMapKey(NavigationRoute.FEATURE_NAVIGATION_FEATURE1)
    @IntoMap
    fun provideFeature1NavigationTarget(feature1NavigationTarget: Feature1NavigationTarget):
            NavigationTarget = feature1NavigationTarget
}