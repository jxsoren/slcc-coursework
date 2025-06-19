package labInterface;

/**
 * This class represents a Hangglider
 */

public class Hangglider implements Flyable {
    private final boolean isRigidWing;

    /**
     * @param rigidWing if the rigidWing contains a rigid wing or not
     */

    public Hangglider(boolean rigidWing) {
        isRigidWing = rigidWing;
    }

    /**
     * @return a string that represents the hangglider
     */

    @Override
    public String toString() {
        return String.format(isRigidWing ? "Rigid-wing" : "Flex-wing");
    }

    /**
     * Prints a message indicating that the hangglider has launched
     */

    @Override
    public void launch() {
        System.out.println("Running until take-off");
    }

    /**
     * Prints a message indicating that the hangglider has landed
     */

    @Override
    public void land() {
        System.out.println("Gliding to a land");
    }
}
