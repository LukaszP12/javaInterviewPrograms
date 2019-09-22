package Comparable_Comparator;

public class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    //Used to sort movies by year
    @Override
    public int compareTo(Movie movie) {
        return this.year - movie.year;
    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }


}
