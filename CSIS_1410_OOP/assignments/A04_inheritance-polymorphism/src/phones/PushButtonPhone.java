package phones;

/**
 * Represents a push button phone that extends the basic Phone functionality.
 * A PushButtonPhone has a voltage requirement and can be connected or disconnected from a power source.
 * New PushButtonPhone instances are created in a disconnected state.
 *
 * @author Josh Sorensen
 */

public class PushButtonPhone extends DeskPhone {
    /**
     * Constructs a new PushButtonPhone with the specified model, dimensions and voltage.
     * The phone is initiated in a disconnected state
     *
     * @param model     the model name of the phone
     * @param dimension the physical dimensions of the phone
     * @param voltage   the voltage requirement
     */

    public PushButtonPhone(String model, Dimension dimension, Voltage voltage) {
        super(model, dimension, voltage);
    }

    /**
     * Return the following string: Pushing buttons to call {number}<br><br>
     * E.g., Pushing buttons to call 8015817200 <br>
     *
     * @return a string that indicates the phone is calling another number
     */

    @Override
    public String call(long number) {
        return String.format("Pushing buttons to call %s", number);
    }
}
