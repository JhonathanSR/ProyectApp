package com.example.localizaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn_Sesion = findViewById<Button>(R.id.btn_Sesion)
        btn_Sesion.setOnClickListener {
            goToIniciarSesion()
        }

        var btn_Regist: Button = findViewById(R.id.btn_Registro)
        btn_Regist.setOnClickListener {
            val intent = Intent(this, RegistroMainActivity::class.java)
            // Enviar Mensaje de Bienvenida
            intent.putExtra("Bienvenido", "LocalizaTuCoche")
            startActivity(intent)
        }
        val regist_Aqui = findViewById<TextView>(R.id.tv_go_to_registro)
        regist_Aqui.setOnClickListener {
            goToRegisAqui()

        }
        val btn_Resclave = findViewById<Button>(R.id.btn_Resclave)
        btn_Resclave.setOnClickListener {
            goResclave()
        }

        }
    private fun goToRegisAqui(){
        val i = Intent(this, RegistroMainActivity::class.java)
        startActivity(i)
    }
    private fun goToIniciarSesion(){
        val i = Intent(this, IniciarMainActivity::class.java)
        startActivity(i)
    }
    private  fun goResclave(){
        val i = Intent(this, Cambio_ClaveMainActivity::class.java)
        startActivity(i)
    }
    }


