package com.putragandad.rvfragment

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieListSavedAdapter (private val MovieList: ArrayList<MovieList>) :
    RecyclerView.Adapter<MovieListSavedAdapter.movieViewHolder>(){

    class movieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvSavedImage: ImageView = itemView.findViewById(R.id.iv_saved_movie)
        val tvSavedTitle: TextView = itemView.findViewById(R.id.tv_saved_title)
        val tvSavedYear: TextView = itemView.findViewById(R.id.tv_saved_year)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): movieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movielist_2, parent, false)
        return movieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieListSavedAdapter.movieViewHolder, position: Int) {
        val movieList = MovieList[position]

        holder.tvSavedImage.setImageResource(movieList.image)
        holder.tvSavedTitle.text = movieList.title
        holder.tvSavedYear.text = movieList.year
    }

    override fun getItemCount(): Int {
        return MovieList.size
    }


}