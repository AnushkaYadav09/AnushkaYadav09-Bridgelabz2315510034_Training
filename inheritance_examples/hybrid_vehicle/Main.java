public class Main {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("ModelX", 160);
        PetrolVehicle pv = new PetrolVehicle("City", 140);

        ev.charge(30);
        pv.refuel(20.5);
    }
}
