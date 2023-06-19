import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class RestaurantBill
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Lab 15.3: " +  formattedDateTime);
        System.out.println("Programmer: " + System.getProperty("user.name"));

        System.out.print("Enter your name: ");
        String user = scanner.nextLine();

        final double mealCharge, taxAmount, tipAmount, totalBill;

        System.out.print("Enter the Meal Charge: ");
        mealCharge = scanner.nextDouble();

        taxAmount = mealCharge * 0.0675;
        tipAmount = mealCharge * 0.20;
        totalBill = mealCharge + taxAmount + tipAmount;

        System.out.println(user + ", here is the receipt: ");
        System.out.printf("Meal Charge: $%.2f\n", mealCharge);
        System.out.printf("Tip:         $%.2f\n", tipAmount);
        System.out.printf("Tax:         $%.2f\n", taxAmount);
        System.out.printf("Total:       $%.2f\n", totalBill);
    }
}
