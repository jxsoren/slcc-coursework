import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int exitProgram;

        do {
            System.out.print("Enter the first number: ");
            int firstNumber = input.nextInt();
            System.out.print("Enter the second number number: ");
            int secondNumber = input.nextInt();

            // Consume \n from buffer
            input.nextLine();
            System.out.print("Enter an operator (+, -, *, /): ");
            String operator = input.nextLine();

            switch (operator) {
                case "+":
                    double additionResult = firstNumber + secondNumber;
                    printCalcResult(firstNumber, operator, secondNumber, additionResult);
                    break;
                case "-":
                    double subtractionResult = firstNumber - secondNumber;
                    printCalcResult(firstNumber, operator, secondNumber, subtractionResult);
                    break;
                case "*":
                    double multiplicationResult = firstNumber * secondNumber;
                    printCalcResult(firstNumber, operator, secondNumber, multiplicationResult);
                    break;
                case "/":
                    if (secondNumber == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        break;
                    }

                    double divisionResult = (double) firstNumber / secondNumber;
                    printCalcResult(firstNumber, operator, secondNumber, divisionResult);
                    break;
                case "%":
                    double moduloResult = firstNumber % secondNumber;
                    printCalcResult(firstNumber, operator, secondNumber, moduloResult);
                    break;
                default:
                    System.out.println("Invalid operator. Please use +, -, *, or /.");
                    break;
            }


            System.out.print("1 to continue. 0 to exit. ");
            exitProgram = input.nextInt();
            System.out.println();

        } while (exitProgram != 0);

    }

    private static void printCalcResult(int firstNumber, String operator, int secondNumber, double result) {
        System.out.printf("Result: %d %s %d = %.2f%n%n", firstNumber, operator, secondNumber, result);
    }

}
