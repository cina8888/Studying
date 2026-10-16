package Oop.Inheritance_pratice.lv2_payment;
import java.util.List;
import java.util.ArrayList;

public class PaymentGateway {
    List<PaymentTransaction> transactions = new ArrayList<>();
    public void addTransaction(PaymentTransaction tx) {
        if (tx == null) {
            throw new NullPointerException();
        }
        transactions.add(tx);
    }

    public void processBatch() {
        for (PaymentTransaction transaction : transactions) {
            if (!transaction.isProcessed()) {
                transaction.executePayment();
            }
        }
    }

    public double calculateTotalSystemRevenue() {
        double total = 0;
        for (PaymentTransaction transaction : transactions) {
            if (transaction.isProcessed()) {
                total += transaction.calculateProcessingFee();
            }
        }
        return total;
    }

    public void triggerFraudReport() {
        for (PaymentTransaction transaction : transactions) {
            if (transaction.isFlaggedForFraud() == true) {
                System.out.println(transaction.getAuditLog());
            }
        }
    }

    public void refundAllEligible(double percentage) {
        for (PaymentTransaction transaction : transactions) {
            if (transaction instanceof Refundable) {
                Refundable refTx = (Refundable) transaction;
                double amountToRefund = refTx.getMaxRefundableAmount() * (percentage / 100);
                refTx.processRefund(amountToRefund);    
            }
        }
    }
}
