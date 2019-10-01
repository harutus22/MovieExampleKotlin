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

class MovieAdapter(val clickListener: OnItemDelete):ListAdapter<Movie, MovieAdapter.MovieViewHolder>(DiffCallBack()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(LayoutInflater.from(parent.context).
            inflate(R.layout.view_holder_movie, parent, false))
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = getItem(position)
        holder.bind(movie)
        holder.itemView.setOnClickListener {
            if (position != RecyclerView.NO_POSITION){
                
            }
        }
    }

    inner class MovieViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(movie: Movie){
            itemView.movieImage.setImageResource(movie.imageId)
            itemView.movieTitle.text = movie.name
        }
    }

    companion object{
        class DiffCallBack: DiffUtil.ItemCallback<Movie>(){
            override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean {
                return oldItem.imageId == newItem.imageId &&
                        oldItem.name == newItem.name
            }

        }
    }

    interface OnItemDelete{
        fun deleteItem(position: Int)
    }
}