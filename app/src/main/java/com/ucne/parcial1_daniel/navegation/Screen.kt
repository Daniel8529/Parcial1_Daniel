package com.ucne.parcial1_daniel.navegation

sealed class Screen(val route: String){
    object ListScreen: Screen(" ListScreen")
    object ListViewModel: Screen("ListViewModel")
    object GenericoScreen: Screen("  GenericoScreen")
    object GenericoViewModel: Screen("GenericoViewModel")


}