package com.example.smartnutri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.ActionBarDrawerToggle
import com.example.smartnutri.databinding.ActivityBodyTypeBinding
import com.example.smartnutri.databinding.ActivityCutBinding

class body_type : AppCompatActivity() {
    private lateinit var binding: ActivityBodyTypeBinding
    private lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBodyTypeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
          toggle = ActionBarDrawerToggle(this@body_type,mous,R.string.open,R.string.close)
            mous.addDrawerListener(toggle)
            toggle.syncState()

            supportActionBar?.setDisplayHomeAsUpEnabled(true)

            navView.setNavigationItemSelectedListener {
                when(it.itemId){
                    R.id.losef->{}

                    R.id.bulk->{}
                    R.id.cut->{}
                }
                true
            }
        }
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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            true
        }
        return super.onOptionsItemSelected(item)
    }

}