package com.example.voyagertest.common.navigation.view.navigation.util;

import java.lang.System;

@dagger.hilt.android.scopes.ActivityRetainedScoped()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001a\b\u0007\u0012\u0011\u0010\u0002\u001a\r\u0012\t\u0012\u00070\u0004\u00a2\u0006\u0002\b\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000bR&\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/voyagertest/common/navigation/view/navigation/util/NavigationUtils;", "", "featureNavigationTargets", "", "Lcom/example/voyagertest/common/navigation/view/navigation/FeatureNavigationTarget;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/Set;)V", "navigationTargets", "", "Lcom/example/voyagertest/common/navigation/view/navigation/NavigationRoute;", "Lkotlin/Function1;", "Lcom/example/voyagertest/common/navigation/view/navigation/FeatureNavigationParameters;", "Lcom/example/voyagertest/common/navigation/view/navigation/FeatureScreen;", "getRootNavigator", "Lcafe/adriel/voyager/navigator/Navigator;", "navigator", "navigateToFeature", "", "route", "parameters", "navigation_debug"})
public final class NavigationUtils {
    private final java.util.Map<com.example.voyagertest.common.navigation.view.navigation.NavigationRoute, kotlin.jvm.functions.Function1<com.example.voyagertest.common.navigation.view.navigation.FeatureNavigationParameters, com.example.voyagertest.common.navigation.view.navigation.FeatureScreen>> navigationTargets = null;
    
    @javax.inject.Inject()
    public NavigationUtils(@org.jetbrains.annotations.NotNull()
    java.util.Set<com.example.voyagertest.common.navigation.view.navigation.FeatureNavigationTarget> featureNavigationTargets) {
        super();
    }
    
    public final void navigateToFeature(@org.jetbrains.annotations.NotNull()
    cafe.adriel.voyager.navigator.Navigator navigator, @org.jetbrains.annotations.NotNull()
    com.example.voyagertest.common.navigation.view.navigation.NavigationRoute route, @org.jetbrains.annotations.NotNull()
    com.example.voyagertest.common.navigation.view.navigation.FeatureNavigationParameters parameters) {
    }
    
    private final cafe.adriel.voyager.navigator.Navigator getRootNavigator(cafe.adriel.voyager.navigator.Navigator navigator) {
        return null;
    }
}