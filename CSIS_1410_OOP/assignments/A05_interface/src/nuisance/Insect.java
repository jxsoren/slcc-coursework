package nuisance;

/**
 * This class represents an Insect w/ a specific species
 *
 * @author Josh Sorensen
 */

public class Insect {
    private String species;

    /**
     * Constructs an Insect with the specified species
     *
     * @param species the species of the Insect
     */

    public Insect(String species) {
        this.species = species;
    }

    /**
     * Returns the species of the insect
     *
     * @return the species of the insect
     */

    public String getSpecies() {
        return species;
    }

    /**
     * Returns a formatted string that contains the classname and species of the Insect
     * <p>
     * E.g.:  Insect: wasp
     *
     * @return a formatted string that contains the classname and species of the Insect
     */

    @Override
    public String toString() {
        return String.format("%s: %s", getClass().getSimpleName(), getSpecies());
    }
}
