package com.ucne.parcial1_daniel.ui.Registro

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.*
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.text.isDigitsOnly
import androidx.hilt.navigation.compose.hiltViewModel
import com.ucne.parcial1_daniel.data.entity.Articulos


@Composable
fun ArticulosScreen(
    onNavigateBack: () -> Unit,
    viewModel: ArticulosViewModel = hiltViewModel(),
    Articulo: Int=1
) {
    var ErrorDescripcion by remember {mutableStateOf(false)}
    var ErrorMarca by remember {mutableStateOf(false)}
    var ErrorExiste by remember {mutableStateOf(false)}

    Scaffold(
        topBar = {

        }

    ) {



        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(8.dp)
        ) {
            TopAppBar(title = { Text(text = "Registro")}, modifier = Modifier.padding(2.dp), actions = {})
            OutlinedTextField(
                label = { Text(text = "Descripcion")},
                value =viewModel.Descripcion ,
                onValueChange ={viewModel.Descripcion=it
                    ErrorDescripcion=false},
            isError =ErrorDescripcion , modifier = Modifier.fillMaxWidth())

            if (ErrorDescripcion) {
                Text(
                    text = "La descricipcion esta vacia",
                    color = MaterialTheme.colors.error,
                    modifier = Modifier.padding(start = 16.dp)


                )
            }
            OutlinedTextField(
                label = { Text(text = "Marca")},
                value =viewModel.Marca ,
                onValueChange ={viewModel.Marca=it
                    ErrorMarca=false},
                 isError = ErrorMarca,modifier = Modifier.fillMaxWidth())
            if (ErrorMarca) {
                Text(
                    text = "La marca esta vacia",
                    color = MaterialTheme.colors.error,
                    modifier = Modifier.padding(start = 16.dp)


                )
            }

            OutlinedTextField(
                label = { Text(text = "Existencia")},
                value =viewModel.Existencia ,
                onValueChange ={viewModel.Existencia=it
                    ErrorExiste=false},
                isError = ErrorExiste,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone), modifier = Modifier.fillMaxWidth())
            if (ErrorExiste) {
                Text(
                    text = "La Existencia esta vacia",
                    color = MaterialTheme.colors.error,
                    modifier = Modifier.padding(start = 16.dp)


                )
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
                    .padding(8.dp)
            ) {

                Button(modifier = Modifier.fillMaxWidth(),onClick = {
                   if(viewModel.Existencia.isBlank()||viewModel.Descripcion.isBlank()
                       ||viewModel.Marca.isBlank())
                   {
                       ErrorDescripcion=viewModel.Descripcion.isBlank()
                       ErrorMarca=viewModel.Marca.isBlank()
                       ErrorExiste=viewModel.Existencia.isBlank()

                   }else {
                       if(viewModel.Existencia.isDigitsOnly())
                       {
                           if(viewModel.Existencia.toDouble()<1)
                           {

                           }else {
                               viewModel.Save()
                               onNavigateBack()
                           }

                       }


                   }



                }) {

                    Icon(
                        imageVector = Icons.Default.AccountCircle,contentDescription = "Add a Ocupacione"
                    )

                }

            }





        }





    }

}

@Composable
@Preview(showSystemUi = true)
fun Preview() {

    ArticulosScreen({ })

}