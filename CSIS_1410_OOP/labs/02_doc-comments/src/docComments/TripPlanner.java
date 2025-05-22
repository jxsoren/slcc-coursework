package docComments;

/**
 * @author Josh Sorensen
 * @class CSIS 1410
 * @assignment TripPlanner
 * @description This is a trip planner
 */

public class TripPlanner {
    private String departure;
    private String arrival;
    private int distance;
    private Car car;

    /**
     * @param departure the departure location of a trip
     * @param arrival   the arrival location of a trip
     * @param distance  the distance location of a trip
     * @param car       the car used in the trip
     */

    public TripPlanner(String departure, String arrival, int distance, Car car) {
        this.departure = departure;
        this.arrival = arrival;
        this.distance = distance;
        this.car = car;
    }

    // Make the following change to the method toString:
    // Use only the model to represent the car, not the toString method of class Car.

    /**
     * @return information about the trip
     */
    @Override
    public String toString() {
        return "TripPlanner{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", distance=" + distance +
                ", car=" + car.getModel() +
                '}';
    }
    // In method fuelConsumption do the following:
    // Calculate the amount of fuel that is required to travel from the departure to the
    // destination and return the result in full precision (not rounded).

    /**
     * @return the amount of fuel that is required to travel from the departure to the destination
     */

    public double fuelConsumption() {
        return (double) distance / car.getMpg();
    }

}