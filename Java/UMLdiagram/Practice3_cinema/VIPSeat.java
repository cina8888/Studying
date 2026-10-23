package UMLdiagram.Practice3_cinema;

public class VIPSeat extends AbstractSeat{
    private double VIP_SURCHARGE_RATE = 0.2;
    private String gift;

    public VIPSeat(String seatID, boolean seatState, String gift) {
        super(seatID, seatState);
        this.gift = gift;
    }

    @Override
    public double calculatePrice() {
        double VipPrice = getTicketPrice()*VIP_SURCHARGE_RATE + getTicketPrice();
        return VipPrice;
    }

    public String getGift() {
        return gift;
    }

    public double getVIP_SURCHARGE_RATE() {
        return VIP_SURCHARGE_RATE;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }
}
