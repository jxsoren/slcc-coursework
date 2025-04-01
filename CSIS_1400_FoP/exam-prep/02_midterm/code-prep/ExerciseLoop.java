/************************************
 *
 *  Name: Josh Sorensen
 *  Midterm Prep
 *
 ************************************/

public class ExerciseLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            double squared = Math.pow(i, 2);
            String parity = squared % 2 == 0 ? "is even" : "is not even";

            System.out.printf("#%d: %2d %s%n", i, (int) squared, parity);
        }
    }
}