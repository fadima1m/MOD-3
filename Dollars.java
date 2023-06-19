import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Dollars
{
    public static void main(String[] args)
    {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Lab 15.4: " +  formattedDateTime);
        System.out.println("Programmer: " + System.getProperty("user.name"));

        String user;

        final int twenties, tens, fives, ones;

        int numberOfDollars;

        user = JOptionPane.showInputDialog("Enter " + "your name:");

        numberOfDollars = Integer.parseInt(JOptionPane.showInputDialog("Enter the number " + "of dollars:"));

        twenties = numberOfDollars / 20;
        tens = (numberOfDollars % 20) / 10;
        fives = (numberOfDollars % 10) / 5;
        ones = numberOfDollars % 5;

        String message = "Hello " + user + " $" + numberOfDollars +
                " converted is: " + twenties + " $20s, " + tens + " $10s," + fives +
                " $5s and " + ones + " $1s";
        JOptionPane.showMessageDialog(null, message);

    }
}
