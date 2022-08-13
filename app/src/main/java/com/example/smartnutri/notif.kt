package com.example.smartnutri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smartnutri.databinding.ActivityNotifBinding

class notif : AppCompatActivity() {
    private lateinit var binding : ActivityNotifBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notif)
    }
}