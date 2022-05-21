package com.example.blink

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBlink = findViewById<Button>(R.id.blink)
        btnBlink.setOnClickListener {
            val image = findViewById<ImageView>(R.id.imageView)
            val animation:Animation = AnimationUtils.loadAnimation(this@MainActivity,R.anim.blink)
            image.startAnimation(animation)
        }
    }
}