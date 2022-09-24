package com.ucne.parcial1_daniel.ui.Registro

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ucne.parcial1_daniel.data.entity.Entidadgenerica
//import com.ucne.parcial1_daniel.data.repository.ocupacioneRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class GenericoViewModel @Inject constructor (//val repository: ocupacioneRepository
) : ViewModel() {

    var Descripcion by mutableStateOf("")
    var Sueldo by mutableStateOf("")



//    fun Save(){
//        viewModelScope.launch {
//            repository.inser(
//                Ocupacione(
//                    Descripcion = Descripcion,
//
//                    Sueldo = Sueldo.toFloat()
//
//                )
//            )
//        }
//    }
}