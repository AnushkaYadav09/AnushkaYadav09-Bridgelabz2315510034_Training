public class Main {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("thermo-001", 24.5);
        t.setStatus(true);
        t.displayStatus();
    }
}
