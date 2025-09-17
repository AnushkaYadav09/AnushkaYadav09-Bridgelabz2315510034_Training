import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Order o1 = new Order("ORD001");
        Order o2 = new ShippedOrder("ORD002", "TRACK123");
        Order o3 = new DeliveredOrder("ORD003", "TRACK999", LocalDate.of(2025,9,10));

        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}
