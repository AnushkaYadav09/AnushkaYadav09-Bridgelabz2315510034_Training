import java.time.LocalDate;

public class Order {
    protected String orderId;
    protected LocalDate orderDate;

    public Order(String orderId) {
        this.orderId = orderId;
        this.orderDate = LocalDate.now();
    }

    public String getOrderStatus() {
        return "Placed";
    }
}
