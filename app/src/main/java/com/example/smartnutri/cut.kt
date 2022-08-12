package com.example.smartnutri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton


class cut : AppCompatActivity() {
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cut)
       val botona = findViewById<ImageButton>(R.id.imageButton9)
        botona.setOnClickListener{
            val intent = Intent(this,chicken_salad::class.java)
            startActivity(intent)
        }
        val botona2 = findViewById<ImageButton>(R.id.imageButton)
        botona2.setOnClickListener{
            val intent = Intent(this,vegeta::class.java)
            startActivity(intent)
        }
        val botona3 = findViewById<ImageButton>(R.id.imageButton2)
        botona3.setOnClickListener{
            val intent = Intent(this,beef::class.java)
            startActivity(intent)
        }


    }

}