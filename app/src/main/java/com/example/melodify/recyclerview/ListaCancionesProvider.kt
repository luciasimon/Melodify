package com.example.melodify.recyclerview

import com.example.melodify.R
import com.example.melodify.model.ListasCanciones

class ListaCancionesProvider(hipHop: Int) {
    companion object {
        val listasCanciones: List<ListasCanciones> = listOf(
            ListasCanciones(
                image = R.drawable.hip_hop,
                name = "Hip Hop"
            ),
            ListasCanciones(
                image = R.drawable.latin,
                name = "Latin"
                ),
            ListasCanciones(
                image = R.drawable.metal,
                name = "Metal"
                ),
            ListasCanciones(
                image = R.drawable.podcast,
                name = "Podcast"
                ),
            ListasCanciones(
                image = R.drawable.rock,
                name = "Rock"
            ),
        )
    }
}