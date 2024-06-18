package com.example.test2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class SignUp : AppCompatActivity() {

    lateinit var edtName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        edtName = findViewById(R.id.edtName3)

        val btnNavigate2: ImageButton = findViewById(R.id.btnback)
        btnNavigate2.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        val btnNavigate: Button = findViewById(R.id.btnsignup)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)

            // Pass the name to the other activity
            navigateToDisplayActivity(edtName.text.toString())

        }
    }

    private fun navigateToDisplayActivity(name: String) {
        // Create an Intent to navigate to the second activity
        val intent = Intent(this, home::class.java)
        // Pass the name to the second activity using Intent extra
        intent.putExtra("NAME", name)
        // Start the second activity
        startActivity(intent)
    }
}