package phones;

/**
 * Represents a desk phone that extends the basic Phone functionality.
 * A DeskPhone has a voltage requirement and can be connected or disconnected from a power source.
 * New DeskPhone instances are created in a disconnected state.
 *
 * @author Josh Sorensen
 */

public abstract class DeskPhone extends Phone {
    private boolean connected;
    private Voltage voltage;

    /**
     * Constructs a new DeskPhone with the specified model, dimensions and voltage.
     * The phone is initiated in a disconnected state
     *
     * @param model     the model name of the desk phone
     * @param dimension the physical dimensions of the phone
     * @param voltage   the voltage requirement
     */

    protected DeskPhone(String model, Dimension dimension, Voltage voltage) {
        super(model, dimension);
        this.voltage = voltage;
    }

    /**
     * Connects the phone to power
     * Sets the connection status to true
     */

    public void plugIn() {
        connected = true;
    }

    /**
     * Disconnects the desk phone from power
     * Sets the connection state to false
     */

    public void unplug() {
        connected = false;
    }

    /**
     * Checks whether the desk phone is currently connected to power
     *
     * @return true if connected, false otherwise
     */

    public boolean isConnected() {
        return connected;
    }

    /**
     * Return a string  of the following format: <br>
     * {model} {dimension} {voltage} {connectionInfo} <br><br>
     * E.g.:  Crosley CR62-BK (127.0 x 153.0 x 127.0) DUAL connected <br>
     * E.g.:  Opis PushMeFon (228.0 x 217.0 x 130.0) V220 not connected
     *
     * @return a string that displays information about the phone
     */

    @Override
    public String toString() {
        String connectionInfo = isConnected() ? "connected" : "not connected";
        return String.format("%s %s %s", super.toString(), voltage, connectionInfo);
    }
}
