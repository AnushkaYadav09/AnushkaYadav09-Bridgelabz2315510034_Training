public class MainDemo6 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car", "REG1234");
        v1.displayDetails();
        Vehicle.updateRegistrationFee(600);
        System.out.println("Updated Registration Fee: $" + Vehicle.registrationFee);
    }
}
