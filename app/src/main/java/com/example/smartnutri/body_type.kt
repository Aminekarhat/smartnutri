package com.example.smartnutri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class body_type : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_body_type)
        val fatt=findViewById<Button>(R.id.button3)
        fatt.setOnClickListener{
            val intent = Intent(this,fat::class.java)
            startActivity(intent)
        }

        val cutt=findViewById<Button>(R.id.button5)
        cutt.setOnClickListener{
            val intent = Intent(this,cut::class.java)
            startActivity(intent)
        }

        val bulkk=findViewById<Button>(R.id.button4)
        bulkk.setOnClickListener{
            val intent = Intent(this,bulk::class.java)
            startActivity(intent)
        }
    }
}