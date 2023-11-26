package com.example.localizaapp

import android.content.Context.MODE_PRIVATE
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import android.content.SharedPreferences


class Cambio_ClaveMainActivity : AppCompatActivity() {
    private lateinit var editPass: EditText
    private lateinit var EditNewpass: EditText
    private lateinit var EditEmail: EditText
    private lateinit var btn_CambioClave: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cambio_clave_main)

        editPass.findViewById<EditText>(R.id.editPass)
        EditNewpass.findViewById<EditText>(R.id.EditNewpass)
        EditEmail.findViewById<EditText>(R.id.EditEmail)
        btn_CambioClave.findViewById<Button>(R.id.btn_CambioClave)

        btn_CambioClave.setOnClickListener{
            val nuevaClave = EditNewpass.text.toString()
            val claveActual = editPass.text.toString()

            if (restaurarClave(nuevaClave, claveActual)) {
                Toast.makeText(this, "Contraseña restaurada con éxito", Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, "Error al restaurar la contraseña. Verifica tus credenciales.", Toast.LENGTH_SHORT).show()
            }

        }

            /*val principio = findViewById<Button>(R.id.button7)
            principio.setOnClickListener {
                goToIn()
            }*/
        }
    }

    /*private fun goToIn(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }*/

    private fun restaurarClave(nuevaClave: String, claveActual: String): Boolean {
        val claveAlmacenada = obtenerClaveAlmacenada()

        if (claveActual == claveAlmacenada) {
            actualizarClaveEnLaBaseDeDatos(nuevaClave)
            return true
        }

        return false
    }

    private fun obtenerClaveAlmacenada(): String {
        return "clave_actual" // Esto es un ejemplo, reemplázalo con tu lógica real.
    }

    private fun actualizarClaveEnLaBaseDeDatos(nuevaClave: String) {
        val sharedPreferences = getSharedPreferences("MisPreferencias", MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("clave_actual", nuevaClave)
        editor.apply()
    }

