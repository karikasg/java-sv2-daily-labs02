package day05;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie = new Movie("Ben Hur", 1959);
        Viewer viewer = new Viewer();

        movie.rateMovie(4);
        movie.rateMovie(3);
        movie.rateMovie(2);
        System.out.println(movie.getAvg());

        viewer.watchMovie(movie,5);
        System.out.println(movie.getAvg());

    }
}
