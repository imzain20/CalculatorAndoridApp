package com.example.calculatorandoridapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    //variable declarations
    lateinit var calculation: EditText
    lateinit var result: EditText
    lateinit var calc: String
    lateinit var res: String

    lateinit var btn0: Button
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn4: Button
    lateinit var btn5: Button
    lateinit var btn6: Button
    lateinit var btn7: Button
    lateinit var btn8: Button
    lateinit var btn9: Button
    lateinit var subtract: Button
    lateinit var add: Button
    lateinit var divide: Button
    lateinit var multiply: Button
    lateinit var equalsto: Button
    lateinit var decimal: Button

/*
    fun calculation_disp() {
        val calc = "2+3"
        calculation.setText(calc)
    }
*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculation = findViewById(R.id.calculation)
        result = findViewById(R.id.result)
//        calculation_disp()
    }




}

