package com.ucne.parcial1_daniel

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ucne.parcial1_daniel.navegation.Screen
import com.ucne.parcial1_daniel.ui.List.ListScreen
import com.ucne.parcial1_daniel.ui.Registro.GenericoScreen
import com.ucne.parcial1_daniel.ui.theme.Parcial1_DanielTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Parcial1_DanielTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController, startDestination = Screen.ListScreen.route
                ) {

                    composable(Screen.ListScreen.route) {

                        ListScreen(
                            onClick = { navController.navigate(Screen.GenericoScreen.route) }
                        )
                    }
                    composable(Screen.GenericoScreen.route) {
                        GenericoScreen({ navController.navigateUp() })
                    }

                }
            }



        }
    }
}

