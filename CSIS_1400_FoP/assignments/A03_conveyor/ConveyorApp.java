/*****************************************
 * Assignment: A03 - Conveyor
 *
 * Author: Josh Sorensen
 ******************************************/

public class ConveyorApp {
    public static void main(String[] argv) {
        Conveyor flatBelt = new Conveyor("flat belt", 0.9);
        Conveyor roller = new Conveyor("roller", -0.5);

        double transportDistance = 50;

        // Flat Belt
        System.out.printf("Conveyor1: %s conveyor with a speed of %.1f m/s%nTime to transport an item %.0f m: %.1f s%n%n",
                flatBelt.getType(), flatBelt.getSpeed(), transportDistance, flatBelt.timeToTransport(transportDistance));

        // Roller
        System.out.printf("Conveyor2: %s conveyor with a speed of %.1f m/s%nTime to transport an item %.0f m: %.1f s%n%n",
                roller.getType(), roller.getSpeed(), transportDistance, roller.timeToTransport(transportDistance));

        // Updating speeds
        System.out.println(".. updating speed\n");

        flatBelt.setSpeed(-3);
        roller.setSpeed(0.4);

        // Updated Flat Belt
        System.out.printf("Conveyor1: %s conveyor with a speed of %.1f m/s%nTime to transport an item %.0f m: %.1f s%n%n",
                flatBelt.getType(), flatBelt.getSpeed(), transportDistance, flatBelt.timeToTransport(transportDistance));

        // Updated Roller
        System.out.printf("Conveyor2: %s conveyor with a speed of %.1f m/s%nTime to transport an item %.0f m: %.1f s%n",
                roller.getType(), roller.getSpeed(), transportDistance, roller.timeToTransport(transportDistance));

    }
}