import java.util.Scanner;

public class LabVariables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Favorite destination: ");

        String destination;
        destination = input.nextLine();

        System.out.printf("Welcome to %s%n%n", destination);

        int kingsPeak = 4124;
        int timpanogos = 3581;

        System.out.printf("Elevation of Kings Peak: %d%n", kingsPeak);
        System.out.printf("Elevation of Timpanogos: %d%n", timpanogos);
    }
}
