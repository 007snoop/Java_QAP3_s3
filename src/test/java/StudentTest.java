public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("colin", 29, "M", "1", 100.00);

        System.out.println("Student Name: " + student.getName());
        System.out.println("GPA Before update: " + student.getGpa());

        student.setGpa(3.33);

        System.out.println("GPA After update: " + student.getGpa());
    }
}
