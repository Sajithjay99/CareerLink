package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Onboard1 : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard2)

        // Initialize button
        button = findViewById(R.id.onb1button)

        // Set click listener
        button.setOnClickListener {
            openActivityOnboard3()
        }
    }

    // Function to open Onboard3 activity
    private fun openActivityOnboard3() {
        val intent = Intent(this, Onboard3::class.java)
        startActivity(intent)
    }
}
