package phones;

/**
 * Represents a rotary phone that extends the basic Phone and DeskPhone functionality.
 * A RotaryPhone has a voltage requirement and can be connected or disconnected from a power source.
 * New RotaryPhone instances are created in a disconnected state.
 *
 * @author Josh Sorensen
 */

public class RotaryPhone extends DeskPhone {

    /**
     * Constructs a new RotaryPhone with the specified model, dimensions and voltage.
     * The phone is initiated in a disconnected state
     *
     * @param model     the model name of the rotary phone
     * @param dimension the physical dimensions of the phone
     * @param voltage   the voltage requirement
     */

    public RotaryPhone(String model, Dimension dimension, Voltage voltage) {
        super(model, dimension, voltage);
    }

    /**
     * Return the following string: <br>
     * Rotating the dial to call {number}<br><br>
     * E.g., Rotating the dial to call 8015817200<br>
     *
     * @return a string that indicates the rotary phone is rotating the dial to call another number
     */

    @Override
    public String call(long number) {
        return String.format("Rotating the dial to call %s", number);
    }
}
