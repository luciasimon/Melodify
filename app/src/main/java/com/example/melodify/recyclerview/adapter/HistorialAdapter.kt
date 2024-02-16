package com.example.melodify.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.melodify.R
import com.example.melodify.model.CancionHistorial

class HistorialAdapter (
    private val cancionHistorialList: List<CancionHistorial>,
    private val onClickListener: (CancionHistorial) -> Unit
) : RecyclerView.Adapter<HistorialViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistorialViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HistorialViewHolder(layoutInflater.inflate(R.layout.item_historial_songs, parent, false))
    }

    override fun onBindViewHolder(holder: HistorialViewHolder, position: Int) {
        val item = cancionHistorialList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int = cancionHistorialList.size

}