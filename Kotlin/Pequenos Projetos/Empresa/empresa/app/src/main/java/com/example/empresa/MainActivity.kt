package com.example.empresa

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.empresa.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btncliente.setOnClickListener(){
            //vamos criar um valor usando val + intent. (this) serve para puxar a janela
            val pagina1 = Intent(this, Detalhes_Cliente::class.java)
            // iniciar variavel correspodente a outra tela
            startActivity(pagina1)
        }
        binding.btncontato.setOnClickListener(){
            val pagina2 = Intent(this, Detalhes_Contato::class.java)
            startActivity(pagina2)
        }
        binding.btnempresa.setOnClickListener(){
            val pagina3 = Intent(this, Detalhes_Empresa::class.java)
            startActivity(pagina3)
        }
        binding.btnservicos.setOnClickListener(){
            val pagina4 = Intent(this, Detalhes_Servicos::class.java)
            startActivity(pagina4)
        }

    }
}