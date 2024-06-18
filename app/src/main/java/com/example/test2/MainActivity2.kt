package com.example.test2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {

    lateinit var edtName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        edtName = findViewById(R.id.edtName)

        //navigate to home page
        val btnNavigate1: Button = findViewById(R.id.btnlogin)
        btnNavigate1.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)

            // Pass the name to the other activity
            navigateToDisplayActivity(edtName.text.toString())
        }

        //navigate to sign up page
        val btnNavigate2: Button = findViewById(R.id.btncreateacc)
        btnNavigate2.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
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

