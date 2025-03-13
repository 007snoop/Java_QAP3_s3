/**
 *
 * The Teacher subclass.
 */

public class Teacher extends Person{
    protected String subject;
    protected double salary;
    /**
     * The Teacher constructor extended by Person superclass.
     *
     * @param name   The superclass persons name.
     * @param age    The superclass persons age.
     * @param gender The superclass persons gender 'F' for female or 'M' for male.
     * @param salary The teachers Salary.
     * @param subject The teachers subject they primarily teach.
     */
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.salary = salary;
        this.subject = subject;
    }

    /**
     * No Parameter Teacher constructor.
     */
    public Teacher() {
        super();
        this.subject = "none";
        this.salary = 0.00;
    }

    /**
     * Sets the teachers salary.
     * @param salary The salary of Teacher as double.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Gets the teachers salary.
     * @return The teachers salary as a double.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the subject that the teacher teaches.
     * @param subject The subject.
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Gets the subject that the teacher teaches.
     * @return The subject.
     */
    public String getSubject() {
        return subject;
    }


    /**
     * To String method using super class method
     * @return The super toString as well as teachers teaching subject and salary.
     */
    @Override
    public String toString() {
        return (super.toString()
                + "\nSubject: " + getSubject()
                + "\nSalary: " + getSalary());
    }
}
