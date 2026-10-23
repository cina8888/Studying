package UMLdiagram.Practice3_cinema;
import  java.util.Map;
import java.util.HashMap;


public class Room {
    private String nameRoom;
    private Map<String, Seat> seatMap;

    public Room(String nameRoom) {
        this.nameRoom = nameRoom;
        this.seatMap = new HashMap<>();
    }

    public void printSeatMap() {
        System.out.println("===Seat Map Room: " + nameRoom + "===");

        if(seatMap == null || seatMap.isEmpty()) {
            System.out.println("No data");
            return;
        }

        for (Map.Entry<String, Seat> entry : seatMap.entrySet()) {
            String seatID = entry.getKey();
            Seat seat = entry.getValue();

            String status = seat.isBooked() ? "[Unavailable]" : "[Available]";
            String type = seat.getClass().getSimpleName();

            System.out.println("Seat: " + seatID + " | Type: " + type + "| Price: " + seat.calculatePrice() + "VND | " + status);
        }
    }

    public Map<String, Seat> getSeatMap() {
        return seatMap;
    }
}
