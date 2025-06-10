/**
 * @author Josh Sornsen
 * @lab Lab: Inheritance | Polymorphism
 * @class CSIS1410
 */

package labPolymorphism;

/**
 * This is a class that represents a Circus Dog that inherits the properties of a Dog
 *
 * @author CSIS1410 + Josh Sorensen
 */

public class SledDog extends Dog {
    /**
     * @param b the breed of the Dog
     */

    public SledDog(String b) {
        super(b);
    }

    /**
     * Prints a string that states the dog is pulling the sled
     */

    public void pullSled() {
        System.out.println("pulling the sled");
    }
}
