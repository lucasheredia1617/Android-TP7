package com.example.android_tp7.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android_tp7.R
import com.example.android_tp7.databinding.ItemRecyclerBinding
import com.example.android_tp7.domain.entity.Movie

class MovieAdapter(private val movies: List<Movie>) : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    override fun getItemCount(): Int = movies.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemRecyclerBinding.bind(itemView)

        fun bind(movie: Movie) {
            binding.movieTitle.text = itemView.context.getString(R.string.card_title, movie.title)
            binding.overview.text = itemView.context.getString(R.string.card_description, movie.overview)
            binding.releaseDate.text = itemView.context.getString(R.string.card_release, movie.releaseDate)

            Glide.with(itemView.context)
                .load(
                    "https://image.tmdb.org/t/p/w500" +
                        movie.posterPath,
                )
                .into(binding.image)
        }
    }
}
