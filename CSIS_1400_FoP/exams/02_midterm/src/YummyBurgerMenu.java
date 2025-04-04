import java.util.Scanner;

public class YummyBurgerMenu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        printWelcomeMessage();

        int customerChoice;

        do {
            printMenu();
            customerChoice = input.nextInt();

            switch (customerChoice) {
                case 0 -> printGoodbyeMessage();
                case 1 -> System.out.println("\nYou chose a hamburger \uD83C\uDF54 !!!");
                case 2 -> System.out.println("\nYou chose fries \uD83C\uDF5F !!!");
                case 3 -> System.out.println("\nYou chose a milkshake \uD83E\uDD64 !!!");
                case 4 -> System.out.println("\nYou chose a corn dog \uD83C\uDF3D\uD83C\uDF2D !!!");
                case 5 ->
                        System.out.println("\nYou choose chili cheese fries \uD83C\uDF36\uFE0F\uD83E\uDDC0\uD83C\uDF5F !!!");
                case 6 -> System.out.println("\nYou chose mystery slush drink ?\uD83E\uDD64? !!!");
                default -> printInvalidChoiceMessage(customerChoice);
            }

        } while (customerChoice != 0);

    }

    private static void printWelcomeMessage() {
        System.out.println("\nWelcome to Josh's Yummy Burgers \uD83C\uDF54 !!!");
        System.out.println("Please see our menu below... ");
    }

    private static void printGoodbyeMessage() {
        System.out.println("Sorry to see you go. We hope to see you soon!!!");
        System.out.println("\uD83D\uDC4B \uD83D\uDC4B \uD83D\uDC4B");
    }

    private static void printInvalidChoiceMessage(int choice) {
        System.out.printf("\nLooks like we dont have a number %d on the menu ❌. Sorry, buddy.%n", choice);
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("1 .. hamburger \uD83C\uDF54");
        System.out.println("2 .. fries \uD83C\uDF5F");
        System.out.println("3 .. milkshake \uD83E\uDD64");
        System.out.println("4 .. corn dog \uD83C\uDF3D\uD83C\uDF2D");
        System.out.println("5 .. chili cheese fries \uD83C\uDF36\uFE0F\uD83E\uDDC0\uD83C\uDF5F");
        System.out.println("6 .. mystery slush drink ?\uD83E\uDD64?");
        System.out.println("0 .. leave restaurant \uD83D\uDEAA");
        System.out.print("\nWhacha gonna choose?: ");
    }
}

