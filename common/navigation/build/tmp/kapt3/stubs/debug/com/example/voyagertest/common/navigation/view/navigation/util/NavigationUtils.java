package com.example.voyagertest.common.navigation.view.navigation.util;

import java.lang.System;

@dagger.hilt.android.scopes.ActivityRetainedScoped()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B4\b\u0007\u0012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0005\u00a2\u0006\u0002\b\u00060\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\tR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0005\u00a2\u0006\u0002\b\u00060\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/voyagertest/common/navigation/view/navigation/util/NavigationUtils;", "", "navigationTargets", "", "Lcom/example/voyagertest/common/navigation/view/navigation/NavigationRoute;", "Lcom/example/voyagertest/common/navigation/view/navigation/NavigationTarget;", "Lkotlin/jvm/JvmSuppressWildcards;", "defaultNavigationRoute", "defaultNavigationParameters", "Lcom/example/voyagertest/common/navigation/view/navigation/NavigationParameters;", "(Ljava/util/Map;Lcom/example/voyagertest/common/navigation/view/navigation/NavigationRoute;Lcom/example/voyagertest/common/navigation/view/navigation/NavigationParameters;)V", "getDefaultScreen", "Lcafe/adriel/voyager/core/screen/Screen;", "getRootNavigator", "Lcafe/adriel/voyager/navigator/Navigator;", "navigator", "navigateToRoute", "", "route", "parameters", "navigation_debug"})
public final class NavigationUtils {
    private final java.util.Map<com.example.voyagertest.common.navigation.view.navigation.NavigationRoute, com.example.voyagertest.common.navigation.view.navigation.NavigationTarget> navigationTargets = null;
    private final com.example.voyagertest.common.navigation.view.navigation.NavigationRoute defaultNavigationRoute = null;
    private final com.example.voyagertest.common.navigation.view.navigation.NavigationParameters defaultNavigationParameters = null;
    
    @javax.inject.Inject()
    public NavigationUtils(@org.jetbrains.annotations.NotNull()
    java.util.Map<com.example.voyagertest.common.navigation.view.navigation.NavigationRoute, com.example.voyagertest.common.navigation.view.navigation.NavigationTarget> navigationTargets, @org.jetbrains.annotations.NotNull()
    @com.example.voyagertest.common.navigation.di.DefaultNavigationTarget()
    com.example.voyagertest.common.navigation.view.navigation.NavigationRoute defaultNavigationRoute, @org.jetbrains.annotations.NotNull()
    @com.example.voyagertest.common.navigation.di.DefaultNavigationTarget()
    com.example.voyagertest.common.navigation.view.navigation.NavigationParameters defaultNavigationParameters) {
        super();
    }
    
    public final void navigateToRoute(@org.jetbrains.annotations.NotNull()
    cafe.adriel.voyager.navigator.Navigator navigator, @org.jetbrains.annotations.NotNull()
    com.example.voyagertest.common.navigation.view.navigation.NavigationRoute route, @org.jetbrains.annotations.NotNull()
    com.example.voyagertest.common.navigation.view.navigation.NavigationParameters parameters) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cafe.adriel.voyager.core.screen.Screen getDefaultScreen() {
        return null;
    }
    
    private final cafe.adriel.voyager.navigator.Navigator getRootNavigator(cafe.adriel.voyager.navigator.Navigator navigator) {
        return null;
    }
}