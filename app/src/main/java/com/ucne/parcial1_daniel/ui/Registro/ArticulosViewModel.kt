package com.ucne.parcial1_daniel.ui.Registro

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ucne.parcial1_daniel.data.entity.Articulos
import com.ucne.parcial1_daniel.data.repository.Articulosrepository
//import com.ucne.parcial1_daniel.data.repository.ocupacioneRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class ArticulosViewModel @Inject constructor (val repository: Articulosrepository
) : ViewModel() {

    var Descripcion by mutableStateOf("")
    var  Marca by mutableStateOf("")
    var Existencia by mutableStateOf("")


    fun Save(){
        viewModelScope.launch {
            repository.insert(
                Articulos(
                    Descripcion = Descripcion,

                    Marca = Marca,
                    Existencia=Existencia.toDouble()

                )
            )
        }
    }
}

