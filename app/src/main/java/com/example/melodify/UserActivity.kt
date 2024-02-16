package com.example.melodify

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.melodify.databinding.ActivityUserBinding
import com.example.melodify.model.CancionHistorial
import com.example.melodify.model.ListasCanciones
import com.example.melodify.recyclerview.HistorialProvider
import com.example.melodify.recyclerview.ListaCancionesProvider
import com.example.melodify.recyclerview.adapter.HistorialAdapter
import com.example.melodify.recyclerview.adapter.ListaCancionesAdapter

class UserActivity: AppCompatActivity() {

    private lateinit var binding: ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Glide.with(binding.imageViewImagenUsuario.context).load(R.drawable.avatar_default_svgrepo_com).into(binding.imageViewImagenUsuario)


        initRecyclerView()
    }


    private fun initRecyclerView() {
        initRecyclerViewHistorial()
        initRecyclerListasCanciones()
    }

    private fun initRecyclerListasCanciones() {
        val manager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerViewListas.layoutManager = manager

        binding.recyclerViewListas.adapter =
            ListaCancionesAdapter(ListaCancionesProvider.listasCanciones) { lista ->
                onItemSelectedListaCanciones(
                    lista
                )
            }
    }

    private fun onItemSelectedListaCanciones(lista: ListasCanciones) {
        Toast.makeText(this, lista.name, Toast.LENGTH_SHORT).show()
    }

    private fun initRecyclerViewHistorial() {
        binding.recyclerViewHistorial.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewHistorial.adapter =
            HistorialAdapter(HistorialProvider.cancionList) { persona ->
                onItemSelectedHistorial(
                    persona
                )
            }
    }

    private fun onItemSelectedHistorial(cancion: CancionHistorial) {
        Toast.makeText(this, cancion.nombreCancion, Toast.LENGTH_SHORT).show()
    }
}