package com.example.melodify.recyclerview.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.melodify.databinding.ItemHistorialSongsBinding
import com.example.melodify.databinding.ItemListasCancionesBinding
import com.example.melodify.model.ListasCanciones

class ListaCancionesViewHolder (view: View): RecyclerView.ViewHolder(view) {
    private val binding = ItemListasCancionesBinding.bind(view)

    fun render(item: ListasCanciones, onClickListener: (ListasCanciones) -> Unit) {
        Glide.with(binding.imagenAvatar.context).load(item.image).into(binding.imagenAvatar)
        itemView.setOnClickListener { onClickListener(item) }
    }
}