public class Pattern3 {
    public static void main(String[] args) {
        String circles = "o ";
        String dots = ". ";
        int rows = 10;

        // Print n rows
        for (int i = rows; i > 0; i--) {

            // Print (i) circles
            for (int n1 = i; n1 > 0; n1--) {
                System.out.print(circles);
            }

            // Print (rows - i) dots
            for (int n2 = 0; n2 < (rows - i); n2++) {
                System.out.print(dots);
            }

            // Row is complete.
            // Print a newline to separate rows
            System.out.println();
        }
    }
}