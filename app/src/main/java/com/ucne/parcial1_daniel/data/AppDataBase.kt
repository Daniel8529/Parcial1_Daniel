package com.ucne.parcial1_daniel.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ucne.parcial1_daniel.data.entity.Entidadgenerica
//import com.ucne.parcial1_daniel.data.dao.OcupacioneDao
//import com.ucne.parcial1_daniel.data.dao.PersonaDao
//import com.ucne.parcial1_daniel.data.dao.PrestamoDao
//import com.ucne.parcial1_daniel.data.entity.Persona
//import com.ucne.parcial1_daniel.data.entity.Prestamo

@Database(
    entities = [Entidadgenerica::class],
    version = 2,
    exportSchema = false
)
abstract class AppDataBase : RoomDatabase() {
//    abstract val ocupacioneDao:OcupacioneDao
//    abstract val personaDao:PersonaDao
//    abstract val prestamoDao:PrestamoDao
}