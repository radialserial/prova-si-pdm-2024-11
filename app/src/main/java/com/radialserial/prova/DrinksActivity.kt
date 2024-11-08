package com.radialserial.prova

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.radialserial.prova.databinding.ActivityDrinksBinding

class DrinksActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDrinksBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityDrinksBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val adapter =
            DrinkListAdapter(
                Drink.getDrinks()
            ) { drink ->
                startActivity(
                    Intent(this, DrinkDetailsActivity::class.java).also {
                        it.putExtra("drinkName", drink.name)
                        it.putExtra("drinkDescription", drink.description)
                        it.putExtra("drinkImageId", drink.imageId)
                    }
                )
            }

        with(binding) {
            rvDrinksList.layoutManager = LinearLayoutManager(this@DrinksActivity)
            rvDrinksList.adapter = adapter
        }
    }
}