package UMLdiagram.Practice3_cinema;

public class Movie {
    protected String nameMovie;
    protected int duration;
    protected int minAge;

    public Movie(String nameMovie, int duration, int minAge) {
        this.nameMovie = nameMovie;
        this.duration = duration;
        this.minAge = minAge;
    }

    @Override
    public String toString() {
        return "Movie [nameMovie=" + nameMovie + ", duration=" + duration + ", minAge=" + minAge + "]";
    }
}
