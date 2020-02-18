package TrainingData;
import java.util.Scanner;

public class sum {
	
	 static int getSum(int number) 
	    {     
	        int sum = 0; 
	          
	        while (number != 0) 
	        { 
	            sum = sum + number % 10; 
	            number = number/10; 
	        } 
	      
	    return sum; 
	    } 
	 
	public static void main(String args[])
	{

Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter a Number: ");
    	int number = input.nextInt();
    	
    	System.out.println(getSum(number));
    	
    	{
    		
    	}
	}

}
