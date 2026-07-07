package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.appbar.MaterialToolbar

class DistanceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_distance)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Recupera os dados toolbar

        val toolbar = findViewById<MaterialToolbar>(R.id.toolbarDistance)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        //Recupera dados da intent
        val precoCombustivel = intent.getDoubleExtra("PRECO_COMBUSTIVEL",0.0)
        println("LOG CARLOS $precoCombustivel")
        val vehicleConsumption = intent.getIntExtra("CONSUMO_POR_LITRO",0)
        println("LOG CARLOS $vehicleConsumption")


        //Recuoera dados do edt
        val edtDistancia = findViewById<EditText>(R.id.edt_distance)
        //Recuperar o button


        val btnVerResultado = findViewById<Button>(R.id.btn_VerResultadoDistance)


        btnVerResultado.setOnClickListener {

            val distancia = edtDistancia.text.toString().toIntOrNull()
            if (distancia == null) {
                edtDistancia.error = "Informe a distância"
                return@setOnClickListener
            }
            val consumo = vehicleConsumption
            val precoLitro = precoCombustivel

            //Calculo de litros necessarios
            val litrosNecessarios = distancia / consumo

            //Calculo do custo total
            val custoTotal = litrosNecessarios * precoLitro

            //Navegação para proxima tela

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("DISTANCIA_PRECO_COMBUSTIVEL", precoLitro)
            intent.putExtra("DISTANCIA_CONSUMO_POR_LITRO",consumo)
            intent.putExtra("DISTANCIA_DISTANCE_VALUE", distancia)
            intent.putExtra("DISTANCIA_CUSTO_TOTAL", custoTotal)
            startActivity(intent)

        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            android.R.id.home ->{
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}