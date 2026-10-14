package com.example.myapplication.data.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "usuarias")
data class UsuariaEntity (
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val email: String,
    val nombre: String,
    val password: String
)