public class Profits
{
    public static void main(String[] args)
    {
        final double RETAIL_PRICE = 125.00;
        double percent_profit;
        percent_profit = 40.00;
        double profit;
        profit = RETAIL_PRICE * (percent_profit / 100);
        double totalAmount = RETAIL_PRICE + profit;
        System.out.printf("The profit of the retail price of the computer is $%.2f which is a $%.2f profit.", RETAIL_PRICE, profit);
        System.out.printf("The total amount: $%.2f", totalAmount);


    }
}
