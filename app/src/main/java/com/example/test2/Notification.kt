package com.example.test2

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Notification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        val btnNavigate: ImageButton = findViewById(R.id.btnback3)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }

        val btnNavigate1: ImageButton = findViewById(R.id.btnhome)
        btnNavigate1.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }

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