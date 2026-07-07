package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FuelPriceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fuel_price)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Recupera dados

        val edtPrecoCombustivel = findViewById<TextView>(R.id.edt_FuelPriceScreen)

        //Recuperar o button

        val btnVoltar = findViewById<Button>(R.id.btn_VoltarFuelPrice)
        val btnProximo = findViewById<Button>(R.id.btn_ProximoFuelPrice)

        btnVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnProximo.setOnClickListener {
            val edtFuelPriceValue = edtPrecoCombustivel.text.toString().toDouble()
            val intent = Intent(this, VehicleConsumptionActivity::class.java)
            intent.putExtra("PRECO_COMBUSTIVEL", edtFuelPriceValue)
            startActivity(intent)
        }


    }
}