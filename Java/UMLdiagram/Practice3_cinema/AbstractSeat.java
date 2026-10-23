package UMLdiagram.Practice3_cinema;

public abstract class AbstractSeat implements Seat{
    private String seatID;
    private boolean seatState;
    private double TICKET_PRICE = 80000.0;

    public AbstractSeat(String seatID, boolean seatState) {
        this.seatID = seatID;
        this.seatState = seatState;
    }

    public boolean isBooked() {
        return this.seatState;
    };

    public double getTicketPrice() {
        return TICKET_PRICE;
    }

    public String getSeatID() {
        return seatID;
    }

    public void setSeatState(boolean seatState) {
        this.seatState = seatState;
    };
}
