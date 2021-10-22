package day05;

public class Movie {
    private String title;
    private int year;
    private double avg;
    private int voters;
    private int sum;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public double rateMovie(int rate){
        sum += rate;
        voters++;
        avg = (double) sum / voters;
        return avg;
    }

    public double getAvg() {
        return avg;
    }
}
