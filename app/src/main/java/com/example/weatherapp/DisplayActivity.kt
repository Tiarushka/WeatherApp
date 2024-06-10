package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.lang.StringBuilder

class DisplayActivity : AppCompatActivity() {

    private lateinit var textViewDay: TextView
    private lateinit var textViewMin: TextView
    private lateinit var textViewMax: TextView
    private lateinit var textViewWeatherCondition: TextView
    private lateinit var buttonBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)
        textViewDay = findViewById(R.id.textviewDay)
        textViewMin = findViewById(R.id.textviewMin)
        textViewMax = findViewById(R.id.textviewMax)
        textViewWeatherCondition = findViewById(R.id.textviewWeatherCondition)
        buttonBack = findViewById(R.id.buttonBack)

        val arrayDay = intent.getStringArrayExtra("dayArray")?.toList()?: emptyList()
        val arrayMin = intent.getStringArrayExtra("minArray")?.toList()?: emptyList()
        val arrayMax = intent.getStringArrayExtra("maxArray")?.toList()?: emptyList()
        val arrayWeatherCondition = intent.getStringArrayExtra("weatherconditionArray")?.toList()?: emptyList()

        var dayed = StringBuilder()
        for ((index, day) in arrayDay.withIndex()){
            dayed.append("Day: ${index} : $day")
        }
        var min = StringBuilder()
        for ((index, day) in arrayMin.withIndex()) {
            dayed.append("time: ${index} : $day")
        }
        var max = StringBuilder()
        for ((index, day) in arrayMax.withIndex()) {
            dayed.append("time: ${index} : $day")
        }
        var weathercondition = StringBuilder()
        for ((index, day) in arrayWeatherCondition.withIndex()) {
            dayed.append("time: ${index} : $day")
    }
}