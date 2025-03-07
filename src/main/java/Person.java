/**
 * The Person super class.
 */
public class Person {
    protected String name;
    protected int age;
    protected String gender;

    /**
     * The Person constructor.
     *
     * @param name The persons name.
     * @param age The persons age.
     * @param gender The persons gender 'F' for female or 'M' for male.
    */
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * Method to output constructor to string.
     * @return The Name, Age, and Gender of person.
     */
    @Override
    public String toString() {
        return "\nName: " + name
                + "\nAge: " + age
                + "\nGender: " + gender;
    }

    /**
     * Sets the name for the super class Person.
     * @param name The name of the Person.
     *             This Method is inherent by subclass.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the super class Person.
     * @return The name of the Person.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets age of super class Person.
     * @param age The age of the Person.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the age of super class Person.
     * @return The age of the person.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the gender of super class Person.
     * @param gender The Gender of Person.
     *                'M' for Male.
     *                'F' for Female.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the gender of super class Person.
     * @return The gender of Person.
     */
    public String getGender() {
        return gender;
    }
}
