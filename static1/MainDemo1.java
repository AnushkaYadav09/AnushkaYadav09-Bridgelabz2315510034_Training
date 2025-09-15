public class MainDemo1 {
    public static void main(String[] args) {
        Student john = new Student("John");
        john.addSubject(new Subject("Maths", 90));
        john.addSubject(new Subject("Science", 85));

        GradeCalculator gc = new GradeCalculator();
        String grade = gc.calculateGrade(john);

        System.out.println("Student: " + john.getName());
        for (Subject s : john.getSubjects()) {
            System.out.println(s.getName() + " : " + s.getMarks());
        }
        System.out.println("Final Grade: " + grade);
    }
}
