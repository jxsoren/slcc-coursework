package labInterface;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class is used to implement the different classes in this lab
 */

public class App {

    /**
     * Implementation the different classes in this lab
     *
     * @param args CLI arguments
     */

    public static void main(String[] args) {
        // Part 1
        Plane myPlane = new Plane(4, "Boing 747");
        System.out.printf("myPlane: %s%n", myPlane);

        Hangglider myHangglider = new Hangglider(true);
        System.out.printf("myHangglider: %s%n", myHangglider);

        Bird myBird = new Bird("Swallow");
        System.out.printf("myBird: %s%n", myBird);

        // Part 2
        ArrayList<Flyable> flyingThings = new ArrayList<>(Arrays.asList(myPlane, myHangglider, myBird));
        for (Flyable flyableThing : flyingThings) {
            System.out.println();
            System.out.println(flyableThing);
            flyableThing.launch();
            flyableThing.land();
        }
    }
}
