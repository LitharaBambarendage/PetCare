package com.example.test2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class NewAppointment2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_appointment2)

        // Retrieve the name from the Intent extra
        val name = intent.getStringExtra("NAME")
        val condition = intent.getStringExtra("CONDITION")
        val date = intent.getStringExtra("DATE")

        // Display the name in a TextView
        val textViewName = findViewById<TextView>(R.id.txtName2)
        textViewName.text = "$name"

        val textViewCondition = findViewById<TextView>(R.id.txtCondition)
        textViewCondition.text = "$condition"

        val textViewDate = findViewById<TextView>(R.id.txtDate)
        textViewDate.text = "$date"

        //navigate to new appointment page
        val btnNavigate2: ImageButton = findViewById(R.id.btnback3)
        btnNavigate2.setOnClickListener {
            val intent = Intent(this, NewAppointment::class.java)
            startActivity(intent)
        }

        //navigate to new appointment page
        val btnNavigate: Button = findViewById(R.id.btnbook)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, Appointment::class.java)
            startActivity(intent)
        }

    }
}