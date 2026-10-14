package com.example.myapplication.data.room

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface RegistroDiarioDao {

    @Insert
    suspend fun insertar(registroDiario: RegistroDiarioEntity): Long

}