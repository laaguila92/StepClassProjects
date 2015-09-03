package Lab;
import java.util.Scanner;
import java.math.*;
public class ConvertingCentsToDollars {
	public static void main(String[] args) {
		int cents;
	    Scanner input = new Scanner(System.in);
		System.out.println("How many Cents you got?");//ask the user how many cents he/she has
		cents = input.nextInt();//user input of amount of cents
		int d = (cents)/100;//getting an integer for total amount of cents divided by 100. since this only gives us integers it should leave us with the dollar amount
		int c = (cents)%100;//since the last function only gives us he dollar amount but there are cents that remain we use this to give us the remaining cents
		BigDecimal dollar = new BigDecimal(cents).movePointLeft(2);//this takes the total amount of cents and moves the decimal point 2 places to the left to give us the amount of money in traditional $dollar.cent format
	
		System.out.println("That is "+ d + " dollars and " + c + " cents. Your total amount is : $"+dollar);//displays the amount of cents in dollars and cents separately and also in the traditional doolar.cent format
		
		
		


	}

}
