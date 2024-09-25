package com.example.artspaceapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)

        val backButton : Button = findViewById(R.id.button)
        val nextButton : Button = findViewById(R.id.button2)

        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

        }

        nextButton.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)

        }
    }
}