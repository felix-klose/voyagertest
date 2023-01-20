package com.example.voyagertest.common.navigation.di

import com.example.voyagertest.common.navigation.view.navigation.NavigationRoute
import dagger.MapKey
import javax.inject.Qualifier

@MapKey
annotation class NavigationTargetMapKey(val value: NavigationRoute)

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DefaultNavigationTarget