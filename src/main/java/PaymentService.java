
package com.agilefat;

// This is the "Transaction" class Maven is looking for
class Transaction {
    private double amount;
    private String currency;

    public Transaction(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() { return amount; }
    public String getCurrency() { return currency; }
}

// Your main PaymentService class
public class PaymentService {
    
    // Task 1: Develop payment validation logic
    public boolean validateTransaction(Transaction tx) {
        if (tx == null) {
            return false;
        }
        // Validate amount is positive and currency is USD
        if (tx.getAmount() > 0 && "USD".equalsIgnoreCase(tx.getCurrency())) {
            return true;
        }
        return false;
    }
}