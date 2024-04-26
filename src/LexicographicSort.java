import java.util.Arrays;
import.java.util.Scanner;
public class LexicographicSort {
    public static void main(String[] args) {
        Scanner scanner = new scanner(System.in);
// Read in three strings
        System.out.print("Enter three strings: ");
        String[] strings = new String[3];
        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.next();
        }
// Sort the strings lexicographically
        Arrays.sort(strings);
// Print the sorted strings
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }
        scanner.close();
    }
}