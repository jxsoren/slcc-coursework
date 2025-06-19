package phones;

import java.util.Random;

/**
 * Represents a smartphone that extends the basic Phone functionality.
 * A SmartPhone has a voltage requirement and can be connected or disconnected from a power source.
 * New DeskPhone instances are created in a disconnected state.
 *
 * @author Josh Sorensen
 */


public class SmartPhone extends Phone {
    private int storage;

    /**
     * Constructs a new SmartPhone with the specified model, dimensions and storage
     * The phone is initiated in a disconnected state
     *
     * @param model     the model name of the phone
     * @param dimension the physical dimensions of the phone
     * @param storage   the storage space available on the smartphone
     * @throws IllegalArgumentException raises exception if the storage isn't a positive number
     */

    public SmartPhone(String model, Dimension dimension, int storage) {
        super(model, dimension);

        if (storage <= 0) {
            throw new IllegalArgumentException("Storage needs to be assigned a positive value.");
        } else {
            this.storage = storage;
        }
    }

    /**
     * Concrete implementation of a phone call. A call is made by taking the passed in number and returning a string
     * that indicates a call is being made
     *
     * @param number the phone number to call
     * @return a string that indicates this phone is calling another number
     */

    @Override
    public String call(long number) {
        return String.format("Calling %d by selecting the number", number);
    }

    /**
     * Browses the web
     *
     * @return a string that indicates the SmartPhone is browsing the web
     */

    public String browse() {
        return "Browsing the web";
    }

    /**
     * Takes either a vertical or horizontal picture (chosen at random).
     *
     * @return a string that indicates the SmartPhone has taken either a vertical or horizontal picture
     */

    public String takePicture() {
        Random random = new Random();
        int randomIndex = random.nextInt(2);

        String verticalPicture = "Taking a vertical picture";
        String horizontalPicture = "Taking a horizontal picture";
        String[] pictureOrientationStrings = {verticalPicture, horizontalPicture};

        return pictureOrientationStrings[randomIndex];
    }

    /**
     * Returns a string that formats the model and dimension of the phone
     * <p>
     * E.g.:  Samsung Galaxy S9 (147.7 x 68.7 x 8.5)
     *
     * @return a string that formats the model and dimension of the phone
     */

    @Override
    public String toString() {
        return String.format("%s %sGB", super.toString(), storage);
    }

}
