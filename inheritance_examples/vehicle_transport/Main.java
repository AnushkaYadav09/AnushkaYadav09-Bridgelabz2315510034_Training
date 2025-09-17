public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[] {
            new Car(180, "Petrol", 5),
            new Truck(120, "Diesel", 5000.0),
            new Motorcycle(140, "Petrol", true)
        };

        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
