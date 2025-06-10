/**
 * @author Josh Sornsen
 * @lab Lab: Inheritance | Polymorphism
 * @class CSIS1410
 */

package labPolymorphism;

/**
 * This is a class that implements Dog, SledDog and CircusDog
 *
 * @author CSIS1410 + Josh Sorensen
 */

public class DogApp {
    /**
     * Main method that demonstrates the functionality of the Dog class and its subclasses
     *
     * @param args CLI arguments (not used)
     */

    public static void main(String[] args) {
        Dog myDog = new Dog("Greyhound");
        System.out.println(myDog);
        actAsDog(myDog);

        SledDog mySledDog = new SledDog("Husky");
        System.out.println(mySledDog);
        actAsDog(mySledDog);

        CircusDog myCircusDog = new CircusDog("Terrier");
        System.out.println(myCircusDog);
        actAsDog(myCircusDog);

        System.out.println("Using an Array:\n");
        Dog[] dogs = {myDog, mySledDog, myCircusDog};
        for (Dog dog : dogs) {
            System.out.println(dog);
            actAsDog(dog);
        }
    }

    /**
     * This method receives a dog object and calls a few methods that prints
     * information about how the dog behaves
     *
     * @param d a dog object
     */

    private static void actAsDog(Dog d) {
        d.communicate();
        d.move();
        System.out.println();
    }
}
