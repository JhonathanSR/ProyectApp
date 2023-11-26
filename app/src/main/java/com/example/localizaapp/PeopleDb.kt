package com.example.localizaapp

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [Usuario::class],
    version = 1

)
abstract class PeopleDb:RoomDatabase() {

    abstract fun personDao(): UsuarioDao
}