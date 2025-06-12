/**
 * @author Josh Sorensen
 * @class CSIS 1410
 * @lab Abstract
 * @description Lab designed to practice the concepts of defining and implementing abstract classes/methods
 */

package abastractClass;

/**
 * Abstract base class for different types of printers.
 * <p>
 * Each printer has a model name and unique serial number. Serial numbers
 * are assigned sequentially starting from 12346. Subclasses must implement
 * the printing behavior specific to their printer type.
 *
 * @author Josh Sorensen
 */

public abstract class Printer {
    private String model;
    private static int count;
    private int serialNumber;

    /**
     * Creates a new Printer with the specified model
     * <p>
     * Automatically assigns a unique serial number and increments the total printer count
     *
     * @param model the model of the printer
     */

    protected Printer(String model) {
        this.model = model;
        count++;
        serialNumber = 12345 + count;
    }

    /**
     * Returns the model name for this printer.
     *
     * @return the model of the printer
     */

    public String getModel() {
        return model;
    }

    /**
     * Returns the unique serial number assigned to this printer. Serial numbers are sequential and start from
     * the base number of 12346
     *
     * @return the serial number
     */

    public int getSerialNumber() {
        return serialNumber;
    }

    /**
     * Prints a message that informs the user which printer is printing and how much remaining toner/cartridge is left
     * and decrements the current toner/cartridge by 10%. If the toner/cartridge is empty, a string indicating this is
     * printed
     * <p>
     * e.g.: HP LaserJet Pro is printing. Remaining toner: 90% <br>
     * e.g.: Canon Pixma is printing. Remaining cartridge: 80%
     */

    public abstract void print();

    /**
     * @return a string that contains the type, model and serial number of the given printer <br>
     * <p>
     * e.g.:  InkjetPrinter Canon Pixma #12346 <br>
     * e.g.:  LaserPrinter HP LaserJet Pro #12347 <br>
     */

    @Override
    public String toString() {
        return String.format("%s: %s #%d",
                getClass().getSimpleName(),
                getModel(),
                getSerialNumber()
        );
    }

}
