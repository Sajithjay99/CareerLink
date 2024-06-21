package com.example.labexam02

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profile : AppCompatActivity() {
    private lateinit var button: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        // Initialize button
        button = findViewById(R.id.logoutbtn)

        // Set click listener
        button.setOnClickListener {
            openActivitylogin()
        }
    }

    // Function to open home activity
    private fun openActivitylogin() {
        val intent = Intent(this, login::class.java)
        startActivity(intent)
    }
}