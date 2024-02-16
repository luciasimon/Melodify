package com.example.melodify.recyclerview.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.melodify.databinding.ItemHistorialSongsBinding
import com.example.melodify.model.CancionHistorial

class HistorialViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private val binding = ItemHistorialSongsBinding.bind(view)

    fun render(item: CancionHistorial, onClickListener: (CancionHistorial) -> Unit) {
        binding.textViewNombreCancion.text = item.nombreCancion
        Glide.with(binding.imageViewCancionHistorial.context).load(item.imageUrl).into(binding.imageViewCancionHistorial)

        itemView.setOnClickListener { onClickListener(item) }

    }
}