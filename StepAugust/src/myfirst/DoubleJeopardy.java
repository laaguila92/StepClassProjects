package myfirst;

public class DoubleJeopardy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*double value = 32;
		System.out.println("A double: " + value);*/
		//runs fine outputs 32.0
		
		/*double value = 32.0;
		System.out.println("A double: " + value);*/
		//creates the same output as when the value was 32
		
		/*double value = 326666666666;
		System.out.println("A double: " + value);*/
		//inputing 12 or more digits without .0 at the end results in the program breaking
		
		double value = 326666666666.0;
		System.out.println("A double: " + value);
		//inputing  .0 after the series of numbers fixes the program
	}
}
