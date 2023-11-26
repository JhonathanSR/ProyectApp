package com.example.localizaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

data class Usuar(val name: String, val email: String, val password: String)

class UsuariosRepository {
    companion object {
        private val listaUsuars = mutableListOf<Usuar>()

        fun agregarUsuario(usuar: Usuar) {
            listaUsuars.add(usuar)
        }

        fun obtenerUsuarios(): List<Usuar> {
            return listaUsuars
        }
    }
}

class RegistroMainActivity : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText

    private lateinit var btn_registrar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_main)

        editTextName = findViewById(R.id.editTextName)
        editTextEmail = findViewById(R.id.editTextEmail)
        editTextPassword = findViewById(R.id.editTextPassword)

        btn_registrar = findViewById(R.id.btn_registrar)

        btn_registrar.setOnClickListener {
            registrarUsuario()

        }

        val txtinicio = findViewById<TextView>(R.id.tv_to_go_principal)
        txtinicio.setOnClickListener {
            goToPrincipal()

        }
        val btn_Limpiar = findViewById<Button>(R.id.btn_Limpiar)
        btn_Limpiar.setOnClickListener {
            limpiarDatos()
        }
        val btn_Eliminar = findViewById<Button>(R.id.btn_Eliminar)
        btn_Eliminar.setOnClickListener {
            eliminarDatos()
        }

  }

    private  fun registrarUsuario(){
        val name = editTextName.text.toString()
        val email = editTextEmail.text.toString()
        var password = editTextPassword.text.toString()


        // Validar Contraseñas
        if (email != password) {
            // Guardar Datos Ingresados
            val usuar = Usuar(name, email, password)

            UsuariosRepository.agregarUsuario(usuar)
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        } else {
            Toast.makeText(this, "Error de Contraseñas", Toast.LENGTH_SHORT).show()
        }
    }
    
    private fun goToPrincipal(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
    private fun limpiarDatos() {
        editTextName.setText("")
        editTextEmail.setText("")
        editTextPassword.setText("")

    }
    private fun eliminarDatos() {
        editTextName.text.clear()
        editTextEmail.text.clear()
        editTextPassword.text.clear()


    }
}

class Usuarios {
    class Repository {
        companion object {
            fun agregarUsuario(usuario: Unit) {

            }
        }

    }

}


