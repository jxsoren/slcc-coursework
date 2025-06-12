/**
 * @author Josh Sorensen
 * @class CSIS 1410
 * @lab Abstract
 * @description Lab designed to practice the concepts of defining and implementing abstract classes/methods
 */

package abastractClass;

/**
 * Subclass of Printer that's used for creating laser printers
 * <p>
 * Each laser printer has all the attributes of a printer, but also contains a remainingToner attribute that describes
 * the amount of toner remaining.
 *
 * @author Josh Sorensen
 */

public class LaserPrinter extends Printer {
    private int remainingToner;

    public LaserPrinter(String model) {
        super(model);
        refillToner();
    }

    /**
     * @return the remaining toner for the laser printer
     */

    public int getRemainingToner() {
        return remainingToner;
    }

    /**
     * Refills the toner of the printer back to the default value of 100
     */

    public void refillToner() {
        remainingToner = 100;
    }

    /**
     * {@inheritDoc}
     */

    @Override
    public void print() {
        if (getRemainingToner() <= 0) {
            System.out.println("The toner is empty.");
            return;
        }

        remainingToner -= 10;
        System.out.printf("%s is printing. Remaining toner: %d%%", getModel(), remainingToner);
    }
}
