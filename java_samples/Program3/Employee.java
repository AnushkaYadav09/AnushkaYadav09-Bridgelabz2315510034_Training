public class Employee {
    static String companyName = "Tech Corp";
    private static int totalEmployees = 0;

    private String name;
    public final int id;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }
}
