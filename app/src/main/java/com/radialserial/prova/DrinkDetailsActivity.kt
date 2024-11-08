package com.radialserial.prova

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.radialserial.prova.databinding.ActivityDrinkDetailsBinding

class DrinkDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDrinkDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityDrinkDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val drink = Drink(
            intent.getStringExtra("drinkName")!!,
            intent.getStringExtra("drinkDescription")!!,
            intent.getIntExtra("drinkImageId", -1),
        )

        with(binding) {
            ivDrinkPicture.setImageResource(drink.imageId)
            tvDrinkName.text = drink.name
            tvDrinkDescription.text = drink.description
        }

    }
}