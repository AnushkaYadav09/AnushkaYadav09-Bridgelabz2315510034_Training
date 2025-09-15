public class MainDemo3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 1, "Developer");
        Employee emp2 = new Employee("Bob", 2, "Manager");

        emp1.displayDetails();
        Employee.displayTotalEmployees();
    }
}
