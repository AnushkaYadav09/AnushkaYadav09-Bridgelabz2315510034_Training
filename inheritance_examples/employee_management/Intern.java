public class Intern extends Employee {
    private int durationMonths;

    public Intern(String name, int id, double salary, int durationMonths) {
        super(name, id, salary);
        this.durationMonths = durationMonths;
    }

    @Override
    public void displayDetails() {
        System.out.println("Intern: " + name + ", id:" + id + ", salary:" + salary + ", duration:" + durationMonths + " months");
    }
}
