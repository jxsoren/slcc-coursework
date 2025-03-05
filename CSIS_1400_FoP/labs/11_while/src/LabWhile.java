import java.util.Scanner;

public class LabWhile {
    public static void main(String[] args) {
        multiplyNumbers();
    }

    public static void multiplyNumbers() {
        int product = 1;
        Scanner input = new Scanner(System.in);

        int number = 1;

        while (number != 0) {
            System.out.print("Enter a number (0 to quit): ");
            number = input.nextInt();

            if (number != 0) {
                product *= number;
            }
        }

        System.out.printf("Product: %d%n", product);
    }
}
