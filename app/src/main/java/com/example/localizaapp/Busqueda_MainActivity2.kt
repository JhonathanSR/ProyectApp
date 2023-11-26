package com.example.localizaapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Busqueda_MainActivity2 : AppCompatActivity() {

    private lateinit var txtUbicacion: TextView
    private lateinit var btn_Resultados: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_busqueda_main2)

        txtUbicacion.findViewById<TextView>(R.id.txtUbicacion)
        btn_Resultados.findViewById<Button>(R.id.btn_Resultados)

        val ubicacion = intent.getStringExtra("UBICACION")
        txtUbicacion.text = "Ubicación. $ubicacion"

        btn_Resultados.setOnClickListener {
            if (ubicacion != null) {
                abrirNavegadorconMapa(ubicacion)
            }
        }

        /*val busqResul = findViewById<Button>(R.id.btn_Resultados)
        busqResul.setOnClickListener {
            goToResult()*/
    }
    private fun abrirNavegadorconMapa(ubicacion: String){
        //Contrucción de URL en mapa usando las Coordenadas
        val urlMapa = ("https://www.google.com/maps/place/Colombia")

        //Abrir Navegador web
        val  intent =Intent(Intent.ACTION_VIEW, Uri.parse(urlMapa))
        startActivity(intent)
    }

}
/*private fun goToResult(){
    val i = Intent(this, MapsActivity::class.java)
    startActivity(i)*/






