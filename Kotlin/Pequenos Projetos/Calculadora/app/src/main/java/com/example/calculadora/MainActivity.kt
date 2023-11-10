package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ednum1 = findViewById<EditText>(R.id.edtnum1)
        val ednum2 = findViewById<EditText>(R.id.edtnum2)
        val total = findViewById<EditText>(R.id.edtresultado)
        val somar = findViewById<Button>(R.id.btn1)
        val subtrair = findViewById<Button>(R.id.btn2)
        val multiplicar = findViewById<Button>(R.id.btn3)
        val dividir = findViewById<Button>(R.id.btn4)

        somar.setOnClickListener{
            val num1 = ednum1.text.toString().toDouble()
            val num2 = ednum2.text.toString().toDouble()
            val result = num1 + num2
            total.setText(result.toString())
        }
        subtrair.setOnClickListener{
            val num1 = ednum1.text.toString().toDouble()
            val num2 = ednum2.text.toString().toDouble()
            val result = num1 - num2
            total.setText(result.toString())
        }
        multiplicar.setOnClickListener{
            val num1 = ednum1.text.toString().toDouble()
            val num2 = ednum2.text.toString().toDouble()
            val result = num1 * num2
            total.setText(result.toString())
        }
        dividir.setOnClickListener{
            val num1 = ednum1.text.toString().toDouble()
            val num2 = ednum2.text.toString().toDouble()
            if (num2 > 0) {
            val result = num1 / num2
            total.setText(result.toString())
        } else {
            total.setText("Divisão por Zero!")
        }
    }
}

}