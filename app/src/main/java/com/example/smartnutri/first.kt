package com.example.smartnutri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class first : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        val click = findViewById<Button>(R.id.button)
        click.setOnClickListener{
            val intent =Intent(this,body_type::class.java)
            startActivity(intent)

        }
    }
}