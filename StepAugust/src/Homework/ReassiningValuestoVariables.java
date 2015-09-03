package Firstjavaprojects;

public class ReassiningValuestoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Suppose our Quadratic Equation to be solved
         * is 3x2 - 8x + 4 = 0 .
         * (Assuming that both roots are real valued)
         *
         * General form of a Quadratic Equation is
         * ax2 + bx + c = 0 where 'a' is not equal to 0
         *
         * Hence a = 3, b = -8 and c = 4.
         */
 
        int a = 3;
        int b = -8;
        int c = 4;
        
        
        //Reassigning values to variables
        
        int x = 5;
        int value = 7;
        int value2 = 10;
        System.out.println("3x2 - 8x + 4 When value of x is 5 : " + (a * (x * x) - b * x + c) );
        System.out.println("3x2 - 8x + 4 When value of x is 7 : " + (a * (value * value) - b * value +c) );
        System.out.println("3x2 - 8x + 4 When value of x is 7 : " + (a * (value2 * value2) - b * value2 +c) );
        //program compiles and runs and lists separate values for declarations of respective variables. x is 119, value is 207, and value 2 is 384
	}

}
