package com.example.bitamusicplayer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MusicAdapter(var musicList: MutableList<Music>):
    RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MusicViewHolder {
        val context =  viewGroup.context
        val inflater= LayoutInflater.from(context)
        val shouldAttachToParentImmediately = false
        val view = inflater.inflate(R.layout.music_item,viewGroup, shouldAttachToParentImmediately)
        return MusicViewHolder(view)
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        val item = musicList[position]
        holder.bindMusic(item)
    }

    override fun getItemCount(): Int {
        return musicList.size
    }

    class MusicViewHolder(v: View): RecyclerView.ViewHolder(v), View.OnClickListener {
        private var view: View = v
        private lateinit var music: Music
        private var artistName: TextView = view.findViewById(R.id.artist_textView)
        private var songName: TextView = view.findViewById(R.id.song_textView)

        init {
            view.setOnClickListener(this)
        }

        fun bindMusic (music: Music){
            this.music = music
            artistName.text = music.artistName
            songName.text = music.songName
        }

        override fun onClick(p0: View?) {
            TODO("Not yet implemented")
        }

    }
}