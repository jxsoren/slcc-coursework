/************************************
 *
 *  Name: Josh Sorensen
 *  Midterm Prep
 *
 ************************************/

import java.util.Random;

public class ExerciseRandom {
    public static void main(String[] args) {
        // Pass the value 17 to the constructor of class Random
        // (This way your output should look like the one shown below)
        Random random = new Random(17);

        // Print the numbers in 7 rows of 7 columns each
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                // All random numbers need to be multiples of 50 from 100 to 750 inclusive
                // 2 * 50 = 100 (origin)
                // 15 * 50 = 750 (bound)
                int randomNumber = random.nextInt(2, 16) * 50;
                System.out.printf("%d ", randomNumber);
            }
            System.out.println();
        }
    }
}