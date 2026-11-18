public class CashPayment implements PaymentStrategy {

    @Override
    public String pay(int amount, int table) {
        return "Customer want to pay " + amount
                + " using Cash (table " + table + ")";
    }
}