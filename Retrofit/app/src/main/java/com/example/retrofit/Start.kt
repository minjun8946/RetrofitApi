package com.example.retrofit


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Start : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val max20 : Button =findViewById(R.id.max20)
        val max25 : Button = findViewById(R.id.max25)
        val max30 : Button = findViewById(R.id.max30)

        max20.setOnClickListener{
            val intent = Intent(this, Game1::class.java)
            startActivity(intent)
        }
        max25.setOnClickListener{
            val intent = Intent(this, Game2::class.java)
            startActivity(intent)
        }

        max30.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}