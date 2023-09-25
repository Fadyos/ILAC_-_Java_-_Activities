package ExceptionExercise_2;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 10: ");
        int number = scanner.nextInt();

        try {
            int factorial = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        } catch (CustomException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static int calculateFactorial(int n) throws CustomException {
        if (n < 1 || n > 10) {
            throw new CustomException("Number must be between 1 and 10");
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
