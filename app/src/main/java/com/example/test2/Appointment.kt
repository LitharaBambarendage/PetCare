package com.example.test2

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class Appointment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appointment)

        val btnNavigate2: ImageButton = findViewById(R.id.btnback3)
        btnNavigate2.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
        val btnNavigate3: Button = findViewById(R.id.btnadd)
        btnNavigate3.setOnClickListener {
            val intent = Intent(this, NewAppointment::class.java)
            startActivity(intent)
        }
    }
}

