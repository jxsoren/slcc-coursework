/**
 * @author Josh Sorensen
 * @class CSIS 1410
 * @lab Abstract
 * @description Lab designed to practice the concepts of defining and implementing abstract classes/methods
 */

package abastractClass;

public class PrintApp {

    public static void main(String[] args) {
        // * Create an array of printers and add two printers:
        InkjetPrinter inkjetPrinter = new InkjetPrinter("Canon TS202");
        LaserPrinter laserPrinter = new LaserPrinter("Samsung Xpress");
        Printer[] printers = {inkjetPrinter, laserPrinter};

        // * Loop through the array. For each of the printers do the following:
        // * Print the printer (the string provided by the toString method)
        // * Call the print method 11 times (avoid code duplication)
        // * Print an empty line
        // * Refill the toner / cartridge of the printers.

        for (Printer printer : printers) {
            System.out.println(printer);

            for (int i = 0; i < 11; i++) {
                printer.print();
                System.out.println();
            }
        }

        for (Printer printer : printers) {
            if (printer instanceof LaserPrinter) {
                ((LaserPrinter) printer).refillToner();
                System.out.printf("Remaining toner after refilling: %d%%%n", ((LaserPrinter) printer).getRemainingToner());
            }

            if (printer instanceof InkjetPrinter) {
                ((InkjetPrinter) printer).refillCartridge();
                System.out.printf("Remaining cartridge after refilling: %d%%%n", ((InkjetPrinter) printer).getRemainingCartridge());
            }
        }
    }
}
