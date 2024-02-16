package com.example.melodify

import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.melodify.databinding.ActivityPlayingSongBinding


class PlayingSongActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityPlayingSongBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_playing_song)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w = window // in Activity's onCreate() for instance
            w.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            )
        }

        binding.menuButton.setOnClickListener{
            Toast.makeText(this, "Menú", Toast.LENGTH_SHORT).show()
        }

        binding.heartButton.setOnClickListener{
            Toast.makeText(this, "Añadir a favoritos", Toast.LENGTH_SHORT).show()
        }

        binding.playButton.setOnClickListener{
            Toast.makeText(this, "Play", Toast.LENGTH_SHORT).show()
        }

        binding.nextSongButton.setOnClickListener{
            Toast.makeText(this, "Siguiente canción", Toast.LENGTH_SHORT).show()
        }

        binding.previousSongButton.setOnClickListener{
            Toast.makeText(this, "Canción anterior", Toast.LENGTH_SHORT).show()
        }

        binding.shuffleButton.setOnClickListener{
            Toast.makeText(this, "Aleatorio", Toast.LENGTH_SHORT).show()
        }
        binding.playlistButton.setOnClickListener{
            Toast.makeText(this, "Playlist", Toast.LENGTH_SHORT).show()
        }
    }
}