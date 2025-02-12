public class Char {
    public static void main(String[] argv) {
        char dash = '-';

        System.out.printf("Dash:%c%n", dash);

        char a = 'a';
        char letter = a;

        char b = letter += 1;
        char c = letter += 1;

        letter += 2;
        char e = letter;

        System.out.printf("Letter:%c a:%c b:%c c:%c e:%c%n", letter, a, b, c, e);

        int copyrightNumber = '\u00A9';
        System.out.printf("Copyright sign: %c %d %X%n", copyrightNumber, copyrightNumber, copyrightNumber);

        int yen = '¥';
        System.out.printf("Yen: %c %d %X%n", yen, yen, yen);
    }
}