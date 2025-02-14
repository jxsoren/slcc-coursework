public class GoldenRatio {
    public static void main(String[] args) {
        int number1 = 100004;
        int number2 = 161800;
        System.out.printf("isGoldenRatio(%d,%d): %b%n",
                number1, number2, isGoldenRatio(number1, number2));
    }

    public static boolean isGoldenRatio(double number1, double number2) {
        double quotient = number1 > number2 ? number1 / number2 : number2 / number1;

        double rounded_quotient = (double) Math.round(quotient * 1000.00) / 1000.00;

        return rounded_quotient == 1.618;
    }
}
