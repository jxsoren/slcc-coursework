import java.util.Scanner;

public class ParrotTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Parrot myParrot = new Parrot();

        System.out.print("What would you like to say to the parrot? ");
        String parrotPrompt = input.nextLine();

        myParrot.speak(parrotPrompt);
    }
}