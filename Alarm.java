import java.time.*; // import the LocalDate class

public class Alarm {
    public static void main(String[] args) {
        // System.out.println("hello");
        LocalTime myObj = LocalTime.now(); // Create a date object
        System.out.println(myObj.toString().substring(0, 5) == "15:32"); // Display the current date
    }
}
