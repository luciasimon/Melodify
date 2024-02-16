package com.example.melodify.playlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.melodify.R
import com.example.melodify.databinding.ActivityPlayListBinding

class PlayList : AppCompatActivity() {
    private lateinit var binding: ActivityPlayListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.navMenu.setSelectedItemId(R.id.playlist)

        // Inicializar RecyclerView
        initRecyclerView()

        binding.imageView4.setOnClickListener {
            Toast.makeText(this, "you click play songs", Toast.LENGTH_SHORT).show()
        }

        binding.imageView3.setOnClickListener {
            Toast.makeText(this, "you click shuffle songs", Toast.LENGTH_SHORT).show()
        }
    }

    private fun initRecyclerView() {
        val decoration = DividerItemDecoration(this, LinearLayoutManager(this).orientation)

        binding.playlist.layoutManager = LinearLayoutManager(this)

        // Creación y establecimiento del adaptador del RecyclerView
        binding.playlist.adapter = PlayListAdapter(
            PlayListProvider.MusicList
        ) { music ->
            // Manejar la selección de música aquí
            onItemSelected(music)
        }

        // Añadir el DividerItemDecoration al RecyclerView
        binding.playlist.addItemDecoration(decoration)
    }

    // Función que maneja la selección de una música
    private fun onItemSelected(music: Music) {
        Toast.makeText(this, "${music.singer+": "+music.song}", Toast.LENGTH_SHORT).show()
    }
}
