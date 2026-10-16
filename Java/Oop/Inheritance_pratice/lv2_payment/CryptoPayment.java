package Oop.Inheritance_pratice.lv2_payment;

public class CryptoPayment extends PaymentTransaction implements Refundable {
    private String walletAddress;
    private double networkGasFee;

    CryptoPayment(String transactionId, double amount, String walletAddress, double networkGasFee) {
        super(transactionId, amount);
        if (walletAddress.substring(0, 2).equals("0x") && walletAddress.length() > 10) {
            this.walletAddress = walletAddress;
            this.networkGasFee = networkGasFee;
        } else {
            throw new IllegalArgumentException("WalletAddress Invalid!");
        }
    }

    @Override
    public double calculateProcessingFee() {
        double fee = networkGasFee;
        return fee;
    }

    @Override
    public boolean executePayment() {
        setProcessed(true);
        return true;
    }

    @Override
    public boolean processRefund(double refundAmount) {
        System.out.println("Warning: Crypto transactions are irreversible!");
        return false;
    }

    @Override
    public double getMaxRefundableAmount() {
        return 0.0;
    }

    @Override
    public boolean isFlaggedForFraud() {
        return ((networkGasFee < 1.0 || getAmount() > 10000) ? true : false);
    }

    @Override
    public String getAuditLog() {
        return String.format("[CRYPTO] Time: %s | ID: %s | Wallet: %s | Gas: %.2f | Status: %b", 
                            getTimestamp(), getTransactionId(), walletAddress, networkGasFee, isProcessed());
    }


}
