package phones;

/**
 * Voltage requirements for desk phones.
 *
 * @author Josh Sorensen
 */

public enum Voltage {
    /**
     * 110 volt (US standard)
     */
    V110,

    /**
     * 220 volt (European standard)
     */
    V220,

    /**
     * Works with both 110V and 220V
     */
    DUAL
}