import java.util.Scanner;

public class LabMarbles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // First color
        System.out.print("color: ");
        String color1 = input.nextLine();

        // First amount
        System.out.printf("Number of %s marbles: ", color1);
        int number1 = input.nextInt();
        input.nextLine();

        // Second color
        System.out.print("color: ");
        String color2 = input.nextLine();

        // Second amount
        System.out.printf("Number of %s marbles: ", color2);
        int number2 = input.nextInt();
        input.nextLine();

        // Third color
        System.out.print("color: ");
        String color3 = input.nextLine();

        // Third amount
        System.out.printf("Number of %s marbles: ", color3);
        int number3 = input.nextInt();
        input.nextLine();

        System.out.println();

        // Table headers
        System.out.printf("%-12s\t%-12s%n", "Color", "Number of Marbles");
        System.out.printf("%-12s\t%-12s%n", "-".repeat(12), "-".repeat(17));

        // Table data
        System.out.printf("%-12s\t%-12d%n", color1, number1);
        System.out.printf("%-12s\t%-12d%n", color2, number2);
        System.out.printf("%-12s\t%-12d%n", color3, number3);
    }
}
