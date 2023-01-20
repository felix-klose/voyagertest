package com.example.voyagertest.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import cafe.adriel.voyager.navigator.Navigator
import com.example.voagertest.common.feature1.view.navigation.Feature1NavigationParameters
import com.example.voagertest.feature.feature1.view.Feature1Screen
import com.example.voyagertest.app.ui.theme.VoyagerTestTheme
import com.example.voyagertest.common.navigation.view.navigation.util.NavigationUtils
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var navigationUtils: NavigationUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VoyagerTestTheme {
                // A surface container using the 'background' color from the theme
                Navigator(Feature1Screen(Feature1NavigationParameters(), navigationUtils))
            }
        }
    }
}
