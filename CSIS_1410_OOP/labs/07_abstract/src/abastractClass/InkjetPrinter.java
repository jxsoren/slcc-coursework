/**
 * @author Josh Sorensen
 * @class CSIS 1410
 * @lab Abstract
 * @description Lab designed to practice the concepts of defining and implementing abstract classes/methods
 */

package abastractClass;

/**
 * Subclass of Printer that's used for creating inkjet printers
 * <p>
 * Each injket printer has all the attributes of a printer, but also contains a remainingCartridge attribute that describes
 * the amount of cartridge remaining.
 *
 * @author Josh Sorensen
 */

public class InkjetPrinter extends Printer {
    private int remainingCartridge;

    public InkjetPrinter(String model) {
        super(model);
        refillCartridge();
    }

    /**
     * @return the remaining toner for the inkjet printer
     */

    public int getRemainingCartridge() {
        return remainingCartridge;
    }

    /**
     * Refills the cartridge of the printer back to the default value of 100
     */

    public void refillCartridge() {
        remainingCartridge = 100;
    }

    /**
     * {@inheritDoc}
     */

    @Override
    public void print() {
        if (getRemainingCartridge() <= 0) {
            System.out.println("The cartridge is empty.");
            return;
        }

        remainingCartridge -= 10;
        System.out.printf("%s is printing. Remaining cartridge: %d%%", getModel(), remainingCartridge);
    }
}
