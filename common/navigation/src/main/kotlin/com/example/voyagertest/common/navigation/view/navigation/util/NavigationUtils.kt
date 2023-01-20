package com.example.voyagertest.common.navigation.view.navigation.util

import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.Navigator
import com.example.voyagertest.common.navigation.di.DefaultNavigationTarget
import com.example.voyagertest.common.navigation.view.navigation.NavigationParameters
import com.example.voyagertest.common.navigation.view.navigation.NavigationTarget
import com.example.voyagertest.common.navigation.view.navigation.NavigationRoute
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class NavigationUtils @Inject constructor(
    private val navigationTargets: Map<NavigationRoute, @JvmSuppressWildcards NavigationTarget>,
    @DefaultNavigationTarget private val defaultNavigationRoute: NavigationRoute,
    @DefaultNavigationTarget private val defaultNavigationParameters: NavigationParameters
) {
    fun navigateToRoute(
        navigator: Navigator,
        route: NavigationRoute,
        parameters: NavigationParameters
    ) {
        val rootNavigator = getRootNavigator(navigator)
        navigationTargets[route]?.createScreen(parameters, this)?.let { screen ->
            rootNavigator.push(screen)
        } ?: throw IllegalArgumentException("Navigation target ${route.name} not found.")
    }

    fun getDefaultScreen(): Screen =
        navigationTargets[defaultNavigationRoute]
            ?.createScreen(defaultNavigationParameters, this)
            ?: throw IllegalStateException(
                "Screen for default route ${defaultNavigationRoute.name} not found."
            )

    private fun getRootNavigator(navigator: Navigator): Navigator {
        var rootNavigator = navigator
        while (rootNavigator.level != 0)
            rootNavigator = rootNavigator.parent ?: throw IllegalStateException()
        return rootNavigator
    }
}