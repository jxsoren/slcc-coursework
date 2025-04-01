/************************************
 *
 *  Name: Josh Sorensen
 *  Midterm Prep
 *
 ************************************/

import java.util.Scanner;

public class ExerciseSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String selection;

        // Read in an animal from the user
        System.out.print("Please enter an animal: ");
        selection = input.nextLine();

        switch (selection) {
            // If the animal is a dog, a cat, or a horse, print "That's a mammal"
            case "dog" -> System.out.println("That's a mammal");
            // If the animal is a fish or whale print "Lives in the water"
            case "fish" -> System.out.println("Lives in the water");
            case "whale" -> System.out.println("Lives in the water");
            // If the animal is a bird, a bat, or an insect print "It can fly"
            case "bird" -> System.out.println("It can fly");
            case "bat" -> System.out.println("It can fly");
            case "insect" -> System.out.println("It can fly");
            // Otherwise print "Your choice: whatTheUserEntered"
            default -> System.out.printf("Your choice: %s%n", selection);
        }

    }
}