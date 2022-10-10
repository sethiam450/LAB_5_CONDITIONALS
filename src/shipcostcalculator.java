import java.util.Scanner;
public class shipcostcalculator {
    public static void main(String[] args) {

        double totalCost;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your item price " );
        int itemPrice = in.nextInt();
        if(itemPrice >= 100) {

        totalCost = itemPrice;
        System.out.println("There is no shipping cost, your total cost is " + itemPrice );

        }
        else
        {
            totalCost = (itemPrice * 1.02);
            double shippingCost = itemPrice * .02;
            System.out.print("Your total cost is $" +totalCost +" and your shipping cost is $" +shippingCost);

        }



    }


}