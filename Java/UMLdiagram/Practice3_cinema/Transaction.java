package UMLdiagram.Practice3_cinema;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;


public class Transaction {
    private String transactionId;
    private LocalDateTime bookingTime;
    private Customer customer;
    private ShowTime showTime;
    private List<Seat> seatBookedList;

    
    public Transaction(String transactionId, LocalDateTime bookingTime, Customer customer, ShowTime showTime,
            List<Seat> seatBookedList) {
        this.transactionId = transactionId;
        this.bookingTime = bookingTime;
        this.customer = customer;
        this.showTime = showTime;
        this.seatBookedList = (seatBookedList != null) ? new ArrayList<>(seatBookedList) : new ArrayList<>();
    }


    public double totalPrice() {
        double total = 0.0;
        if (seatBookedList != null) {
            for (Seat seat : seatBookedList) {
                if (seat != null) {
                    total += seat.calculatePrice();
                }
            }
        }
        return total;
    }


    @Override
    public String toString() {
        return "Transaction [transactionId=" + transactionId 
                + ", bookingTime=" + bookingTime + ", customer=" + customer
                + ", showTime=" + showTime 
                + ", seatBookedList=" + seatBookedList 
                + ", totalPrice()=" + totalPrice() + "]";
    }

    
}
