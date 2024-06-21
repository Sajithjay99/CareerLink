package com.example.labexam02

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class res : AppCompatActivity() {
    private lateinit var button: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_res)

        // Initialize button
        button = findViewById(R.id.profilebtn3)

        // Set click listener
        button.setOnClickListener {
            openActivityprofile()
        }
    }

    // Function to open profile activity
    private fun openActivityprofile() {
        val intent = Intent(this, profile::class.java)
        startActivity(intent)
    }
}