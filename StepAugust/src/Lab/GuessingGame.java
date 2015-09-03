package Lab;

import java.util.Scanner;
import java.util.Random;
public class GuessingGame {

	public static void main(String[] args) 
	{
		double guess;
		Scanner input = new Scanner (System.in); //create scanner
		Random answer = new Random ();
		int n=answer.nextInt(10);
		
		for(int i=0; i<3; i++)
	
		{
			System.out.println("I'm Thinking of a number between 1 and 10. Guess if you dare.");
		    guess= input.nextDouble();
		    {if ((i==3))
		    break;
		    
		    if ((n==guess)){
			System.out.println("......Correct. You have bested me. However I do not take losses lightly. I shall prepare the next gauntlet");
			i=3;}
		
		    else if ((n==guess -2) || (n==guess +2))
			System.out.println("Less wrong but still wrong. I suppose you are getting a bit warmer but that just makes you a little less stupid");
	    	
	    	else if ((n==guess -1) || (n==guess +1))
	    	System.out.println("You're getting closer. I concede the  fact that you are not a complete moron.");
	    	
	    	else 
	    	System.out.println("WRONG!!!!Holy Crap I didn't think it was possible for anyone to be this cold. You must be a special type of stupid.");
    
		   
		    }		   
		    }
		
		System.out.println("You are by far the stupidest human i have ever come across. The correct answer is : " + n);
	    }
	
}
		


	
		
		
			
		

