package com.example.melodify.playlist

import PlayListViewHolder
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.melodify.R
import com.example.melodify.databinding.MusicItemBinding

class PlayListAdapter(
    private val musicList: List<Music>,
    private val onClickListener: (Music) -> Unit
) : RecyclerView.Adapter<PlayListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayListViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PlayListViewHolder(layoutInflater.inflate(R.layout.music_item, parent, false))
    }

    override fun getItemCount(): Int = musicList.size

    override fun onBindViewHolder(holder: PlayListViewHolder, position: Int) {
        val item = musicList[position]
        holder.bind(item, onClickListener)
    }
}