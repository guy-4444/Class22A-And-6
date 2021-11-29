package com.guy.class22a_and_6;

import java.util.ArrayList;

public class DataManager {

    public static ArrayList<Movie> generateMovies() {
        ArrayList<Movie> movies = new ArrayList<>();


        movies.add(new Movie()
                .setTitle("The Shawshank Redemption")
                .setActors("Tim Robbins, Morgan Freeman, Bob Gunton")
                .setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/vdVab7yNvgYEMd8shCfy2D6nTMu.jpg")
                .setDuration(142)
                .setRating(87)
        );

        movies.add(new Movie()
                .setTitle("Venom: Let There Be Carnage")
                .setActors("Tom Hardy, Woody Harrelson, Michelle Williams, Naomie Harris")
                .setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1MJNcPZy46hIy2CmSqOeru0yr5C.jpg")
                .setDuration(97)
                .setRating(72)
        );

        movies.add(new Movie()
                .setTitle("The Flash")
                .setActors("Grant Gustin, Candice Patton, Danielle Panabaker, Jesse L. Martin, Carlos Valdes")
                .setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lJA2RCMfsWoskqlQhXPSLFQGXEJ.jpg")
                .setDuration(104)
                .setRating(78)
        );


        movies.add(new Movie()
                .setTitle("The Lord of the Rings: The Return of the King")
                .setActors("Elijah Wood, Ian McKellen")
                .setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/rCzpDGLbOoPwLjy3OAm5NUPOTrC.jpg")
                .setDuration(201)
                .setRating(85)
        );

        movies.add(new Movie()
                .setTitle("VENOM 2")
                .setActors("Andy Serkis")
                .setImage("https://www.themoviedb.org/movie/580489-venom-let-there-be-carnage#")
                .setDuration(97)
                .setRating(72)
        );

        movies.add(new Movie()
                .setTitle("A clockwork orange")
                .setActors("Malcolm McDowell, Patrick Magee")
                .setImage("https://images-na.ssl-images-amazon.com/images/S/pv-target-images/18008ecca4b19aa99c2e23d10ae26b9aaf838c98c0bb6acd4164006eb4ad07f8._RI_V_TTW_.jpg")
                .setDuration(136)
                .setRating(90)
        );

        movies.add(new Movie()
                .setTitle("Forget me in house 6")
                .setActors("Rob Delaney, Ellie Kemper, Archie Yates, Aisling Bea")
                .setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/bepda1dfnsWCxIu6aJlnjxlmpH3.jpg")
                .setDuration(93)
                .setRating(55)
        );


        movies.add(new Movie()
                .setTitle("The Mummy")
                .setActors("Brendan Fraser Rachel Weisz John Hannah Arnold Vosloo")
                .setImage("https://www.themoviedb.org/t/p/w1280/yhIsVvcUm7QxzLfT6HW2wLf5ajY.jpg")
                .setDuration(120)
                .setRating(32)
        );

        movies.add(new Movie()
                .setTitle("The Mummy")
                .setActors("Brendan Fraser Rachel Weisz John Hannah Arnold Vosloo")
                .setImage("https://www.themoviedb.org/t/p/w1280/yhIsVvcUm7QxzLfT6HW2wLf5ajY.jpg")
                .setDuration(120)
                .setRating(32)
        );

        movies.add(new Movie()
                .setTitle("The Mummy")
                .setActors("Brendan Fraser Rachel Weisz John Hannah Arnold Vosloo")
                .setImage("https://www.themoviedb.org/t/p/w1280/yhIsVvcUm7QxzLfT6HW2wLf5ajY.jpg")
                .setDuration(120)
                .setRating(32)
        );

        movies.add(new Movie()
                .setTitle("The Mummy")
                .setActors("Brendan Fraser Rachel Weisz John Hannah Arnold Vosloo")
                .setImage("https://www.themoviedb.org/t/p/w1280/yhIsVvcUm7QxzLfT6HW2wLf5ajY.jpg")
                .setDuration(120)
                .setRating(32)
                .setFavorite(true)
        );


        return movies;
    }
}
