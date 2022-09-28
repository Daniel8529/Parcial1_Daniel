package com.ucne.parcial1_daniel.data.dao

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.flow.Flow
import androidx.room.*
import com.ucne.parcial1_daniel.data.entity.Articulos

@Dao
interface Articulodao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(articulos: Articulos)

    @Update()
    suspend fun update(articulos: Articulos)

    @Query("SELECT *"+"FROM Articulos" + " WHERE ArticuloId= :id ")
    fun get(id : Int): Flow<Articulos>

    @Query("SELECT * FROM Articulos")
    fun geALL(): Flow<List<Articulos>>
}
