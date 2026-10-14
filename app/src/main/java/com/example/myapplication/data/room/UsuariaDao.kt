package com.example.myapplication.data.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UsuariaDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun registrar(usuaria: UsuariaEntity): Long

    @Query("SELECT * FROM usuarias WHERE email = :email LIMIT 1")
    suspend fun buscarPorEmail(email: String): UsuariaEntity?
    
}