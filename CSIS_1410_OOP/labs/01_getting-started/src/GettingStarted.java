public class GettingStarted {
    public static void main(String[] args) {
        System.out.println("Hi, I am Josh");

        String[] quotes = {
                "I'll be back. - Terminator",
                "Here's Johnny! - The Shining"
        };

        System.out.println("Quotes:");
        for (String quote : quotes) {
            System.out.printf("\t%s%n", quote);
        }
    }
}
