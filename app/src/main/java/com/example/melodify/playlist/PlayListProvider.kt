package com.example.melodify.playlist

import com.example.melodify.R

class PlayListProvider {

    companion object{

        // Lista estática de superhéroes
        val MusicList = listOf<Music>(
            Music(
                "It’s my life",
                "Jon Bon Jovi",
                R.drawable.img1,
            ),
            Music(
                "Drunk me",
                "Mitchell Tenpenny",
                R.drawable.img2,
            ),
            Music(
                "Attitude",
                "Misfits",
                R.drawable.img3,
            ),
            Music(
                "Enter Sandman",
                "Metallica",
                R.drawable.img4,
            ),
            Music(
                "My Love",
                "Westlife",
                R.drawable.img5,
            )

        )
    }
}