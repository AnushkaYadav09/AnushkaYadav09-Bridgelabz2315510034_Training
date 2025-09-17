public class Main {
    public static void main(String[] args) {
        PaidOnlineCourse p = new PaidOnlineCourse("Algorithms", 40, "Udemy", true, 100.0, 0.2);
        System.out.println("Final fee: " + p.finalFee());
    }
}
