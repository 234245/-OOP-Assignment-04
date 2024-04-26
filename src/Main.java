import java.util.Scanner;

class Card {
    private String notation;
    public Card(String notation) {
        this.notation = notation;
    }
    public String getDescription() {
        if (notation.length() != 2)
            return "Unknown";
        char valueChar = notation.charAt(0);
        char suitChar = notation.charAt(1);
        String value;
        String suit;
        switch (valueChar) {
            case 'A':
                value = "Ace";
                break;
            case '2':
                value = "Two";
                break;
            case '3':
                value = "Three";
                break;
            case '4':
                value = "Four";
                break;
            case '5':
                value = "Five";
                break;
            case '6':
                value = "Six";
                break;
            case '7':
                value = "Seven";
                break;
            case '8':
                value = "Eight";
                break;
            case '9':
                value = "Nine";
                break;
            case 'T':
                value = "Ten";
                break;
            case 'J':
                value = "Jack";
                break;
            case 'Q':
                value = "Queen";
                break;
            case 'K':
                value = "King";
                break;
            default:
                return "Unknown";
        }
        switch (suitChar) {
            case 'D':
                suit = "Diamonds";
                break;
            case 'H':
                suit = "Hearts";
                break;
            case 'S':
                suit = "Spades";
                break;
            case 'C':
                suit = "Clubs";
                break;
            default:
                return "Unknown";
        }
        return value + " of " + suit;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the card notation: ");
        String notation = scanner.nextLine();
        Card card = new Card(notation);
        System.out.println(card.getDescription());
        scanner.close();
    }
}