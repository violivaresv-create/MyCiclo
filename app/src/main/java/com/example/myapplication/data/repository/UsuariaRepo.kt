package com.example.myapplication.data.repository

import com.example.myapplication.data.room.UsuariaDao
import com.example.myapplication.data.room.UsuariaEntity

class UsuariaRepo(private val dao: UsuariaDao) {

    suspend fun registrar(id: Long,email: String, nombre: String, password: String): Boolean{
        return dao.registrar(UsuariaEntity(id,email,nombre, password)) != -1L
    }


}