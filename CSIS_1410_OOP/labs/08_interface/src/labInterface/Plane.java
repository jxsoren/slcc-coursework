package labInterface;

/**
 * This class represents an airplane
 */

public class Plane implements Flyable {
    private final int numberOfEngines;
    private final String model;

    /**
     * @param engines the amount of engines in the plane
     * @param m       the model of the plane
     */

    public Plane(int engines, String m) {
        numberOfEngines = engines;
        model = m;
    }

    /**
     * @return a string that represents the plane
     */

    @Override
    public String toString() {
        return String.format("%s with %d engines", model, numberOfEngines);
    }

    /**
     * Prints a message indicating that the plane has taken off
     */

    @Override
    public void launch() {
        System.out.println("Rolling until take-off");
    }

    /**
     * Prints a message indicating that the plane has landed
     */

    @Override
    public void land() {
        System.out.println("Rolling to a stop");
    }
}
