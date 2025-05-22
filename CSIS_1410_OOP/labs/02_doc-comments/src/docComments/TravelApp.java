package docComments;

public class TravelApp {
    public static void main(String[] args) {
        // Cars
        Car m4 = new Car("BMW", "M4", 25);
        Car civic = new Car("Honda", "Civic", 42);

        System.out.println("Cars:");
        System.out.printf("%s %s %d that uses mpg%n", civic.getMake(), civic.getModel(), civic.getMpg());
        System.out.printf("%s %s %d that uses mpg%n", m4.getMake(), m4.getModel(), m4.getMpg());

        System.out.println();

        // California Trip
        TripPlanner californiaTrip = new TripPlanner("SF", "LA", 382, m4);

        System.out.println("California Trip:");
        System.out.println(californiaTrip.toString());
        System.out.printf("fuel consumption: %.2f%n", californiaTrip.fuelConsumption());

        System.out.println();

        // Florida Trip
        TripPlanner floridaTrip = new TripPlanner("Tampa", "Miami", 280, civic);
        System.out.println("Florida Trip:");
        System.out.println(floridaTrip.toString());
        System.out.printf("fuel consumption: %.2f", floridaTrip.fuelConsumption());
    }
}
