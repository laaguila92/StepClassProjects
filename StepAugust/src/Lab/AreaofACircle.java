package Lab;
import java.util.Scanner;
public class AreaofACircle {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Radius of the Circle: ");//asks the user for the radius of the circle
		double radius = sc.nextDouble();//use double so that user input accounts for decimals
		double area = Math.PI * (radius * radius);//Area is PI * Radius squared
		System.out.println("The area of the circle with the radius "+ radius + " is :" + area);//the area of the circle is displayed
		
	}

}
