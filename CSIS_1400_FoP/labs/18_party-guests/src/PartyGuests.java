import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class PartyGuests {
    public static void main(String[] args) {
        int numberOfGuests = 4;
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        ArrayList<String> guestList = new ArrayList<String>();

        System.out.println("Please enter 4 guests:");

        for (int i = 1; i <= numberOfGuests; i++) {
            System.out.printf("guest%d: ", i);
            String nextGuest = input.nextLine();
            guestList.add(nextGuest);
        }

        System.out.printf("Guest list: %s%n", guestList.toString());

        int randomGuestIndex = random.nextInt(0, numberOfGuests + 1);
        System.out.printf("%s can't come%n", guestList.get(randomGuestIndex));
        guestList.remove(randomGuestIndex);

        System.out.printf("Updated guest list: %s%n", guestList.toString());
    }
}
