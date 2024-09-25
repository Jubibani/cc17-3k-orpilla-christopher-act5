package com.example.artspaceapp

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // if landscape
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.activity_main_landscape4)  // Load landscape layout
        } else {
            setContentView(R.layout.activity_main4)  // Load portrait layout
        }

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