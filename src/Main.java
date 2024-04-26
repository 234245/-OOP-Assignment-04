import java.util.Scanner;

class Month {
    private int month;

    public Month(int month) {
        this.month = month;
    }

    public int getLength() {
        int length;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                length = 31;
                break;
            case 4: case 6: case 9: case 11:
                length = 30;
                break;
            case 2:
                length = 28;
                break;
            default:
                length = -1; // Invalid month
        }
        return length;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month: ");
        int month = scanner.nextInt();

        Month inputMonth = new Month(month);
        int days = inputMonth.getLength();

        if (days != -1) {
            System.out.println(days + " days");
        } else {
            System.out.println("Invalid month");
        }
    }
}
