package UMLdiagram.Practice3_cinema;

public class Admin extends User {
    public Admin(String name, String email) {
        super(name, email);
    }

    public void newMovie(Cinema cinema, Movie movie) {
        if(cinema != null && movie != null) {
            cinema.getMovieList().add(movie);
        }
    }

    public void newRoom(Cinema cinema, Room room) {
        if(cinema != null && room != null) {
            cinema.getRoomList().add(room);
        }
    }
}
