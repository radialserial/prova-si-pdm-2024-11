package com.radialserial.prova

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.radialserial.prova.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val services = listOf(
            Service("Bebidas") {
                startActivity(Intent(this, BebidasActivity::class.java))
            },
            Service("Comida") {
                Toast.makeText(this, "Ainda não servimos comida", Toast.LENGTH_SHORT).show()
            },
            Service("Mercearia") {
                Toast.makeText(this, "Ainda não trabalhamos com mercearia", Toast.LENGTH_SHORT)
                    .show()
            },
        )

        val adapter = ServiceListAdapter(services)

        with(binding.rvServiceList) {
            this.layoutManager = LinearLayoutManager(this@MainActivity)
            this.adapter = adapter
        }
    }
}