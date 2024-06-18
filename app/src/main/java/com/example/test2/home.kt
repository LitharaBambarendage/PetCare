package com.example.test2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageButton

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Retrieve the name from the Intent extra
        val name = intent.getStringExtra("NAME")

        // Display the name in a TextView
        val textViewName = findViewById<TextView>(R.id.txtName)
        textViewName.text = "Hi!, $name"

        //navigate to appointment page
        val btnAppointment: Button = findViewById(R.id.btnappoint)
        btnAppointment.setOnClickListener {
            val intent = Intent(this, Appointment::class.java)
            startActivity(intent)
        }

        //navigate to pet shop page
        val btnPetShop: Button = findViewById(R.id.btnshop)
        btnPetShop.setOnClickListener {
            val intent = Intent(this, Petshop::class.java)
            startActivity(intent)
        }

        //navigate to home page
        val btnNavigate1: ImageButton = findViewById(R.id.btnhome)
        btnNavigate1.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }

        //navigate to notification page
        val btnNavigate2: ImageButton = findViewById(R.id.btnnoti)
        btnNavigate2.setOnClickListener {
            val intent = Intent(this, Notification::class.java)
            startActivity(intent)
        }

        val btnNavigate4: ImageButton = findViewById(R.id.btnprofile)
        btnNavigate4.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }

    }
}
