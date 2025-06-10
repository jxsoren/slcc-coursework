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

public class CircusDog extends Dog {
    /**
     * @param b the breed of the dog
     */

    public CircusDog(String b) {
        super(b);
    }

    @Override
    public void move() {
        System.out.println("tightrope walking");
    }
}
