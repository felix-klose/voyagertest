package com.example.voyagertest.common.navigation.view.navigation.util

import cafe.adriel.voyager.navigator.Navigator
import com.example.voyagertest.common.navigation.view.navigation.FeatureNavigationParameters
import com.example.voyagertest.common.navigation.view.navigation.FeatureNavigationTarget
import com.example.voyagertest.common.navigation.view.navigation.FeatureScreen
import com.example.voyagertest.common.navigation.view.navigation.NavigationRoute
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class NavigationUtils @Inject constructor(
    featureNavigationTargets: Set<@JvmSuppressWildcards FeatureNavigationTarget>
) {

    private val navigationTargets: Map<NavigationRoute, (FeatureNavigationParameters) -> FeatureScreen> =
        featureNavigationTargets.associate { target: FeatureNavigationTarget ->
            target.route() to { parameters: FeatureNavigationParameters ->
                target.screen(
                    parameters,
                    this
                )
            }
        }

    fun navigateToFeature(
        navigator: Navigator,
        route: NavigationRoute,
        parameters: FeatureNavigationParameters
    ) {
        val rootNavigator = getRootNavigator(navigator)
        navigationTargets[route]?.let { it(parameters) }?.let { screen ->
            rootNavigator.push(screen)
        } ?: throw IllegalArgumentException("Navigation target ${route.routeName()} not found.")
    }

    private fun getRootNavigator(navigator: Navigator): Navigator {
        var rootNavigator = navigator
        while (rootNavigator.level != 0)
            rootNavigator = rootNavigator.parent ?: throw IllegalStateException()
        return rootNavigator
    }
}