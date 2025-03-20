/***************************************************
 * Author: Josh Sorensen
 *
 * Assignment Volumes allows the user to select
 * shapes from a menu.
 * Based on the user selection the corresponding
 * volume is displayed.
 ****************************************************/

import java.util.Scanner;

public class VolumesMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selection;

        System.out.printf("cuboid(2, 4, 6): volume = %.1f%n",
                Volumes.cuboid(2, 4, 6));
        System.out.printf("cuboid(4): volume = %.1f%n",
                Volumes.cuboid(4));
        System.out.printf("ellipsoid(2, 4, 6): volume = %.1f%n",
                Volumes.ellipsoid(2, 4, 6));
        System.out.printf("ellipsoid(4): volume = %.1f%n",
                Volumes.ellipsoid(4));
        System.out.printf("cylinder(3, 4): volume = %.1f%n",
                Volumes.cylinder(3, 4));
        //      System.out.printf("cone(6, 5): volume = %.1f%n",
        //            Volumes.cone(6, 5));


        do {
            selection = input.nextInt();

            switch (selection) {
                case 0:
                    System.out.println("good bye");
                    break;
                case 1:
                    // If it was 1 call the 3 parameter method cuboid and display the result; ‘hard-code’ 2, 4, and 6 as  arguments
                    System.out.print(Volumes.cuboid(2, 4, 6));
                    break;
                case 2:
                    // If it was 2 call the 1 parameter method cuboid and display the result; ‘hard-code’ the value 4 as argument
                    System.out.print(Volumes.cuboid(4));
                    break;
                case 3:
                    // If it was 3 call the 3 parameter method ellipsoid and display the result; ‘hard-code’ 2, 4, and 6 as  arguments
                    System.out.print(Volumes.ellipsoid(2, 4, 6));
                    break;
                case 4:
                    // If it was 4 call the 1 parameter method ellipsoid and display the result; ‘hard-code’ the value 4 as argument
                    System.out.print(Volumes.ellipsoid(4));
                    break;
                case 5:
                    // If it was 5 call the method cylinder and display the result; ‘hard-code’ 3 and 4 as arguments
                    System.out.print(Volumes.cylinder(3, 4));
                    break;
                case 6:
                    // If it was 6 call the method cone and display the result;‘hard-code’ 6 and 5 as arguments
                    // Todo: fix the cone method to properly return the correct volume of a cone
                    System.out.print(Volumes.cone(6, 5));
                    break;
                default:
                    System.out.println("invalid number");
                    break;
            }

        } while (selection != 0);

    }

    public static void menuPrompt() {
        System.out.printf("%-25s %s%n",
                "1 .. cuboid(2, 4, 6)", "2 .. cuboid(4)");
        System.out.printf("%-25s %s%n",
                "3 .. ellipsoid(2, 4, 6)", "4 .. ellipsoid(4)");
        System.out.printf("%-25s %s%n",
                "5 .. cylinder(3,4)", "6 .. cone(6, 5)");
        System.out.println("0 .. exit");
        System.out.print("Your choice: ");
    }
}
