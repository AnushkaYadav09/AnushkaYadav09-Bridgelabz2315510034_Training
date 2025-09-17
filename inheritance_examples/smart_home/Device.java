public class Device {
    protected String deviceId;
    protected boolean status;

    public Device(String deviceId) {
        this.deviceId = deviceId;
        this.status = false;
    }

    public void setStatus(boolean on) {
        this.status = on;
    }

    public void displayStatus() {
        System.out.println("Device " + deviceId + " is " + (status ? "ON" : "OFF"));
    }
}
