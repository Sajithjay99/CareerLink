package com.example.labexam02

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class home : AppCompatActivity() {
    private lateinit var abutton: Button
    private lateinit var obutton: ImageButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        // Initialize button
        abutton = findViewById(R.id.Applybtn)

        // Set click listener
        abutton.setOnClickListener {
            openActivityapply()
        }

        // Initialize button
        obutton = findViewById(R.id.oppobtn)

        // Set click listener

        obutton.setOnClickListener {
            openActivityoppo()
        }
    }


    // Function to open home activity
    private fun openActivityapply() {
        val intent = Intent(this, apply::class.java)
        startActivity(intent)
    }
    // Function to open home activity
    private fun openActivityoppo() {
        val intent = Intent(this, oppo::class.java)
        startActivity(intent)
    }
}