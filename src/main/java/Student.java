/**
 * Student subclass.
 */

public class Student extends Person{
    protected String myIdNumber;
    protected double myGPA;

    /**
     * The Student constructor extended by Person superclass.
     *
     * @param name   The superclass persons name.
     * @param age    The superclass persons age.
     * @param gender The superclass persons gender 'F' for female or 'M' for male.
     * @param IdNum The Student's ID number.
     * @param gpa The Student's GPA score, always stored at double.
     */
    public Student(String name, int age, String gender, String IdNum, double gpa) {
        super(name, age, gender);
        this.myIdNumber = IdNum;
        this.myGPA = gpa;
    }
}
