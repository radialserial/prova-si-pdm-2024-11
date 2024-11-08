package com.radialserial.prova

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DrinkListAdapter(
    private val drinks: List<Drink>,
    val callback: (Drink) -> Unit
) :
    RecyclerView.Adapter<DrinkListAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(
                    R.layout.drink_item,
                    parent,
                    false
                )
        )
    }

    override fun getItemCount(): Int {
        return drinks.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentDrink = drinks[position]

        with(holder.itemView.findViewById<TextView>(R.id.tvDrinkName)) {
            text = currentDrink.name
            setOnClickListener { callback(currentDrink) }
        }

    }
}
