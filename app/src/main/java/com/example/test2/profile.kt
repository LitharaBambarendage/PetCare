package com.example.test2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btnNavigate1: ImageButton = this.findViewById(R.id.btnback)
        btnNavigate1.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }

        val btnNavigate2: ImageButton = this.findViewById(R.id.btnhome)
        btnNavigate2.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }

        val btnNavigate3: ImageButton = this.findViewById(R.id.btnnoti)
        btnNavigate3.setOnClickListener {
            val intent = Intent(this, Notification::class.java)
            startActivity(intent)
        }
    }
}