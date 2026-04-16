public class PaymentService {
    public boolean validateTransaction(Transaction tx) {
        if (tx == null) return false;
        if (tx.getAmount() <= 0) return false;
        if (tx.getCurrency() == null || tx.getCurrency().isEmpty()) return false;
        // Add logic to check if account is active
        return true;
    }
}