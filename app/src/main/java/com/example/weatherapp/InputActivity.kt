package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.lang.NumberFormatException

class InputActivity : AppCompatActivity() {

    private lateinit var etDay: EditText
    private lateinit var etMin: EditText
    private lateinit var etMax: EditText
    private lateinit var etWeatherCondition: EditText
    private lateinit var buttonSave: Button
    private lateinit var buttonClear: Button
    private lateinit var buttonDisplay: Button

    private var dayList = mutableListOf<String>()
    private var minList = mutableListOf<Float>()
    private var maxList = mutableListOf<Float>()
    private var weatherconditionList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        etDay = findViewById(R.id.etDay)
        etMin = findViewById(R.id.etMin)
        etMax = findViewById(R.id.etMax)
        etWeatherCondition = findViewById(R.id.etWeatherCondition)
        buttonSave = findViewById(R.id.buttonSave)
        buttonClear = findViewById(R.id.buttonClear)
        buttonDisplay = findViewById(R.id.buttonDisplay)

        buttonClear.setOnClickListener {
            etDay.setText("")
            etMin.setText("")
            etMax.setText("")
            etWeatherCondition.setText("")
        }

        buttonSave.setOnClickListener {
            val realday = etDay.text.toString()
            val realmin = etMin.text.toString()
            val realmax = etMax.text.toString()
            val realweathercondition = etWeatherCondition.text.toString()
            if (realday.isNotEmpty()&& realmin.isNotEmpty()&& realmax.isNotEmpty()&& realweathercondition.isNotEmpty()){
                try {
                    dayList.add(realday)
                    minList.add(realmin.toFloat())
                    maxList.add(realmin.toFloat())
                    weatherconditionList.add(realweathercondition)
                    etDay.setText("")
                    etMin.setText("")
                    etMax.setText("")
                    etWeatherCondition.setText("")
                }
                catch (e: NumberFormatException){

                }

            }

        }

        buttonDisplay.setOnClickListener {
            val intent2= Intent(this,DisplayActivity::class.java)
            intent2.putExtra("dayArray",dayList.toTypedArray())
            intent2.putExtra("minArray",minList.toTypedArray())
            intent2.putExtra("maxArray",maxList.toTypedArray())
            intent2.putExtra("weatherconditionArray",weatherconditionList.toTypedArray())
            startActivity(intent2)
        }
    }
}