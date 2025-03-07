/**
 * The Person super class.
 */
public class Person {
    protected String myName;
    protected int myAge;
    protected String myGender;

    /**
     * The Person constructor.
     *
     * @param name The persons name.
     * @param age The persons age.
     * @param gender The persons gender 'F' for female or 'M' for male.
    */
    public Person(String name, int age, String gender) {
        this.myName = name;
        this.myAge = age;
        this.myGender = gender;
    }

    /**
     * Method to output constructor to string.
     * @return The Name, Age, and Gender of person.
     */
    @Override
    public String toString() {
        return "\nName: " + myName
                + "\nAge: " + myAge
                + "\nGender: " + myGender;
    }
}
