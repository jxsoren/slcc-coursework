package nuisance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class is the test client that tests the functionality of all classes in this project
 *
 * @author Josh Sorensen
 * @class CSIS 1410
 */

public class NuisanceApp {

    public static void main(String[] args) {
        Friend[] friends = {new Friend("Juan", 27, Hobby.MUSIC), new Friend("Kate", 27, Hobby.SPORTS), new Friend("Alex", 21, Hobby.MUSIC),};

        printFormattedArrayElements("Friends", friends);

        System.out.println();

        Friend friend1 = friends[0];
        Friend friend2 = friends[1];
        Friend friend3 = friends[2];

        System.out.printf("friend1 equals friend2: %b%n", friend1.equals(friend2));
        System.out.printf("friend1 equals friend3: %b%n", friend1.equals(friend3));
        System.out.printf("friend2 equals new friend: %b%n", friend2.equals(new Friend("Kate", 27, Hobby.SPORTS)));

        System.out.println();

        Telemarketer telemarketer = new Telemarketer("Fritz", 25);
        System.out.printf("telemarketer: %s%n", telemarketer);

        System.out.println();

        Mosquito mosquito = new Mosquito("Aedes vexans");
        PeskyMosquito peskyMosquito = new PeskyMosquito("Anopheles walkeri");
        List<String> colors = new ArrayList<>(Arrays.asList("yellow", "black", "blue"));
        Butterfly butterfly1 = new Butterfly("Swallowtail", colors);
        Butterfly butterfly2 = new Butterfly(butterfly1);

        Insect[] insects = {mosquito, peskyMosquito, butterfly1, butterfly2};

        printFormattedArrayElements("Insects", insects);

        System.out.println();

        Nuisance[] nuisances = {telemarketer, mosquito, peskyMosquito};
        System.out.printf("%d %s: %n", nuisances.length, "Nuisances");

        for (Nuisance nuisance : nuisances) {
            if (nuisance instanceof Mosquito) {
                System.out.println(((Mosquito) nuisance).buzz());
            }

            if (nuisance instanceof PeskyMosquito) {
                System.out.println(((PeskyMosquito) nuisance).bite());
            }

            System.out.println(nuisance.annoy() + "\n");
        }
    }

    // Helper methods

    /**
     * Takes a title and an array of any object and prints a formatted list according to the expected output of this assignment
     *
     * @param title title included within print statement
     * @param array array of any object
     * @param <T>   generic type that accepts any object
     */

    private static <T> void printFormattedArrayElements(String title, T[] array) {
        System.out.printf("%d %s: %n", array.length, title);

        for (int i = 0; i < array.length; i++) {
            int normalizedListNumber = i + 1;
            System.out.printf("%s%d: %s%n", title.toLowerCase(), normalizedListNumber, array[i]);
        }
    }
}
