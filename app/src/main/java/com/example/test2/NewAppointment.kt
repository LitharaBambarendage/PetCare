package com.example.test2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import java.util.Date

class NewAppointment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_appointment)

        lateinit var edtName: EditText
        lateinit var edtCondition: EditText
        lateinit var edtDate: EditText

        edtName = findViewById(R.id.edtName2)
        edtCondition = findViewById(R.id.edtCondition)
        edtDate = findViewById(R.id.edtDate)

        //navigate to home page
        val btnNavigate1: ImageButton = findViewById(R.id.btnback3)
        btnNavigate1.setOnClickListener {
            val intent = Intent(this, Appointment::class.java)
            startActivity(intent)
        }

        //navigate to new appointment2 page
        val btnNavigate2: Button = findViewById(R.id.btnfind)
        btnNavigate2.setOnClickListener {
            val intent = Intent(this, NewAppointment2::class.java)
            startActivity(intent)

            // Pass the name to the other activity
            navigateToDisplayActivity(
                edtName.text.toString(),
                edtCondition.text.toString(),
                edtDate.text.toString()
            )
        }

    }

    private fun navigateToDisplayActivity(name: String, condition: String, date: String) {
        // Create an Intent to navigate to the second activity
        val intent = Intent(this, NewAppointment2::class.java)
        // Pass the name to the second activity using Intent extra
        intent.putExtra("NAME", name)
        intent.putExtra("CONDITION", condition)
        intent.putExtra("DATE", date)
        // Start the second activity
        startActivity(intent)
    }
}