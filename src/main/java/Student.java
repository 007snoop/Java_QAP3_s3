/**
 * The Student subclass.
 */

public class Student extends Person{
    protected String IdNumber;
    protected double gpa;

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
        this.IdNumber = IdNum;
        this.gpa = gpa;
    }

    /**
     * The GPA of the student enrolled.
     * @param gpa The GPA score.
     */
    private void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     * Gets the students GPA score.
     * @return The Students GPA.
     */
    private double getGpa() {
        return gpa;
    }

    /**
     * Sets the students ID number.
     * @param idNumber The ID number of the Student.
     */
    private void setIdNumber(String idNumber) {
        IdNumber = idNumber;
    }

    /**
     * Gets the ID number of the Student.
     * @return The ID number of the student.
     */
    private String getIdNumber() {
        return IdNumber;
    }
}
