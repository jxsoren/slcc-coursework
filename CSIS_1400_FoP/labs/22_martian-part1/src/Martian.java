import java.util.Random;

public class Martian {
    private static int count;

    private final String name;
    private final Random rand = new Random();

    public Martian() {
        name = getRandomName();
        count++;
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
