package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.appbar.MaterialToolbar

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Recupera os dados toolbar

        val toolbar = findViewById<MaterialToolbar>(R.id.toolbarResult)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        //Recupera os dados da intent

        val totalValue = intent.getDoubleExtra("DISTANCIA_CUSTO_TOTAL",0.0)
        val fuelPrice  = intent.getDoubleExtra("DISTANCIA_PRECO_COMBUSTIVEL", 0.0)
        val vehicleConsumption = intent.getIntExtra("DISTANCIA_CONSUMO_POR_LITRO", 0)
        val distance = intent.getIntExtra("DISTANCIA_DISTANCE_VALUE", 0)


        //Recuperando os dados
        val tvTotalViagem = findViewById<TextView>(R.id.tv_TotalViagemResult)
        val tvPreco = findViewById<TextView>(R.id.tvPrecoResult)
        val tvConsumo = findViewById<TextView>(R.id.tvConsumoResult)
        val tvDistancia = findViewById<TextView>(R.id.tvDistanciaResult)

        tvTotalViagem.text = totalValue.toString()
        tvPreco.text = fuelPrice.toString()
        tvConsumo.text = vehicleConsumption.toString()
        tvDistancia.text = distance.toString()

        //Recuperar o button


        val btnFazerOutroCalculo =findViewById<Button>(R.id.btn_FazeroutroCalculoResult)


        btnFazerOutroCalculo.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
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