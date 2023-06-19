// This program calculates the price of an
// item that is regularly priced at %59, with
// a 20 percent discount subtracted.
public class Discount
{
    public static void main(String[] args)
    {
        double regularPrice, discount, salePrice;

        regularPrice = 59;
        discount = regularPrice * 0.20;
        salePrice = regularPrice - discount;

        System.out.println("The discounted sale price for this item, regularly priced at $59 is now $" + salePrice + " for today.");
    }
}
// This is the class I wrote without looking at the example to find out the solution for myself. ',:D