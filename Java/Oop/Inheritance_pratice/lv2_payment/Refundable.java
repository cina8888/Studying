package Oop.Inheritance_pratice.lv2_payment;

public interface Refundable {
    public boolean processRefund(double refundAmount);
    public double getMaxRefundableAmount();
}
