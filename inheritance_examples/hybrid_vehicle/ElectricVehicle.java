public class ElectricVehicle extends Vehicle {
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge(int minutes) {
        System.out.println(model + " charging for " + minutes + " minutes");
    }
}
