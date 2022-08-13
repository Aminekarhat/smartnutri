package com.example.smartnutri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.smartnutri.databinding.ActivityCutBinding


class cut : AppCompatActivity() {
    
 private lateinit var binding: ActivityCutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cut)

        val botona4 = findViewById<Button>(R.id.button4)
        botona4.setOnClickListener{
            val intent = Intent(this,notification1::class.java)
            startActivity(intent)
        }

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