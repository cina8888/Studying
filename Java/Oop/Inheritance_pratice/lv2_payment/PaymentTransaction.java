package Oop.Inheritance_pratice.lv2_payment;
import java.time.LocalTime;

public abstract class PaymentTransaction implements Auditable {
    private String transactionId;
    private double amount;
    private String timestamp;
    private boolean isProcessed;

    public double getAmount() {
        return amount;
    }

    public boolean isProcessed() {
        return isProcessed;
    }

    public String getTransactionId() {
        return transactionId;
    }

    

    public String getTimestamp() {
        return timestamp;
    }

    public void setProcessed(boolean isProcessed) {
        this.isProcessed = isProcessed;
    }

    private LocalTime time = LocalTime.now();
    
    PaymentTransaction(String transactionId, double amount) {
        if (transactionId == null ||transactionId.isEmpty() || amount <= 0) {
            throw new IllegalArgumentException("TransactionId or amount Invalid!");
        }
        this.transactionId = transactionId;
        this.amount = amount;
        this.timestamp = "" + time;
    }

    public abstract boolean executePayment();
    public abstract double calculateProcessingFee();
    public double getTotalDeduction() {
        return amount + calculateProcessingFee();
    }
}
