package UMLdiagram.Practice3_cinema;
import java.util.List;
import java.util.ArrayList;


public class Cinema {
    private List<User> userList;
    private List<Movie> movieList;
    private List<Room> roomList;

    

    public Cinema(List<User> userList, List<Movie> movieList, List<Room> roomList) {
        this.userList = new ArrayList<>();
        this.movieList = new ArrayList<>();
        this.roomList = new ArrayList<>();
    }

    public void addUser(User user) {
        if(user != null) {
            this.userList.add(user);
        }
    }

    public void removeUser(User user) {
        this.userList.remove(user);
    }

    public List<User> getUserList() {
        return userList;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    
}
