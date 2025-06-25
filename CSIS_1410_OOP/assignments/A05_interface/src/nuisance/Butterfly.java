package nuisance;

import java.util.List;

/**
 * This class represents a Butterfly that has a species and colors, as well as conforming to the contract of an Insect
 *
 * @author Josh Sorensen
 */

public class Butterfly extends Insect {
    private List<String> colors;

    /**
     * Constructs a defensive copy of a butterfly with the specified species and color
     *
     * @param species the species of the butterfly
     * @param colors  a list of colors for the butterfly
     */

    public Butterfly(String species, List<String> colors) {
        super(species);
        this.colors = List.copyOf(colors); // defensive copy of colors to avoid mutation downstream
    }

    /**
     * Copy constructor that constructs a defensive copy of a butterfly given a Butterfly object
     *
     * @param butterfly a butterfly object
     */

    public Butterfly(Butterfly butterfly) {
        this(butterfly.getSpecies(), List.copyOf(butterfly.getColors())); // defensive copy of colors to avoid mutation downstream
    }

    /**
     * Returns a defensive copy of the butterfly's colors
     *
     * @return a defensive copy of the butterfly's colors
     */

    public List<String> getColors() {
        return List.copyOf(colors); // defensive copy of colors to avoid mutation downstream
    }

    /**
     * Returns a formatted string that contains the species of the butterfly as well as all of its colors
     * <p>
     * <p>
     * If no color has been provided, the empty brackets are added to the string.
     * E.g.:  Monarch [yellow, orange, black]
     * E.g.:  Morpho [blue]
     * E.g.:  Phoebis []
     *
     * @return a formatted string that contains the species of the butterfly as well as all of its colors
     */

    @Override
    public String toString() {
        return getSpecies() + " " + getColors();
    }
}
