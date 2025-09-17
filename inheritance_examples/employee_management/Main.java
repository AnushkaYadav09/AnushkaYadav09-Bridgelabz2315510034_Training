public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
            new Manager("Alice", 101, 120000, 10),
            new Developer("Bob", 102, 90000, "Java"),
            new Intern("Charlie", 103, 15000, 6)
        };

        for (Employee e : employees) {
            e.displayDetails();
        }
    }
}
