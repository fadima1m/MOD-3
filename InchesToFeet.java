import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InchesToFeet
{
    public static void main(String[] args)
    {
        //Creating the Object of DateTime and Program User.
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        //Printing the DateTime and Program User objects into strings.
        System.out.println("Lab 15.2: " +  formattedDateTime);
        System.out.println("Programmer: " + System.getProperty("user.name"));
        //Setting the constant of feet to 12.
        final int IN_TO_FEET = 12;
        //Equation for inches to feet.
        int inches = 86;

        int feet = inches / IN_TO_FEET;
        int remainIn = inches % IN_TO_FEET;

        System.out.println("86 inches is " + feet + " feet and " + remainIn + " inches");
    }
}
