package com.example.labexam02

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class apply : AppCompatActivity() {
    private lateinit var button: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_apply)

        // Initialize button
        button = findViewById(R.id.backbtn)

        // Set click listener
        button.setOnClickListener {
            openActivityhome()
        }
    }

    // Function to open home activity
    private fun openActivityhome() {
        val intent = Intent(this, home::class.java)
        startActivity(intent)
    }
}