public class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String deviceId, double temperatureSetting) {
        super(deviceId);
        this.temperatureSetting = temperatureSetting;
    }

    public void setTemperature(double t) {
        this.temperatureSetting = t;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature setting: " + temperatureSetting);
    }
}
