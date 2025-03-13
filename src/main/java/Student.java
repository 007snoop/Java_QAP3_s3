/**
 *
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
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     * Gets the students GPA score.
     * @return The Students GPA.
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * Sets the students ID number.
     * @param idNumber The ID number of the Student.
     */
    public void setIdNumber(String idNumber) {
        IdNumber = idNumber;
    }

    /**
     * Gets the ID number of the Student.
     * @return The ID number of the student.
     */
    public String getIdNumber() {
        return IdNumber;
    }

    /**
     * To String method using super class
     * @return The super toString and ID and GPA score.
     */
    @Override
    public String toString() {
        return (super.toString()
        + "\nStudent ID: " + getIdNumber()
        + "\nStudent GPA Score: " + getGpa());
    }
}
