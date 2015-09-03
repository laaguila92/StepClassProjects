package Homework;

public class ValueofaQuadratic {

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
 
         /*int a = 3;
         *int b = -8;
         *int c = 4;*/
         
        
        //using various values for x
        
        /*int x = 5;
        *System.out.println("3x2 - 8x + 4 When value of x is 5 : " + (a * (x * x) + (b * x) + c) );*/
        //At x=5 the value is 39
        
        /*double x = 10.5;
        *System.out.println("3x2 - 8x + 4 When value of x is 10.5 : " + (a * (x * x) + (b * x) + c) );*/
        //At x=10.5 the value is 250.75
        
        /*int x = 498000000;
        *System.out.println("3x2 - 8x + 4 When value of x is 498000000 : " + (a * (x * x) + (b * x) + c) );*/
        //At x=498000000 the value is -349586428
        
        /*int x = -4;
        *System.out.println("3x2 - 8x + 4 When value of x is -4 : " + (a * (x * x) + (b * x) + c) );*/
        //At x=-4 the value is 84
        
        /*int x = 0;
        *System.out.println("3x2 - 8x + 4 When value of x is 0 : " + (a * (x * x) + (b * x) + c) );*/
        //At x=0 the value is 4
        
         
      
        
        
        
        
     
        
		
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
 
 
        //Finding out the roots
        double temp1 = Math.sqrt(b * b - 4 * a * c);
 
        double root1 = (-b +  temp1) / (2*a) ;
        double root2 = (-b -  temp1) / (2*a) ;
 
        System.out.println("The roots of the Quadratic Equation \"3x2 - 8x + 4 = 0\" are "+root1+" and "+root2);
        //I know this was not asked of us, but this is the formula for quadratic equation. The program compiled and ran and solved for the value of x being 2.0 and 0.666666 which is also 2/3. By changing the declarations of what each int value is, you cna use this to solve for any quadratic equation.
        
        
	}

}
 