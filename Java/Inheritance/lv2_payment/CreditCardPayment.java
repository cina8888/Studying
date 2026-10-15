package Inheritance.lv2_payment;

public class CreditCardPayment extends PaymentTransaction implements Refundable {
    private String cardHolderName;
    private String cardNumber;
    private double creditLimit;

    CreditCardPayment(String transactionId, double amount, String cardHolderName, String cardNumber, double creditLimit) {
        super(transactionId, amount);
        this.cardHolderName = cardHolderName;
        if (cardNumber == null ||cardNumber.length() != 16) {
            throw new IllegalArgumentException("Invalid Card Number");
        }
        this.cardNumber = cardNumber;
        this.creditLimit = creditLimit;
    }

    @Override
    public double calculateProcessingFee() {
        Double Fee = ((2.5/100) * this.getAmount()) + 0.3;
        return Fee;
    }

    @Override
    public boolean executePayment() {
        if (this.getTotalDeduction() <= creditLimit) {
            creditLimit -= this.getTotalDeduction();
            this.setProcessed(true);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean processRefund(double refundAmount) {
        if (!isProcessed() || refundAmount > getMaxRefundableAmount()) {
            return false;
        }
        creditLimit += refundAmount;
        return true;
    }

    @Override 
    public double getMaxRefundableAmount() {
        return getAmount();
    }

    @Override
    public String getAuditLog() {
        String last4Digits = cardNumber.substring(12); 
        return String.format("[CREDIT_CARD] CarName: %s | Time: %s| ID: %s | Card: ****%s | Total: %.2f | Status: %b",
                cardHolderName, getTimestamp(), getTransactionId(), last4Digits, getTotalDeduction(), isProcessed());
    }

    @Override
    public boolean isFlaggedForFraud() {
        return getAmount() > 5000;
    }
}
