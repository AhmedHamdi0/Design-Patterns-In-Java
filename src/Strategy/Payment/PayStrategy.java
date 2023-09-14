package Strategy.Payment;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
