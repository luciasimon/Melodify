package com.example.melodify

import android.accounts.Account
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.melodify.databinding.ActivityMainBinding
import com.example.melodify.databinding.ActivityPlayListBinding
import com.example.melodify.playlist.PlayList

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Infla el layout usando el binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Crear intent para la actividad de la lista de reproducción
        val intent = Intent(this, PlayList::class.java)
        startActivity(intent)

        // binding.menu1.setSelectedItemId(R.id.principal);
        //setupBottomNavigationView()

    }
}
