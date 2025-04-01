
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
// import java.time.format.DateTimeFormatter;
// import java.time.DayOfWeek;




/**
 * Wap to demonstrate the use of java.time package and how to manipulate date and time
 * 1. Display current Date & Time 
 * 2. Add 7 days to current date &time 
 * 3. Subtract 2 hrs from current date &time 
 * 4.Display day of week for current date and time 
 * 5.Provide the format for the date and Time according to your requirement
 */

public class _051_Date_TimeUtility{
    public static void main(String[] args) {
        

    LocalDate currentDate= LocalDate.now();
    LocalTime currentTime = LocalTime.now();
    LocalDateTime currentDateTime = LocalDateTime.now();

    System.out.println("Current Date: "+ currentDate);
    System.out.println("Current Time: "+ currentTime);
    System.out.println("Current Date & Time: "+ currentDateTime);

    LocalDate futureDate = currentDate.plusDays(7);
    System.out.println("\nDate after 7 days: "+ futureDate);

    LocalTime pastTime = currentTime.minusHours(5);
    System.out.println("Time 2hrs ago: "+pastTime);

    LocalDate givenDate= LocalDate.of(2024,3,9);
    DayOfWeek dayOfWeek= givenDate.getDayOfWeek();
    System.out.println("/n Days of week of 9th March,2025: "+ dayOfWeek);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
    String formattedDateTime = currentDateTime.format(formatter);
    System.out.println("Formatted Date & Time: "+ formattedDateTime);
    }
    
}
