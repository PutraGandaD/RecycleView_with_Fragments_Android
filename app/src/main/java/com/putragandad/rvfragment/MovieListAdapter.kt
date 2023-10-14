package com.putragandad.rvfragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieListAdapter (private val MovieList: ArrayList<MovieList>) :
    RecyclerView.Adapter<MovieListAdapter.movieViewHolder>(){

    class movieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivMovie : ImageView = itemView.findViewById(R.id.iv_movie)
        val tvTitle : TextView = itemView.findViewById(R.id.tv_title)
        val tvYear : TextView = itemView.findViewById(R.id.tv_year)
        val tvActor : TextView = itemView.findViewById(R.id.tv_actor)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): movieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movielist, parent, false)
        return movieViewHolder(view)
    }

    override fun getItemCount(): Int {
        return MovieList.size
    }

    override fun onBindViewHolder(holder: movieViewHolder, position: Int) {
        val movieList = MovieList[position]
        holder.ivMovie.setImageResource(movieList.image)
        holder.tvTitle.text = movieList.title
        holder.tvYear.text = movieList.year
        holder.tvActor.text = movieList.cast
    }


}