package com.example.melodify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val intent = Intent(this, UserActivity::class.java)
        
        val intent = Intent(this, PlayingSongActivity::class.java)
        startActivity(intent)
    }


}