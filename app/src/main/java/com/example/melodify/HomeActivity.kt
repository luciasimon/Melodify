package com.example.melodify

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import com.example.melodify.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView.setOnTouchListener{v, event ->
            makeToast("Álbum de Metállica")
            false
        }
        binding.imageSong1.setOnTouchListener{v, event ->
            makeToast("Canción de The Weekend")
            false
        }
        binding.imageSong2.setOnTouchListener{v, event ->
            makeToast("Canción de Estopa")
            false
        }
        binding.imageSong3.setOnTouchListener{v, event ->
            makeToast("Canción de Dire Stairs")
            false
        }
        binding.imageArtist1.setOnTouchListener{v, event ->
            makeToast("Artista Bruno Mars")
            false
        }
        binding.imageArtist1.setOnTouchListener{v, event ->
            makeToast("Artista One Republic")
            false
        }
        binding.imageArtist1.setOnTouchListener{v, event ->
            makeToast("Artista Imagine Dragons")
            false
        }
    }
    /**
     * Método que genera un Toast con un mensaje.
     * @param message El mensaje que aparecerá en el Toast.
     */
    @SuppressLint("WrongConstant")
    fun makeToast(message: String){
        var duracion: Int = 50000
        var makeText = Toast.makeText(this, message, duracion)
        makeText.show()
    }
}