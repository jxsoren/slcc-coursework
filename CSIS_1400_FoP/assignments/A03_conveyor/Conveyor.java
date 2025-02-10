/*****************************************
 * Assignment: A03 - Conveyor
 *
 * Author: Josh Sorensen
 ******************************************/

public class Conveyor {
    // fields
    private String type;
    private double speed; // speed in m/s (meters per second)

    // constructors
    public Conveyor(String type, double speed) {
        this.type = type;
        setSpeed(speed);
    }

    // methods
    public String getType() {
        return type;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed >= 0) {
            this.speed = speed;
        }
    }

    public double timeToTransport(double distance) {
        return distance / speed;
    }
}