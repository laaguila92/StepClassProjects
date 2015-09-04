package Lab;
import java.util.Scanner;
import java.math.*;

public class OrderChecker {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		int bolts;//init bolts variable
		int nuts;//init nuts variable
		int washers;// init washers variable
		System.out.println("Enter number of Bolts :");//ask the user the number of bolts
		bolts = input.nextInt();//user input bolts
		System.out.println("Enter number of nuts:");//ask the user number of nuts
		nuts = input.nextInt();//user input nuts
		System.out.println("Enter number of washers");//ask user number of washers
		washers = input.nextInt();//user inputs washers
		
		
			
		if (washers < (bolts *2) && (nuts< bolts))
			System.out.println("Check the order: Too few nuts and too few washers");//prints this message if there are too few washers and nuts
		
		else if (washers < (bolts * 2)){
			System.out.println("Check the order : Too few washers.");}//prints this if there are too few washers
		
		
		else if (nuts < bolts){
			System.out.println("Check the order: Too few nuts.");}//prints this if there are too few nuts
		
		else
			System.out.println("Check the order : Order is good.");//if the order is good, the program prints this message
				
		
		
		
		
		int total_cost = ((bolts * 5) + (nuts * 3) + (washers * 1));//formula for the cost of washers, nuts, and bolts in cents
		
		BigDecimal dollar = new BigDecimal(total_cost).movePointLeft(2);//converts the cents to the traditional dollar.cent format
		
		System.out.println("Your total cost is : " + total_cost + " cents. Or if you prefer : $" + dollar);// prints out the total cost of washers in total cents and then in the traditional dollar.cent format
		
		
		
		
		
		

	}

}
