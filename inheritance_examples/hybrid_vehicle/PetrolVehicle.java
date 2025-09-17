public class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel(double liters) {
        System.out.println(model + " refueled: " + liters + "L"); 
    }
}
