package com.ucne.parcial1_daniel.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Articulos" )
class Articulos(
    @PrimaryKey(autoGenerate = true)
    val ArticuloId: Int=0,
    val Descripcion: String="",
    val Marca: String="",
    val Existencia:  Double=0.0
)