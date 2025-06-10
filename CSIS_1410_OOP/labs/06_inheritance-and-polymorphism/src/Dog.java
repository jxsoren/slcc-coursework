/**
 * @author Josh Sornsen
 * @class CSIS1410
 * @lab Lab: Inheritance | Polymorphism
 * @description This lab is designed
 */

package labPolymorphism;

/**
 * This is a class that represents a Dog.
 *
 * @author CSIS1410 + Josh Sorensen
 */

public class Dog {
    private final String breed;

    /**
     * @param b the breed of the Dog
     */

    public Dog(String b) {
        breed = b;
    }

    /**
     * Prints a string that represents the way the Dog communicates
     */

    public void communicate() {
        System.out.println("bark bark");
    }

    /**
     * Prints a string that represents the way the Dog moves
     */

    public void move() {
        System.out.println("run");
    }

    /**
     * @return the breed of the Dog
     */

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + this.getBreed();
    }
}
