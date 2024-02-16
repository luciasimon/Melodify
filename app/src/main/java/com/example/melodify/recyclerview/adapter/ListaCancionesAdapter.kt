package com.example.melodify.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.melodify.R
import com.example.melodify.model.ListasCanciones

class ListaCancionesAdapter (
    private val listasCancionesList: List<ListasCanciones>,
    private val onClickListener: (ListasCanciones) -> Unit
) : RecyclerView.Adapter<ListaCancionesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaCancionesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ListaCancionesViewHolder(layoutInflater.inflate(R.layout.item_listas_canciones, parent, false))
    }

    override fun onBindViewHolder(holder: ListaCancionesViewHolder, position: Int) {
        val item = listasCancionesList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int = listasCancionesList.size

}