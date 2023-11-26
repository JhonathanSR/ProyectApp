package com.example.localizaapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Resultados : AppCompatActivity() {

    private lateinit var txtMatr: TextView
    private lateinit var btn_Resu: Button
    private lateinit var btn_principio: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados)

        txtMatr = findViewById(R.id.txtMatr)
        btn_Resu = findViewById(R.id.btn_Resu)
        btn_principio = findViewById(R.id.btn_principio)

        // Recibe la busqueda desde la ventana ingresoMain
        val matricula = intent.getStringExtra("MATRICULA")
        txtMatr.text = "Matricula: $matricula"

        btn_Resu.setOnClickListener {
            // Abrir un Navegador Web con la Ubicacion en Google Maps
            abrirGoogleMapsNavegador()
        }
        val btn_principio = findViewById<Button>(R.id.btn_principio)
        goToPrincipal()
    }

    private fun abrirGoogleMapsNavegador(){
        val ubicacion = "Latitud, Longitud" //Se reemplazan con Coordenadas de Busqueda
        val uri = Uri.parse("https://www.google.com/maps?q=$ubicacion")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }
    private fun goToPrincipal(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}