public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Annie Malik", 34, "F", "Java", 55000.00);


        System.out.println("Teacher Name: " + teacher.getName());
        System.out.println("Subject: " + teacher.getSubject());


        System.out.println("Salary Before update: " + teacher.getSalary());

        teacher.setSalary(125000.00);

        System.out.println("Salary After update: " + teacher.getSalary());
    }
}

