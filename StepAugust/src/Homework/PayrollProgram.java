package Firstjavaprojects;

public class PayrollProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*long  hoursWorked = 40;
		double payRate    = 10.0, taxRate = 0.10;
		System.out.println("pay Amount  : " + (hoursWorked * payRate) );
		System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );*/
		//pay amount and tax amount for the hours worked are printed on two separate lines
		
		/*long  hoursWorked = 40;
		double payRate    = 10.0, taxRate = 0.10;
		System.out.println("Hours Worked  : " + (hoursWorked) );
		System.out.println("Pay Rate  : " + (payRate) );
		System.out.println("Tax Rate  : " + (taxRate) );*/
		//changed the code so that the variables were listed separately as opposed to initialized to calculate the total pay and the amount of taxes paid
		
		/*double payRate    = 10.0, taxRate = 0.10;
		System.out.println("Hours Worked  : " + (hoursWorked) );
		System.out.println("Pay Rate  : " + (payRate) );
		System.out.println("Tax Rate  : " + (taxRate) );*/
		//After removing the declaration long hoursWorked = 40 the program would not compile because the variable hours worked had no declaration to define it
		
		/*long  hoursWorked;
		double payRate    = 10.0, taxRate = 0.10;
		System.out.println("Hours Worked  : " + (hoursWorked) );
		System.out.println("Pay Rate  : " + (payRate) );
		System.out.println("Tax Rate  : " + (taxRate) );*/
		//after removing the character = 40 from the first declaration the program would not compile  because the local variable hours worked could not be initialized. Therefore, the other variables could not be declared because they were based in the first declaration.
		
		long  hoursWorked = 40;
		double payRate    = 10.0, taxRate = 0.10;
		System.out.println("Hours Worked  : " + (hoursWorked) );
		System.out.println("Pay Rate  : " + (payRate) );
		System.out.println("Tax Rate  : " + (taxRate) );
		//this is the correct code which does not initialize the variables but just declares them
	}

}
