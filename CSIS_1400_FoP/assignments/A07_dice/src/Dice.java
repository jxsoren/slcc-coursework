/**********************************************
 * Author: Josh Sorensen
 *
 * Assignment: A07 - Dice
 ***********************************************/

import java.util.Random;
import java.util.Arrays;

public class Dice {
    private static final Random random = new Random();
    private static final int NUMBER_OF_ROLLS = 36_000;

    // Each index represents the dice roll sum (excluding 0 and 1)
    // index 2 = dice roll sum of 2
    // index 7 = dice roll sum of 7
    // index 12 = dice roll sum of 12
    // etc.
    //  -  -   2     3    4      5     6     7     8     9    10    11    12
    // [0, 0, 961, 2070, 3042, 4058, 4902, 5964, 4977, 3953, 2999, 2068, 1006]
    private static final int[] rollFrequencyCounts = new int[13];

    public static void main(String[] args) {
        // Roll the two dice 36k times
        for (int i = 0; i < NUMBER_OF_ROLLS; i++) {
            int rollSum = diceRollSum();
            rollFrequencyCounts[rollSum]++;
        }

        System.out.println();
        displayResults();
        System.out.println();
    }

    // Helper Methods

    private static int diceRollSum() {
        int roll1 = random.nextInt(1, 7);
        int roll2 = random.nextInt(1, 7);

        return roll1 + roll2;
    }

    private static void displayResults() {
        String[] headers = {"Sum", "Frequency", "Percentage"};
        for (String header : headers) {
            System.out.printf("%s  ", header);
        }

        for (int i = 2; i < rollFrequencyCounts.length; i++) {
            int rollFrequency = rollFrequencyCounts[i];
            double frequencyPercent = frequencyPercentage(rollFrequency);
            System.out.printf("%n%3d%11d%11.1f%%", i, rollFrequency, frequencyPercent);
        }
    }

    private static double frequencyPercentage(int rollCount) {
        double decimal = rollCount / (double) NUMBER_OF_ROLLS;
        return decimal * 100; // move decimal point over 2 digits
    }
}
