import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single character from the alphabet: ");
        String input = scanner.nextLine();
        if (input.length() != 1) {
            System.out.println("Error: Please enter only a single character.");
            return;
        }

        char ch = input.charAt(0);
        if (!Character.isLetter(ch)) {
            System.out.println("Error: Please enter a letter from the alphabet.");
            return;
        }
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
