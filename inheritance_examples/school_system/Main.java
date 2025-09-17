public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher("Ms. Sharma", 35, "Maths");
        Student s = new Student("Ravi", 15, 10);
        Staff st = new Staff("Sunita", 40, "Clerk");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}
