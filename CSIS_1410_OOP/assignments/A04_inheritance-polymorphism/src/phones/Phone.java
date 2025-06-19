package phones;

/**
 * Abstract base class representing a phone with basic properties and functionality.
 * All phones have a model name and physical dimensions. Specific phone types
 * extend this class to provide their own implementation of calling behavior.
 *
 * <p>This class serves as the foundation for the phone inheritance hierarchy,
 * defining common attributes and requiring subclasses to implement the calling mechanism.</p>
 *
 * @author Josh Sorensen
 */

public abstract class Phone {
    private String model;
    private Dimension dimension;

    /**
     * Constructs a new Phone with the specified model and dimensions.
     * This constructor is protected as Phone is an abstract class and should
     * only be instantiated through its concrete subclasses.
     *
     * @param model the model name of the phone (e.g., "Samsung Galaxy S9")
     * @param dimension the physical dimensions of the phone
     * @throws IllegalArgumentException if model is null or dimension is null
     */

    protected Phone(String model, Dimension dimension) {
        this.model = model;
        this.dimension = dimension;
    }

    /**
     * Makes a phone call to the specified number.
     * The exact mechanism of making the call depends on the specific type of phone
     *
     * @param number the phone number to call
     * @return a string describing how the call is being made, specific to the phone type
     */

    public abstract String call(long number);

    /**
     * Returns a string that formats the model and dimension of the phone
     * <p>
     * E.g.:  Samsung Galaxy S9 (147.7 x 68.7 x 8.5)
     *
     * @return a string that formats the model and dimension of the phone
     */

    @Override
    public String toString() {
        return String.format("%s %s", model, dimension);
    }
}
