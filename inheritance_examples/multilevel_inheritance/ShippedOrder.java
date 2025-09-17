public class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, String trackingNumber) {
        super(orderId);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Shipped (tracking:" + trackingNumber + ")";
    }
}
