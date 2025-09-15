public class MainDemo7 {
    public static void main(String[] args) {
        Patient p1 = new Patient("John", 45, "Flu", 1);
        p1.displayDetails();
        System.out.println("Total Patients: " + Patient.getTotalPatients());
    }
}
