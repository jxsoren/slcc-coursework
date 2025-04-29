import java.util.Random;

public class Martian {
    private static int count;

    private final String name;
    private final Random rand = new Random();

    public Martian() {
        name = getRandomName();
        count++;
    }

    static Martian[] invade() {
        Random random = new Random();
        int randomMartianAmount = random.nextInt(2, 11);

        Martian[] martians = new Martian[randomMartianAmount];

        for (int i = 0; i < randomMartianAmount; i++) {
            martians[i] = new Martian();
        }

        return martians;
    }

    static Martian[] invade(int numOfMartians) {
        Martian[] martians = new Martian[numOfMartians];

        for (int i = 0; i < numOfMartians; i++) {
            martians[i] = new Martian();
        }

        return martians;
    }

    public void doSomething() {
        if (count < 5) {
            System.out.printf("%s is hiding%n", name);
        } else {
            System.out.println("ATTACK!");
        }
    }

    private String getRandomName() {
        char randomLetter = (char) rand.nextInt(65, 91);
        int randomNumber = rand.nextInt(10, 100);

        return randomLetter + Integer.toString(randomNumber);
    }

    @Override
    public String toString() {
        return String.format("%s\\%d", name, count);
    }
}
