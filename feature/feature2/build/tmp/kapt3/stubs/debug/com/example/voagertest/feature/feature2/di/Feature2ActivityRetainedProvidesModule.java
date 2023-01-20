package com.example.voagertest.feature.feature2.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityRetainedComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/example/voagertest/feature/feature2/di/Feature2ActivityRetainedProvidesModule;", "", "()V", "provideFeature1NavigationTarget", "Lcom/example/voyagertest/common/navigation/view/navigation/NavigationTarget;", "feature2NavigationTarget", "Lcom/example/voagertest/feature/feature2/view/navigation/Feature2NavigationTarget;", "feature2_debug"})
@dagger.Module()
public final class Feature2ActivityRetainedProvidesModule {
    
    public Feature2ActivityRetainedProvidesModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntoMap()
    @com.example.voyagertest.common.navigation.di.NavigationTargetMapKey(value = com.example.voyagertest.common.navigation.view.navigation.NavigationRoute.FEATURE_NAVIGATION_FEATURE2)
    @dagger.Provides()
    public final com.example.voyagertest.common.navigation.view.navigation.NavigationTarget provideFeature1NavigationTarget(@org.jetbrains.annotations.NotNull()
    com.example.voagertest.feature.feature2.view.navigation.Feature2NavigationTarget feature2NavigationTarget) {
        return null;
    }
}