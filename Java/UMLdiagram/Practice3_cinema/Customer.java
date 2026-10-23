package UMLdiagram.Practice3_cinema;

public class Customer extends User{
    private double points;

    public Customer(String name, String email) {
        super(name, email);
        this.points = 0.0;
    }
    
    public boolean bookSeat(ShowTime showTime, Seat seat) {
        if(showTime == null || seat == null) {
            return false;
        }

        if (seat.isBooked()) {
            System.out.println("Seat is Booked");
            return false;
        }

        if(seat instanceof AbstractSeat) {
            ((AbstractSeat) seat).setSeatState(true);
        }

        this.points += seat.calculatePrice() * 0.1;
        System.out.println("Book success! \nCurrent Points " + this.points);
        return true;
    }

    public double getPoints() {
        return points;
    }
}
