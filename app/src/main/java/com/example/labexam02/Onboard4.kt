package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Onboard4 : AppCompatActivity() {
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard4)

        // Initialize button
        button = findViewById(R.id.onb3button)

        // Set click listener
        button.setOnClickListener {
            openActivitylogin()
        }
    }

    // Function to open login activity
    private fun openActivitylogin() {
        val intent = Intent(this, login::class.java)
        startActivity(intent)
    }
}