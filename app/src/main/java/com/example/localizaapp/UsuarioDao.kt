package com.example.localizaapp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface UsuarioDao {
    @Query("SELECT * FROM USUARIOS WHERE email = :email AND password = :password")
    fun getUserByEmailAndPassword(email: String, password: String): Usuario?
    fun getAll(): LiveData<List<Usuario>>

    @Query("SELECT * FROM usuarios WHERE id= :id")
    suspend fun getById(id: Int): Usuario
    @Update
    suspend fun update(person: Usuario)
    @Insert
    suspend fun insert(people: List<Usuario>)
    @Delete
    suspend fun delete(person: Usuario)
}