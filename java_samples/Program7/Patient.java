public class Patient {
    static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    private String name;
    private int age;
    private String ailment;
    public final int patientID;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }
}
