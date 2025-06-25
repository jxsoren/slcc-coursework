package nuisance;

/**
 * This class represents a PeskyMosquito that extends the functionality of a Mosquito
 *
 * @author Josh Sorensen
 */

public class PeskyMosquito extends Mosquito {

    /**
     * Constructs an PeskyMosquito with the specified species
     *
     * @param species the species of the Insect
     */
    public PeskyMosquito(String species) {
        super(species);
    }

    /**
     * Returns a string indicating that the pesky mosquito is biting
     *
     * @return a string indicating that the pesky mosquito is biting
     */

    public String bite() {
        return "sucking blood";
    }
}
