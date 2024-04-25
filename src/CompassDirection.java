import java.util.Scanner;
   public class CompassDirection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the angle (in degrees): ");
        int angle = scanner.nextInt();
        String direction = getCompassDirection(angle);
        System.out.println("Nearest compass direction: " + direction);
        scanner.close();
    }
     public static String getCompassDirection(int angle) {
        String[] directions = {"N", "NE", "E", "SE", "S", "SW", "W", "NW"};
        int[] angles = {0, 45, 90, 135, 180, 225, 270, 315};

        int minDifference = Integer.MAX_VALUE;
        int closestIndex = 0;
        for (int i = 0; i < angles.length; i++) {
            int difference = Math.abs(angle - angles[i]);
            if (difference < minDifference) {
                minDifference = difference;
                closestIndex = i;
            }
        }
        return directions[closestIndex];
    }
}
