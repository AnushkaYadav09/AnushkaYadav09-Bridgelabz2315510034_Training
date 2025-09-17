import java.time.LocalDate;

public class DeliveredOrder extends ShippedOrder {
    private LocalDate deliveryDate;

    public DeliveredOrder(String orderId, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Delivered on " + deliveryDate.toString();
    }
}
