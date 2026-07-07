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

class VehicleConsumptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_vehicle_consumption)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Recupera os dados toolbar

        val toolbar = findViewById<MaterialToolbar>(R.id.toolbarVehicleConsumption)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        //Recupera dados da intent tela anterior
        val precoCombustivel = intent.getDoubleExtra("PRECO_COMBUSTIVEL",0.0)
        println("LOG CARLOS $precoCombustivel")



        //Recupera dados do edt
        val edtConsumoPorLitro = findViewById<EditText>(R.id.edtVehicleConsumption)

        //Recuperar o button


        val btnProximo = findViewById<Button>(R.id.btn_ProximoVehicleConsumption)

        btnProximo.setOnClickListener {
            val edtVehicleConsumtpionValue = edtConsumoPorLitro.text.toString().toIntOrNull()
            if (edtVehicleConsumtpionValue == null) {
                edtConsumoPorLitro.error = "Informe o Consumo"
                return@setOnClickListener
            }
            val intent = Intent(this, DistanceActivity::class.java)
            intent.putExtra("CONSUMO_POR_LITRO", edtVehicleConsumtpionValue)
            intent.putExtra("PRECO_COMBUSTIVEL", precoCombustivel)
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