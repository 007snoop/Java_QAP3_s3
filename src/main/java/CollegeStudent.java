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

    /**
     * Sets the students major enrollment.
     * @param major The main subject for student.
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * Denotes whether student is a freshmen or a sophomore.
     * @param year 1 = freshmen,
     *             2 = sophomore
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Get the college students major.
     * @return The major of the student.
     */
    public String getMajor() {
        return major;
    }

    /**
     * Returns Freshmen or Sophomore.
     * @return 1 for freshmen 2 for sophomore.
     */
    public String getYear() {
        return switch (year) {
            case 1 -> "Freshmen";
            case 2 -> "Sophomore";
            default -> "unknown Year";
        };
    }

    /**
     * To String method using super class method.
     * @return The super toString as well as Student Major and Student Year.
     */
    @Override
    public String toString() {
        return (super.toString()
        + "\nStudent Major: " + getMajor()
        + "\nStudent Year: " + getYear());
    }
}
