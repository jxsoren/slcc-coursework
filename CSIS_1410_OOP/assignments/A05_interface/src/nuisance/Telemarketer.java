package nuisance;

/**
 * This class represents a Telemarketer that extends the functionality of a Person
 *
 * @author Josh Sorensen
 */

public class Telemarketer extends Person implements Nuisance {

    /**
     * Constructs a Telemarketer with the specified name and age
     *
     * @param name the name of the Telemarketer
     * @param age  the age of the Telemarketer, must be in the range of (1-150)
     * @throws IllegalArgumentException throws an exception that if an invalid age is provided and include an error message stating that age needs to be from the range [1, 150]
     */
    public Telemarketer(String name, int age) throws IllegalArgumentException {
        super(name, age);
    }

    /**
     * Returns a string that describes the Telemarketer tasks
     * <p>
     * Should return a string of the following format
     * {name} pressures others to buy stuff
     * E.g., Chap pressures others to buy stuff
     *
     * @return a string that describes the Telemarketer tasks
     */

    public String giveSalesPitch() {
        return getName() + " pressures others to buy stuff";
    }

    /**
     * Returns a string that represents the sales person being annoying
     * <p>
     * {name} annoys by giving a sales pitch
     * E.g., Chap annoys by giving a sales pitch
     *
     * @return a string that represents the sales person being annoying
     */

    @Override
    public String annoy() {
        return getName() + " annoys by giving a sales pitch";
    }
}
