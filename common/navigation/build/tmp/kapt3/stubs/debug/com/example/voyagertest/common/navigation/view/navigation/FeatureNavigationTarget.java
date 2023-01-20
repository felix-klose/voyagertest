package com.example.voyagertest.common.navigation.view.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/example/voyagertest/common/navigation/view/navigation/FeatureNavigationTarget;", "", "route", "Lcom/example/voyagertest/common/navigation/view/navigation/NavigationRoute;", "screen", "Lcom/example/voyagertest/common/navigation/view/navigation/FeatureScreen;", "parameters", "Lcom/example/voyagertest/common/navigation/view/navigation/FeatureNavigationParameters;", "navigationUtils", "Lcom/example/voyagertest/common/navigation/view/navigation/util/NavigationUtils;", "navigation_debug"})
public abstract interface FeatureNavigationTarget {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.voyagertest.common.navigation.view.navigation.NavigationRoute route();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.voyagertest.common.navigation.view.navigation.FeatureScreen screen(@org.jetbrains.annotations.NotNull()
    com.example.voyagertest.common.navigation.view.navigation.FeatureNavigationParameters parameters, @org.jetbrains.annotations.NotNull()
    com.example.voyagertest.common.navigation.view.navigation.util.NavigationUtils navigationUtils);
}