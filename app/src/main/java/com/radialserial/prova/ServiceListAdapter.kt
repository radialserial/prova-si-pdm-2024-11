package com.radialserial.prova

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ServiceListAdapter(private val services: List<Service>) :
    RecyclerView.Adapter<ServiceListAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(
                    R.layout.service_item,
                    parent,
                    false,
                )
        )
    }

    override fun getItemCount(): Int {
        return services.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentService = services[position]

        with(holder.itemView) {
            this.findViewById<TextView>(R.id.tvServiceName).text = currentService.name
            this.findViewById<TextView>(R.id.tvServiceName).setOnClickListener {
                currentService.callback.invoke()
            }
        }
    }

}
