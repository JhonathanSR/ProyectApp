package com.example.localizaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    private lateinit var textViewName: TextView
    private lateinit var textViewEmail: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        textViewName = findViewById(R.id.textViewName)
        textViewEmail = findViewById(R.id.textViewEmail)

        /*val user = intent.getSerializableExtra("user") as User
        textViewName.text = user.name
        textViewEmail.text = user.email*/
    }
}