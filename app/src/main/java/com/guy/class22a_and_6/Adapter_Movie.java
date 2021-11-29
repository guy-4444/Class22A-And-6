package com.guy.class22a_and_6;

import android.app.Activity;
import android.content.ClipData;
import android.location.GnssAntennaInfo;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;


public class Adapter_Movie extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    
    private Activity activity;
    private ArrayList<Movie> movies = new ArrayList<>();
    private MovieItemClickListener movieItemClickListener;

    public Adapter_Movie(Activity activity, ArrayList<Movie> movies) {
        this.activity = activity;
        this.movies = movies;
    }

    public Adapter_Movie setMovieItemClickListener(MovieItemClickListener movieItemClickListener) {
        this.movieItemClickListener = movieItemClickListener;
        return this;
    }

    @Override
    public RecyclerView.ViewHolder
    onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_movie_small, viewGroup, false);
        return new MovieViewHolder(view);
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        MovieViewHolder movieViewHolder = (MovieViewHolder) holder;
        Movie movie = getItem(position);
        Log.d("pttt", "position= " + position);

        movieViewHolder.movie_LBL_title.setText(position + "\n" + movie.getTitle());
        movieViewHolder.movie_LBL_actors.setText(movie.getActors());
        int h = movie.getDuration() / 60;
        int m = movie.getDuration() % 60;
        String hh = h < 10 ? "0" + h : "" + h;
        String mm = m < 10 ? "0" + m : "" + m;
        movieViewHolder.movie_LBL_duration.setText(hh + "h " + mm + "m");


        Glide
                .with(activity)
                .load(movie.getImage())
                .into(movieViewHolder.movie_IMG_image);

        if (movie.isFavorite()) {
            movieViewHolder.movie_IMG_favorite.setImageResource(R.drawable.ic_heart_filled);
        } else  {
            movieViewHolder.movie_IMG_favorite.setImageResource(R.drawable.ic_heart_empty);
        }

        float rating = movie.getRating();
        rating /= 20;
        movieViewHolder.movie_RTNG_stars.setRating(rating);
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    private Movie getItem(int position) {
        return movies.get(position);
    }

    public interface MovieItemClickListener {
        void movieItemClicked(Movie movie, int position);
        void favoriteClicked(Movie movie, int position);
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
                
        public AppCompatImageView movie_IMG_image;
        public AppCompatImageView movie_IMG_favorite;
        public MaterialTextView movie_LBL_title;
        public MaterialTextView movie_LBL_actors;
        public MaterialTextView movie_LBL_duration;
        public AppCompatRatingBar movie_RTNG_stars;

        public MovieViewHolder(final View itemView) {
            super(itemView);
            this.movie_IMG_image = itemView.findViewById(R.id.movie_IMG_image);
            this.movie_IMG_favorite = itemView.findViewById(R.id.movie_IMG_favorite);
            this.movie_LBL_title = itemView.findViewById(R.id.movie_LBL_title);
            this.movie_LBL_actors = itemView.findViewById(R.id.movie_LBL_actors);
            this.movie_LBL_duration = itemView.findViewById(R.id.movie_LBL_duration);
            this.movie_RTNG_stars = itemView.findViewById(R.id.movie_RTNG_stars);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    movieItemClickListener.movieItemClicked(getItem(getAdapterPosition()), getAdapterPosition());
                }
            });

            movie_IMG_favorite.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    movieItemClickListener.favoriteClicked(getItem(getAdapterPosition()), getAdapterPosition());
                }
            });
        }
    }
}

