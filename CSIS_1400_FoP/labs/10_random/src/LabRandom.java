import java.util.Random;

public class LabRandom {

    public static void main(String[] args) {
        Random random = new Random();
        int number;

        // first 100 random numbers from 4 to 7 (incl.)
        for (int i = 1; i <= 100; i++) {
            number = random.nextInt(4, 8);
            System.out.printf("%-5d", number);

            if (i % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println();

        // then 100 multiples of 10 from 10 to 90 (incl.)
        for (int i = 1; i <= 100; i++) {
            number = random.nextInt(1, 10) * 10;
            System.out.printf("%-5d", number);

            if (i % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println();

        // then 100 numbers from 901 to 999 (incl.)
        for (int i = 1; i <= 100; i++) {
            number = random.nextInt(901, 1000);
            System.out.printf("%-5d", number);

            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}