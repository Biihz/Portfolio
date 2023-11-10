package com.example.salario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {
    lateinit var edSalario : EditText
    lateinit var rgopcoes : RadioGroup
    lateinit var btcalcular : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edSalario = findViewById<EditText>(R.id.edSalario)
        rgopcoes = findViewById<RadioGroup>(R.id.rgopcoes)
        btcalcular = findViewById<Button>(R.id.btCalcular)
        btcalcular.setOnClickListener{
         var salarioInicial = edSalario.text.toString().toDoubleOrNull()
         var percentualDeAumento: Double = when (rgopcoes.checkedRadioButtonId){
             R.id.option1 -> 40.0
             R.id.option2 -> 45.0
             R.id.option3 -> 50.0
             else -> 0.0
             }
            if (salarioInicial !=null) {
                val salarioFinal = salarioInicial + (salarioInicial * percentualDeAumento / 100)
                val dialogo = AlertDialog.Builder(this)
                dialogo.setTitle("AVISO")
                dialogo.setMessage("O salário final após o aumento é de $salarioFinal")
                dialogo.setNeutralButton("OK",null)
                dialogo.show()
            }else{
                val dialogo = AlertDialog.Builder(this)
                dialogo.setTitle("AVISO")
                dialogo.setMessage("Insira algum valor.")
                dialogo.setNeutralButton("OK", null)
                dialogo.show()
            }

        }

    }

}