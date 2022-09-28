package com.ucne.parcial1_daniel.ui.Registro

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ucne.parcial1_daniel.data.entity.Articulos


@Composable
fun ArticulosScreen(
    onNavigateBack: () -> Unit,
    viewModel: GenericoViewModel = hiltViewModel()
) {
    Scaffold(
        topBar = {

        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                // viewModel.Save()
                onNavigateBack()
            }) {
                Icon(imageVector = Icons.Default.Create, contentDescription = "Add a Ocupacione")
            }
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(8.dp)
        ) {



        }
    }

}

@Composable
@Preview(showSystemUi = true)
fun Preview() {

    ArticulosScreen({ })

}