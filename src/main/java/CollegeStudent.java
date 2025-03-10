public class CollegeStudent extends Student{
    protected String major;
    protected int year;
    /**
     * The Student constructor extended by Person superclass.
     *
     * @param name   The superclass persons name.
     * @param age    The superclass persons age.
     * @param gender The superclass persons gender 'F' for female or 'M' for male.
     * @param IdNum  The Student's ID number.
     * @param gpa    The Student's GPA score, always stored at double.
     * @param major  The Major the student is enrolled in.
     * @param year   Declaration of Freshmen(1) or Sophomore(2) Student.
     */
    public CollegeStudent(String name, int age, String gender, String IdNum, double gpa, String major, int year) {
        super(name, age, gender, IdNum, gpa);
        this.major = major;
        this.year = year;
    }

    /**
     * No Parameter College Student Constructor.
     */
    public CollegeStudent() {
        super("undefined", 0, "n/a", "n/a", 0.00);
        this.major = "undeclared";
        this.year = 0;
    }
}
