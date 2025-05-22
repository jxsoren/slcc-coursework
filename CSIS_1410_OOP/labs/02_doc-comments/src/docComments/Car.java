package docComments;

public class Car {
    private String make;
    private String model;
    private int mpg;

    /**
     * Creates a car object
     *
     * @param make  the make of a car
     * @param model the model of a car
     * @param mpg   the miles per gallon of a car
     */

    public Car(String make, String model, int mpg) {
        this.make = make;
        this.model = model;
        this.mpg = mpg;
    }

    /**
     * @return the make of the car
     */

    public String getMake() {
        return make;
    }

    /**
     * @return the model of a car
     */

    public String getModel() {
        return model;
    }

    /**
     * @return the miles per gallon of a car
     */

    public int getMpg() {
        return mpg;
    }

}
