package com.example.myweatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.`splashscreen.xml`)
        val startButton = findViewById<Button>(@+id/startbutton)

        val exitButton = findViewById<Button>(R.id.exitButton)



        startButton.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)

        }



        exitButton.setOnClickListener {

            finish()

        }

    }

}