public class Staff extends Person {
    private String role;

    public Staff(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    public void displayRole() {
        System.out.println("Staff: " + name + " role:" + role);
    }
}
