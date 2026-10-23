package UMLdiagram.Practice3_cinema;

public class StandartSeat extends AbstractSeat{

    public StandartSeat(String seatID, boolean seatState) {
        super(seatID, seatState);
    }
    
    @Override
    public double calculatePrice() {
        return getTicketPrice();
    }
}
