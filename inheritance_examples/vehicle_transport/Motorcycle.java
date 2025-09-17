public class Motorcycle extends Vehicle {
    private boolean hasCarrier;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
        super(maxSpeed, fuelType);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle -> maxSpeed:" + maxSpeed + ", fuel:" + fuelType + ", carrier:" + hasCarrier);
    }
}
