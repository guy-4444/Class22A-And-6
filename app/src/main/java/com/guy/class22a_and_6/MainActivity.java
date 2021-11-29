package com.guy.class22a_and_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView main_LST_movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_LST_movies = findViewById(R.id.main_LST_movies);


        ArrayList<Movie> movies = DataManager.generateMovies();

        Adapter_Movie adapter_movie = new Adapter_Movie(this, movies);


        // Grid
        main_LST_movies.setLayoutManager(new GridLayoutManager(this, 2));

        // Vertically
        //main_LST_movies.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));


        main_LST_movies.setHasFixedSize(true);
        main_LST_movies.setItemAnimator(new DefaultItemAnimator());
        main_LST_movies.setAdapter(adapter_movie);

        adapter_movie.setMovieItemClickListener(new Adapter_Movie.MovieItemClickListener() {
            @Override
            public void movieItemClicked(Movie movie, int position) {
                Toast.makeText(MainActivity.this, movie.getTitle(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void favoriteClicked(Movie movie, int position) {
                movie.setFavorite(!movie.isFavorite());
                Toast.makeText(MainActivity.this, movie.isFavorite() + "\n" + movie.getTitle(), Toast.LENGTH_SHORT).show();
                main_LST_movies.getAdapter().notifyItemChanged(position);
            }
        });

    }
}