class TourItinerary {
    private String day;
    private String time;
    private String activity;

    // Constructor
    public TourItinerary(String day, String time, String activity) {
        this.day = day;
        this.time = time;
        this.activity = activity;
    }

    // Getter methods
    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    public String getActivity() {
        return activity;
    }

    // Method to display itinerary details
    public void displayItinerary() {
        System.out.println("Day: " + day);
        System.out.println("Time: " + time);
        System.out.println("Activity: " + activity);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an array of TourItinerary objects
        TourItinerary[] itinerary = {
                new TourItinerary("sunday", "09:00 AM", "City Tour"),
                new TourItinerary("sunday", "12:00 PM", "Lunch at Central Park"),
                new TourItinerary("sunday", "03:00 PM", "Museum Visit"),
                new TourItinerary("monday", "10:00 AM", "Beach Trip"),
                new TourItinerary("monday", "01:00 PM", "Lunch by the Sea"),
                new TourItinerary("monday", "04:00 PM", "Shopping Tour")
        };

        // Print the itinerary for each day
        System.out.println("Tour Itinerary:");
        for (TourItinerary t : itinerary) {
            t.displayItinerary();
        }
    }
}