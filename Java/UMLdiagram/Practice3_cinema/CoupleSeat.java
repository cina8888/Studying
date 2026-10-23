package UMLdiagram.Practice3_cinema;

public class CoupleSeat extends AbstractSeat {
    public CoupleSeat(String seatID, boolean seatState) {
        super(seatID, seatState);
    }
    
    @Override
    public double calculatePrice() {
        return 0;
    }
}