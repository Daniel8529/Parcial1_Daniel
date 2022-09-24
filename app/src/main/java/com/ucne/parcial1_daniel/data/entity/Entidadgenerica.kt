package com.ucne.parcial1_daniel.data.entity
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Entidadgenerica" )
class Entidadgenerica(
    @PrimaryKey(autoGenerate = true)
    val Id: Int=0,
    val Variable1: String="",
    val Variable2: String="",
    val Variable3:  Double=0.0
)



