package Lab;
import java.util.Scanner;
import java.math.*;

public class DiscountPrices {
	public static void main(String[] args) {
		int original_price; //original price
		 Scanner input =  new Scanner(System.in);
	System.out.println("Enter total Price of Purchases :");//asks the user for the amount of the purchase
	original_price = input.nextInt();//user inputs the amount of the purchase
	int discount = (original_price/10);//the actual discounted amount
	int discount_price = (original_price - discount);//price after the discount is applied
	BigDecimal original_dollar = new BigDecimal(original_price).movePointLeft(2);//just to make the amount at the end also display in the traditional dollar.cent format
	BigDecimal discount_dollar = new BigDecimal(discount_price).movePointLeft(2);//just to make the discounted amount at the end also display in the traditional dollar.cent format
	
	if (original_price <= 1000);
	{
		System.out.println("Your final total is : " + original_price+" or if you prefer : $" + original_dollar);//displays the original price since the discount was not applicable
	}
	
	if (original_price > 1000);
	{
		System.out.println("Your original total was "+ original_price+ ". After your discount, your new total is: " + discount_price+" or if you prefer : $" + discount_dollar);//displays the total amount to the user after the discount was applied
	}
	
	
	
	
	}
	

}
