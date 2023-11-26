package com.example.localizaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity

class IniciarMainActivity : AppCompatActivity() {
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var btn_Ingsesion: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciar_main)

        editTextEmail = findViewById(R.id.editTextEmail)
        editTextPassword = findViewById(R.id.editTextPassword)
        btn_Ingsesion = findViewById(R.id.btn_Ingsesion)

        btn_Ingsesion.setOnClickListener {
            //goToBusqueda()
            val email = editTextEmail.text.toString().trim()
            val passw = editTextPassword.text.toString().trim()

            if (validarLogin(email, passw)) {

                val intent = Intent(this, Ingreso_MainActivity2::class.java)
                intent.putExtra("email", passw)
                Toast.makeText(this@IniciarMainActivity, "Contraseña Correcta", Toast.LENGTH_LONG)
                    .show()
                finish()
                startActivity(intent)
            } else {
                Toast.makeText(this@IniciarMainActivity, "Contraseña Incorrecta", Toast.LENGTH_LONG)
                    .show()
            }

            val txtRes = findViewById<TextView>(R.id.txtReset)
            txtRes.setOnClickListener {
                goToResetClave()
            }
            val btn_ini = findViewById<Button>(R.id.btn_ini)
            btn_ini.setOnClickListener {
                goToIni()
            }
        }
        }


    private fun validarLogin(email: String, passw: String, ): Boolean {
        // Validación Correo y contraseña
        val validEmail = "jh@mail.com"
        val validPasw = "123456"

        return email == validEmail && passw == validPasw
    }

    private fun goToResetClave() {
        val i = Intent(this, Cambio_ClaveMainActivity::class.java)
        startActivity(i)
    }
    private fun goToIni() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
   /* private fun goToBusqueda(){
        val intent = Intent(this, Ingreso_MainActivity2::class.java)
        startActivity(intent)
    }*/
}

