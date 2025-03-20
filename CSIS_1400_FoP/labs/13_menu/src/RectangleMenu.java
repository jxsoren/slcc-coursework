import java.util.Scanner;

public class RectangleMenu {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        Scanner input = new Scanner(System.in);
        int selection;

        do {
            menuPrompt();
            selection = input.nextInt();

            switch (selection) {
                case 0:
                    System.out.println("good bye");
                    break;
                case 1:
                    System.out.printf("Area: %d%n", rectangle.area());
                    break;
                case 2:
                    System.out.printf("Perimeter: %d%n", rectangle.perimeter());
                    break;
                case 3:
                    System.out.printf("Length: %d%n", rectangle.getLength());
                    System.out.printf("Width: %d%n", rectangle.getWidth());
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }

            System.out.println();
        } while (selection != 0);
    }

    private static void menuPrompt() {
        System.out.println("1 .. area");
        System.out.println("2 .. perimeter");
        System.out.println("3 .. length and width");
        System.out.println("0 .. exit");
        System.out.print("Your choice: ");
    }
}