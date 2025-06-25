package nuisance;

/**
 * This class represents a person
 *
 * @author Josh Sorensen
 */

public class Person {
    private String name;
    private int age;

    /**
     * Constructs a person with the specified name and age
     *
     * @param name the name of the Person
     * @param age  the age of the Person, must be in the range of (1-150)
     * @throws IllegalArgumentException if an invalid age is provided and include an error message stating that age needs to be from the range [1, 150]
     */

    public Person(String name, int age) throws IllegalArgumentException {
        if (age < 1 || age > 150) {
            throw new IllegalArgumentException("Age needs to be from the range [1, 150]");
        }

        this.name = name;
        this.age = age;
    }

    /**
     * Returns the person's name
     *
     * @return the name of the person
     */

    public String getName() {
        return name;
    }

    /**
     * Returns the person's age
     *
     * @return the age of the person
     */

    public int getAge() {
        return age;
    }

    /**
     * Returns a formatted string containing the person's name followed by their age in {name}({age}) format
     * <br>
     * Ex: Chloe(24)
     *
     * @return a formatted string containing the person's name followed by their age
     */

    @Override
    public String toString() {
        return String.format("%s(%d)", getName(), getAge());
    }

    /**
     * Equals method
     *
     * @param otherObj the other friend object you're comparing
     * @return true if this and the other friend are equal, false otherwise
     */

    @Override
    public boolean equals(Object otherObj) {
        // Reflexive (check for referential equality)
        if (this == otherObj) {
            return true;
        }

        // Check if otherObj is null to avoid NullPointerException
        if (otherObj == null) {
            return false;
        }

        // Check if runtime classes are not equal
        if (this.getClass() != otherObj.getClass()) {
            return false;
        }

        // Check all instance fields for logical equality

        if (!this.getName().equals(((Person) otherObj).getName())) {
            return false;
        }

        if (this.getAge() != ((Person) otherObj).getAge()) {
            return false;
        }

        return true;
    }

    /**
     * Returns a unique hash code used in the equality check of objects
     *
     * @return a hash code
     */

    @Override
    public int hashCode() {
        int result = 17;
        int baseValue = 31;

        result = baseValue * result + (getName() != null ? getName().hashCode() : 0);
        result = baseValue * result + getAge();

        return result;
    }
}
