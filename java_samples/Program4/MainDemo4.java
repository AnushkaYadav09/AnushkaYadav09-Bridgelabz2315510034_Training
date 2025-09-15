public class MainDemo4 {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 1000, 2);
        p1.displayDetails();
        Product.updateDiscount(0.2);
        System.out.println("Updated Discount: " + (Product.discount * 100) + "%");
    }
}
