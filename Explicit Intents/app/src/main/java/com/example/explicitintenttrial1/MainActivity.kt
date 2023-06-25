package com.example.explicitintenttrial1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
//if your other activity open when app launches, check manifest file when activity is set as Launcher Activity, in other words your main ativity page should be on top
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnIntent= findViewById<Button>(R.id.button)

        btnIntent.setOnClickListener{
            //open a new activity
            intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}