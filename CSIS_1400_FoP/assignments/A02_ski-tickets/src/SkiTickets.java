import java.util.Scanner;

public class SkiTickets {
    public static void main(String[] args) {
        // Need an instance of Scanner
        Scanner input = new Scanner(System.in);

        // Adult ticket amount
        System.out.print("Number of adult tickets: ");
        int adultTicketCount = input.nextInt();

        // Youth ticket amount
        System.out.print("Number of youth tickets: ");
        int youthTicketCount = input.nextInt();
        input.nextLine();  // Clear buffer of newline sequences

        // Customer Name
        System.out.print("Name: ");
        String customerName = input.nextLine();

        // Totals
        double adultTicketTotalCost = adultTicketCount * 93;
        double youthTicketTotalCost = youthTicketCount * 47;

        double grandTotalAmount = adultTicketTotalCost + youthTicketTotalCost;

        // Print Invoice
        System.out.print("\n\n");
        System.out.printf("Invoice for %s%n%n", customerName);

        System.out.printf("Adult tickets  %-2s .. $ %.2f%n", adultTicketCount, adultTicketTotalCost);
        System.out.printf("Youth tickets  %-2s .. $ %.2f%n", youthTicketCount, youthTicketTotalCost);
        System.out.println("-".repeat(29));
        System.out.printf("%23s%.2f%n", "$ ", grandTotalAmount);
        System.out.printf("%29s", "=".repeat(8));
    }
}