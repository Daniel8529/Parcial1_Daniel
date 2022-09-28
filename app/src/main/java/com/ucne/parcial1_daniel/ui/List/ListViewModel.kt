package com.ucne.parcial1_daniel.ui.List

import android.content.Context
import android.speech.tts.TextToSpeech
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ucne.parcial1_daniel.data.entity.Articulos

import com.ucne.parcial1_daniel.data.repository.Articulosrepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject
//
//import android.content.Context
//import android.widget.Toast
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.setValue
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.ucne.registroprestamos.model.Ocupacione
//import com.ucne.registroprestamos.repository.ocupacioneRepository
//import dagger.hilt.android.lifecycle.HiltViewModel
//import kotlinx.coroutines.launch
//import javax.inject.Inject


data class ListViewModelListUiState(
    val articulos: List<Articulos> = emptyList(),
    val texto: String = "Meeting"
)

@HiltViewModel
class ListViewModel @Inject constructor(
   val repository: Articulosrepository
) : ViewModel() {

    private val _uiState = MutableStateFlow( ListViewModelListUiState())
    val uiState: StateFlow<ListViewModelListUiState> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            repository.geAll().collect() { list ->
                _uiState.update {
                    it.copy( articulos = list )
                }
            }
        }
    }
}
