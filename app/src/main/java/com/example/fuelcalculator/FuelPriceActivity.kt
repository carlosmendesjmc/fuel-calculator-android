package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.appbar.MaterialToolbar

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

        //Recupera os dados toolbar

        val toolbar = findViewById<MaterialToolbar>(R.id.toolbarFuelPrice)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        //Recupera dados edt

        val edtPrecoCombustivel = findViewById<TextView>(R.id.edt_FuelPriceScreen)

        //Recuperar o button


        val btnProximo = findViewById<Button>(R.id.btn_ProximoFuelPrice)


        btnProximo.setOnClickListener {
            val edtFuelPriceValue = edtPrecoCombustivel.text.toString().toDouble()
            val intent = Intent(this, VehicleConsumptionActivity::class.java)
            intent.putExtra("PRECO_COMBUSTIVEL", edtFuelPriceValue)
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