package nuisance;

/**
 * This class represents a Mosquito that extends the functionality of an Insect and implements the behavior of a Nuisance
 *
 * @author Josh Sorensen
 */

public class Mosquito extends Insect implements Nuisance {

    /**
     * Constructs an Insect with the specified species
     *
     * @param species the species of the Insect
     */

    public Mosquito(String species) {
        super(species);
    }

    /**
     * Returns a string that indicates the mosquito's species is buzzing
     * <br>
     * Format: {species} buzzing around
     *
     * @return a string that indicates the mosquito's species is buzzing
     */

    public String buzz() {
        return getSpecies() + " buzzing around";
    }

    /**
     * Returns a string that showcases the implementation of a Mosquito being annoying
     *
     * @return a string that showcases the implementation of a Mosquito being annoying
     */

    @Override
    public String annoy() {
        return "buzz buzz buzz";
    }
}
