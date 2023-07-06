package com.example.calculatorandoridapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //variable declarations
    lateinit var calculation: EditText
    lateinit var result: EditText
    var calc: String =""
    var res: String =""


    lateinit var btn_ac: Button
    lateinit var btn_backspace: Button
    lateinit var btn0: Button
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
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
    var operator:String =""
    var parts:String = ""
    var num1: Float = 0.0F
    var num2: Float = 0.0F
    var result_num: Float = 0.0F

    fun calculation_disp(calc:String) {
        calculation.setText(calc)
    }

    fun result_disp(res:String) {
            result.setText(res)
    }

    fun seperation(s1:String)
    {
        try {
            val part = calc.split(" ")
            num1 = part[0].toFloat()
            operator = part[1].toString()
            num2 = part[2].toFloat()
        }
        catch (e: NumberFormatException) {
            println("Invalid number format")
        }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculation = findViewById(R.id.calculation)
        result = findViewById(R.id.result)
        btn_ac = findViewById(R.id.AC)
        btn_backspace = findViewById(R.id.BACKSPACE)
        btn0 = findViewById(R.id.Zero)
        btn1 = findViewById(R.id.One)
        btn2 = findViewById(R.id.Two)
        btn3 = findViewById(R.id.Three)
        btn4 = findViewById(R.id.Four)
        btn5 = findViewById(R.id.Five)
        btn6 = findViewById(R.id.Six)
        btn7 = findViewById(R.id.Seven)
        btn8 = findViewById(R.id.Eight)
        btn9 = findViewById(R.id.Nine)
        decimal = findViewById(R.id.Decimal)
        divide = findViewById(R.id.Divide)
        multiply = findViewById(R.id.Multiply)
        subtract = findViewById(R.id.Subtract)
        add = findViewById(R.id.Plus)
        equalsto = findViewById(R.id.Equalsto)

        // Code to execute when the buttons are clicked

        btn0.setOnClickListener {
            calc += "0"
            calculation_disp(calc)
        }

        btn1.setOnClickListener {

            calc += "1"
            calculation_disp(calc)
        }

        btn2.setOnClickListener {
            calc += "2"
            calculation_disp(calc)
        }

        btn3.setOnClickListener {
            calc += "3"
            calculation_disp(calc)
        }

        btn4.setOnClickListener {
            calc += "4"
            calculation_disp(calc)
        }

        btn5.setOnClickListener {
            calc += "5"
            calculation_disp(calc)
        }

        btn6.setOnClickListener {
            calc += "6"
            calculation_disp(calc)
        }

        btn7.setOnClickListener {
            calc += "7"
            calculation_disp(calc)
        }

        btn8.setOnClickListener {
            calc += "8"
            calculation_disp(calc)
        }

        btn9.setOnClickListener {
            calc += "9"
            calculation_disp(calc)
        }

        btn_backspace.setOnClickListener {
            if (calc.length != null) {
                calc = calc.dropLast(1)
                calculation_disp(calc)
            }
        }

        decimal.setOnClickListener {
            if(calc.isEmpty()) {
                calc += ".0"
                calculation_disp(calc)
            }
            else if(calc.isNotEmpty()){
                calc += "."
                calculation_disp(calc)
            }
        }

        add.setOnClickListener {
            calc += " + "
            operator="+"
            calculation_disp(calc)
        }

        subtract.setOnClickListener {
            calc += " - "
            operator="-"
            calculation_disp(calc)
        }

        multiply.setOnClickListener {
            calc += " * "
            operator="*"
            calculation_disp(calc)
        }

        divide.setOnClickListener {
            calc += " / "
            operator="/"
            calculation_disp(calc)
        }

        btn_ac.setOnClickListener {
            calc = ""
            res = ""
            calculation_disp(calc)
            result_disp(res)
        }

        //parts = calc.split(" ").toString()


        equalsto.setOnClickListener{

            when(operator) {
                "+" -> {
                    seperation(calc)
                    res= (num1+num2).toString()
                    result_disp(res)
                }

                "-" -> {
                    seperation(calc)
                    res= (num1-num2).toString()
                    result_disp(res)
                }

                "*" -> {
                    seperation(calc)
                    res=(num1*num2).toString()
                    result_disp(res)
                }

                "/" -> {
                    seperation(calc)
                    res=(num1/num2).toString()
                    result_disp(res)
                }
            }

        }

    }



}

