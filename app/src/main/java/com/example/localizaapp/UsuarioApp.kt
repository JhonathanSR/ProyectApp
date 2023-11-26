package com.example.localizaapp

import android.app.Application
import androidx.room.Room

class UsuarioApp: Application() {

    val room = Room.
    databaseBuilder(this, PeopleDb::class.java, "person").build()
}