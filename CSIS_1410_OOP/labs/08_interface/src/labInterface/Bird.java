package labInterface;

/**
 * This class represents a Bird that can fly
 */

public class Bird implements Flyable {
    private final String type;

    /**
     * Constructs a bird with the specified type
     *
     * @param t the type of the bird
     */
    public Bird(String t) {
        type = t;
    }

    /**
     * The type of the bird
     *
     * @return A string that contains the bird's type
     */

    @Override
    public String toString() {
        return type;
    }

    /**
     * Prints a string that indicates that the bird has taken off
     */

    @Override
    public void launch() {
        System.out.println("Flapping the wings to take off");
    }

    /**
     * Prints a string that indicates that the bird is landing
     */

    @Override
    public void land() {
        System.out.println("Flapping the wings until landing");
    }
}
