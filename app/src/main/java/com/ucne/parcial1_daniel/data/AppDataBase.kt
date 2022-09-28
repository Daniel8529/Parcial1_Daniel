package com.ucne.parcial1_daniel.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ucne.parcial1_daniel.data.dao.ArticulosDao
import com.ucne.parcial1_daniel.data.entity.Articulos
//import com.ucne.parcial1_daniel.data.dao.OcupacioneDao
//import com.ucne.parcial1_daniel.data.dao.PersonaDao
//import com.ucne.parcial1_daniel.data.dao.PrestamoDao
//import com.ucne.parcial1_daniel.data.entity.Persona
//import com.ucne.parcial1_daniel.data.entity.Prestamo

@Database(
    entities = [Articulos::class],
    version = 3,
    exportSchema = false
)
abstract class AppDataBase : RoomDatabase() {
    abstract val  articulosDao: ArticulosDao
//    abstract val ocupacioneDao:OcupacioneDao
//    abstract val personaDao:PersonaDao
//    abstract val prestamoDao:PrestamoDao
}