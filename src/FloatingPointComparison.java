import java.util.Scanner;

public class FloatingPointComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two floating-point numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        if (areSameUpToTwoDecimalPlaces(num1, num2)) {
            System.out.println("They are the same up to two decimal places.");
        } else {
            System.out.println("They are different.");
        }
    }

    public static boolean areSameUpToTwoDecimalPlaces(double num1, double num2) {
        // Multiply by 100 to shift two decimal places to the left
        int intNum1 = (int) (num1 * 100);
        int intNum2 = (int) (num2 * 100);

        return intNum1 == intNum2;
    }
}
