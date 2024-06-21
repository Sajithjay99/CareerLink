package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class oppo : AppCompatActivity() {
    private lateinit var button: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_oppo)

        // Initialize button
        button = findViewById(R.id.resbtn)

        // Set click listener
        button.setOnClickListener {
            openActivityres()
        }
    }

    // Function to open resources activity
    private fun openActivityres() {
        val intent = Intent(this, res::class.java)
        startActivity(intent)
    }
}