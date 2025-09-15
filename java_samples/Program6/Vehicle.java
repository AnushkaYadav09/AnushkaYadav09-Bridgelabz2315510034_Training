public class Vehicle {
    static double registrationFee = 500.0;
    private String ownerName;
    private String vehicleType;
    public final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        }
    }
}
