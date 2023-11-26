package com.example.localizaapp

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "usuarios")
data class Usuario (

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val email: String,
    val password: String
)




