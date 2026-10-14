package com.example.myapplication.data.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "registro_diario")
data class RegistroDiarioEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val usuariaId: Long,
    val fecha: String,
    val diaCiclo: Int,
    val fechaUltimoPeriodo: String,
    val patronCristalizacion: String,
    val notas: String?,
    val img: String?

)
