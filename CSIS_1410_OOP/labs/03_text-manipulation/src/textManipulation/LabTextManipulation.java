package textManipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class LabTextManipulation {
    public static void main(String[] args) {
        // Inside the main method, create a variable called parks and assign it an empty ArrayList of strings.
        ArrayList<String> parks = new ArrayList<>();

        // Read in the names of national parks from the user until the user enters done (or DONE,
        //or dOnE, .. )
        // Keep in mind that the names of some national parks consist of more than one word, for example, Mesa Verde.
        //As you read in the national parks, add them to the list. When you are done reading in the user input,
        // print an empty line to separate the user input from the rest of the output.

        Scanner input = new Scanner(System.in);
        String sentinelValue = "DONE";
        String userChoice;

        do {
            System.out.print("Please enter your favorite National Park or DONE to stop: ");
            userChoice = input.nextLine();

            if (!userChoice.equalsIgnoreCase(sentinelValue)) {
                parks.add(userChoice);
            }

        } while (!userChoice.equalsIgnoreCase(sentinelValue));

        String fancyString = toFancyString(parks);
        System.out.printf("toFancyString ===> %s%n", fancyString);
    }

    private static String toFancyString(ArrayList<String> list) {
        StringBuilder currentString = new StringBuilder();

        String finalString = list.getLast();
        for (String string : list) {
            String originalString = string;

            // Force string to lower case and remove leading or trailing whitespace
            string = string.strip().toLowerCase();

            // Split out string into array of chars
            char[] chars = string.toCharArray();

            // Make first character uppercase
            chars[0] = Character.toUpperCase(chars[0]);

            String formattedString = new String(chars);

            if (!originalString.equals(finalString)) {
                formattedString += " | ";
            }

            currentString.append(formattedString);
        }

        return currentString.toString();
    }

}
