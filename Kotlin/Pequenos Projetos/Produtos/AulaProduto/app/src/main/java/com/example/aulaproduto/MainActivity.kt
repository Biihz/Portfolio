package com.example.aulaproduto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {
 lateinit var chkArroz: CheckBox
 lateinit var chkFeijao: CheckBox
 lateinit var chkLeite: CheckBox
 lateinit var chkMacarrao: CheckBox
 lateinit var chkRefrigerante: CheckBox
 lateinit var bbtotal: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)

         chkArroz = findViewById<CheckBox>(R.id.chk1)
        chkFeijao = findViewById<CheckBox>(R.id.chk2)
        chkLeite = findViewById<CheckBox>(R.id.chk5)
        chkMacarrao = findViewById<CheckBox>(R.id.chk3)
        chkRefrigerante = findViewById<CheckBox>(R.id.chk4)
        bbtotal = findViewById<Button>(R.id.bttotal)
        title = "Mercadinho da Bea"
        bbtotal.setOnClickListener {
            var total = 0.0
            if (chkArroz.isChecked){
                total += 10.00
            }
            if (chkFeijao.isChecked){
                total += 3.50
            }
            if (chkMacarrao.isChecked) {
                total += 3.00
            }
            if (chkRefrigerante.isChecked){
                total += 4.90
            }
            if (chkLeite.isChecked){
                total += 4.00
            }
            val dial = AlertDialog.Builder(this)
            dial.setTitle("AVISO")
            dial.setMessage("Valor total da(s) compra(s): R$ $total")
            dial.setNeutralButton("OK", null)
            dial.show()
            }
        }
    }
