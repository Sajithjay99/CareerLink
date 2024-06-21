package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val SPLASH_SCREEN: Long = 5000

    // Variables
    private lateinit var topAnim: Animation
    private lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.logoonb2)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Animations
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)

        // Hooks
        image = findViewById(R.id.logoimg)

        image.startAnimation(topAnim)

        Handler().postDelayed({
            val intent = Intent(this@MainActivity, Onboard1::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_SCREEN)
    }
}
