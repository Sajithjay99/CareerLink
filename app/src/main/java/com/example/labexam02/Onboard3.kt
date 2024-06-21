package com.example.labexam02

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Onboard3 : AppCompatActivity() {

    private lateinit var button: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard3)

        // Initialize button
        button = findViewById(R.id.onb2button)

        // Set click listener
        button.setOnClickListener {
            openActivityOnboard4()
        }
    }

    // Function to open Onboard4 activity
    private fun openActivityOnboard4() {
        val intent = Intent(this, Onboard4::class.java)
        startActivity(intent)
    }
}