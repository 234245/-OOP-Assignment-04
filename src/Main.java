import java.util.Scanner;

class Grade {
    public double getNumericGrade(String letterGrade) {
        char grade = letterGrade.charAt(0);
        double value = 0.0;

        switch (grade) {
            case 'A':
                value = 4.0;
                break;
            case 'B':
                value = 3.0;
                break;
            case 'C':
                value = 2.0;
                break;
            case 'D':
                value = 1.0;
                break;
            case 'F':
                value = 0.0;
                break;
            default:
                System.out.println("Invalid grade entered.");
                return -1.0;
        }

        if (letterGrade.length() > 1) {
            char modifier = letterGrade.charAt(1);
            if (modifier == '+') {
                value += 0.3;
            } else if (modifier == '-') {
                value -= 0.3;
            } else {
                System.out.println("Invalid modifier entered.");
                return -1.0;
            }
        }

        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String letterGrade = scanner.next().toUpperCase(); // Convert to uppercase for case insensitivity

        Grade grade = new Grade();
        double numericGrade = grade.getNumericGrade(letterGrade);

        if (numericGrade != -1.0) {
            System.out.println("The numeric value is " + numericGrade + ".");
        }
    }
}
