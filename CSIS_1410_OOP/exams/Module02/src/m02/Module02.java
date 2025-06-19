package m02;

/**
 * @author Josh Sorensen
 * @exam Module 02 Exam
 */

public class Module02 {

    public static void main(String[] args) {
        Pet[] pets = {
                new Dog("Buddy", 4),
                new Cat("Whiskers", 3)
        };

        for (Pet pet : pets) {
            printWithLabel("Type", pet.getType());

            String petName = ((Animal) pet).getName();
            printWithLabel("Name", petName);

            String petDialog = ((Animal) pet).speak();
            printWithLabel("Says", petDialog);

            printWithLabel("Play", pet.play());

            System.out.println();
        }
    }

    private static void printWithLabel(String label, String message) {
        System.out.printf("%s: %s%n", label, message);
    }

}
