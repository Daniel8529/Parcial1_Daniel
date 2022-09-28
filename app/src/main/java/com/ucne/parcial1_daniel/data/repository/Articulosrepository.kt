package com.ucne.parcial1_daniel.data.repository

import com.ucne.parcial1_daniel.data.AppDataBase
import com.ucne.parcial1_daniel.data.entity.Articulos
import javax.inject.Inject


class Articulosrepository @Inject constructor(
    val db: AppDataBase
){

    suspend fun insert(articulos: Articulos){
        db.articulosDao.insert(articulos)
    }

    fun get(id : Int)=db.articulosDao.get(id)

    fun geAll()=db.articulosDao.geALL()

}