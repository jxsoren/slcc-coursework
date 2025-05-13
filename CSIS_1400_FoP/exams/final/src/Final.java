import java.util.Scanner;
import java.util.Arrays;

public class Final {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] roomLayout;

        System.out.print("Enter a width for your room: ");
        int roomWidth = input.nextInt();

        System.out.print("Enter a length for your room: ");
        int roomLength = input.nextInt();

        roomLayout = new String[roomWidth][roomLength];

        // Fill array w/ empty spaces to match example outcome
        for (String[] room : roomLayout) {
            Arrays.fill(room, " ");
        }

        for (String[] room : roomLayout) {
            System.out.println(Arrays.toString(room));
        }

        String furnitureChoice;

        while (true) {
            String furnitureChoicePrompt = """
                    Choose a piece of furniture:
                    T: table
                    C: chair
                    V: television
                    L: lamp
                    S: stool
                    """;

            System.out.print(furnitureChoicePrompt);

            input.nextLine(); // clear the buffer

            furnitureChoice = input.nextLine();

            // sentinel value
            if (furnitureChoice.equals("q")) {
                break;
            }

            System.out.printf("Enter the x coordinate for your %s: ", furnitureChoice);
            int xCoordinate = input.nextInt();

            System.out.printf("Enter the y coordinate for your %s: ", furnitureChoice);
            int yCoordinate = input.nextInt();

            System.out.println(); // spacing

            if (yCoordinate < roomLayout.length && xCoordinate < roomLayout[0].length) {
                roomLayout[yCoordinate][xCoordinate] = furnitureChoice.toUpperCase();
            }

            for (String[] room : roomLayout) {
                System.out.println(Arrays.toString(room));
            }
        }
    }
}
