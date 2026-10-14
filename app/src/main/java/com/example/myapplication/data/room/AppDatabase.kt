package com.example.myapplication.data.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [UsuariaEntity::class, RegistroDiarioEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun usuariaDao(): UsuariaDao
    abstract fun registroDiarioDao(): RegistroDiarioDao

    companion object{
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                Room.databaseBuilder(
                    context.applicationContext,
                    klass=AppDatabase::class.java,
                    name="myciclo_db"
                ).build().also { INSTANCE = it }
            }
        }
    }
}