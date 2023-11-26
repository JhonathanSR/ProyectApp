package com.example.localizaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.net.Uri
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Ingreso_MainActivity2 : AppCompatActivity() {

    private lateinit var txtBusqMat: TextView
    private lateinit var btn_Busq: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingreso_main2)

        val txtBusqMat = findViewById<TextView>(R.id.txtBusqMat)
        val  busq = findViewById<Button>(R.id.btn_Busq)

        busq.setOnClickListener {
            val matricula = txtBusqMat.text.toString()
            buscarMatricula(matricula)

        }
        val btn_inicio = findViewById<Button>(R.id.btn_Init)
        btn_inicio.setOnClickListener {
            goToInit()
        }
    }
    private fun buscarMatricula(matricula: String){
        // Buscar Matricula
        val ubicacion = buscarUbicacionMatricula(matricula)
        if(ubicacion != null){
            val intent = Intent(this, Busqueda_MainActivity2::class.java)
            intent.putExtra("UBICACION", ubicacion)
            startActivity(intent)
        }else{
            Toast.makeText(this, "No se encontro la Matricula, $matricula", Toast.LENGTH_SHORT).show()
        }

    }

    private fun goToInit(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
    private fun buscarUbicacionMatricula(matricula: String): String? {

        return "Latitud, Longitud"
    }

}
