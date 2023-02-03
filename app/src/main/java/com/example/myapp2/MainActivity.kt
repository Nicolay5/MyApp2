package com.example.myapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonExit = findViewById<Button>(R.id.button2)
        val buttonStart = findViewById<Button>(R.id.button)
        buttonExit.setOnClickListener(this::exitApp)
        supportActionBar?.hide()
        buttonStart.setOnClickListener(this::startNew)
    }

    fun startNew(view: View){
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
    fun exitApp(view: View)  {
        finish()
    }



}