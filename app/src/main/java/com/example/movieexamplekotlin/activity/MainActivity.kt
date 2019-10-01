package com.example.movieexamplekotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.movieexamplekotlin.R
import com.example.movieexamplekotlin.model.Movie
import com.example.movieexamplekotlin.recyclerview.MovieAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MovieAdapter.OnItemDelete {

    lateinit var adapter:MovieAdapter
    override fun deleteItem(position: Int) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createRecycleView()
    }

    private fun createRecycleView() {
        adapter = MovieAdapter(this)
        adapter.submitList(createList())
        val layoutManager = StaggeredGridLayoutManager(3,
            StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }

    private fun createList(): ArrayList<Movie>{
        val list = arrayListOf<Movie>()
        list.add(Movie("Forest Gump", R.drawable.forest_gump))
        list.add(Movie("Fast and Furious", R.drawable.foursage))
        list.add(Movie("Pitch Perfect", R.drawable.pitch_perfect))
        list.add(Movie("Ratatouille", R.drawable.ratatouille))
        list.add(Movie("Taxi", R.drawable.taxi))
        list.add(Movie("Wall-E", R.drawable.wall_e))
        list.add(Movie("Runner", R.drawable.forest_gump))
        list.add(Movie("Fast and Furious 2", R.drawable.foursage))
        list.add(Movie("Sing", R.drawable.pitch_perfect))
        list.add(Movie("El Chef", R.drawable.ratatouille))
        list.add(Movie("Wheel Man", R.drawable.taxi))
        list.add(Movie("Drugs", R.drawable.wall_e))
        list.add(Movie("Passing the route", R.drawable.forest_gump))
        list.add(Movie("Fly over the rambow", R.drawable.foursage))
        list.add(Movie("Pitch Perfect", R.drawable.pitch_perfect))
        list.add(Movie("Ratatouille", R.drawable.ratatouille))
        list.add(Movie("Taxi", R.drawable.taxi))
        list.add(Movie("Wall-E", R.drawable.wall_e))
        list.add(Movie("Forest Gump", R.drawable.forest_gump))
        list.add(Movie("Fast and Furious", R.drawable.foursage))
        list.add(Movie("Pitch Perfect", R.drawable.pitch_perfect))
        list.add(Movie("Ratatouille", R.drawable.ratatouille))
        list.add(Movie("Taxi", R.drawable.taxi))
        list.add(Movie("Wall-E", R.drawable.wall_e))
        list.add(Movie("Forest Gump", R.drawable.forest_gump))
        list.add(Movie("Fast and Furious", R.drawable.foursage))
        list.add(Movie("Pitch Perfect", R.drawable.pitch_perfect))
        list.add(Movie("Ratatouille", R.drawable.ratatouille))
        list.add(Movie("Taxi", R.drawable.taxi))
        list.add(Movie("Wall-E", R.drawable.wall_e))
        list.add(Movie("Forest Gump", R.drawable.forest_gump))
        list.add(Movie("Fast and Furious", R.drawable.foursage))
        list.add(Movie("Pitch Perfect", R.drawable.pitch_perfect))
        list.add(Movie("Ratatouille", R.drawable.ratatouille))
        list.add(Movie("Taxi", R.drawable.taxi))
        list.add(Movie("Wall-E", R.drawable.wall_e))
        return list
    }
}
