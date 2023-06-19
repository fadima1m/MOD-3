import java.util.Scanner;
import java.text.DecimalFormat;

public class TestScore
{
    public static void main(String[] args) // Declaring the Method Main
    {
        Scanner scanner = new Scanner(System.in);

        final double testScore1, testScore2, testScore3;

        System.out.print("Enter your name: ");
        String user = scanner.nextLine();

        System.out.print("Enter Test Score 1: ");
        testScore1 = scanner.nextInt();

        System.out.print("Enter Test Score 2: ");
        testScore2 = scanner.nextInt();

        System.out.print("Enter Test Score 3: ");
        testScore3 = scanner.nextInt();

        final double average;
        average = (testScore1 + testScore2 + testScore3) / 3;

        DecimalFormat format = new DecimalFormat("##.00");

        System.out.printf(user + ", This is the average of all Test Scores: " + format.format(average));

        scanner.close();

    }
}
