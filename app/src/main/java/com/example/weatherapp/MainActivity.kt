package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var textView2: TextView
    private lateinit var buttonNext: Button
    private lateinit var buttonExit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textview)
        textView2 = findViewById(R.id.textview2)
        buttonNext = findViewById(R.id.buttonNext)
        buttonExit = findViewById(R.id.buttonExit)

        buttonNext.setOnClickListener{

            val intent= Intent(this,InputActivity::class.java)
            startActivity(intent)
        }


    }
}