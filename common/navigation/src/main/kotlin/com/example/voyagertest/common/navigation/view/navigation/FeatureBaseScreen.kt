package com.example.voyagertest.common.navigation.view.navigation

import cafe.adriel.voyager.core.screen.Screen
import com.example.voyagertest.common.navigation.view.navigation.util.NavigationUtils
import kotlin.reflect.KClass

abstract class FeatureBaseScreen(
    val parameters: NavigationParameters,
    val navigationUtils: NavigationUtils
) : Screen {

    protected fun <T : NavigationParameters> checkParameterType(clazz: KClass<T>) {
        if(!clazz.java.isAssignableFrom(parameters.javaClass))
            throw IllegalArgumentException()
    }
}