package com.example.movieexamplekotlin.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.movieexamplekotlin.R
import com.example.movieexamplekotlin.model.Movie
import kotlinx.android.synthetic.main.view_holder_movie.view.*

class MovieAdapter:
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    val list = arrayListOf<Movie>()

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(LayoutInflater.from(parent.context).
            inflate(R.layout.view_holder_movie, parent, false))
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = list[position]
        holder.bind(movie)
        holder.itemView.delete.setOnClickListener {
            if (position != RecyclerView.NO_POSITION){
                list.removeAt(position)
                notifyDataSetChanged()
            }
        }
    }

    inner class MovieViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(movie: Movie){
            itemView.movieImage.setImageResource(movie.imageId)
            itemView.movieTitle.text = movie.name
        }
    }
}