package TrainingData;

import java.util.Scanner;

public class Count
{
	public static void main(String args[])
	{
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a MinNumber: ");
    	int MinNumber = input.nextInt();
    	System.out.print("Enter a MaxNumber: ");
    	int MaxNumber = input.nextInt();
	
    	int count = 0;
	

    for(int i = MinNumber; i<=MaxNumber; i++)
    {
        String number = String.valueOf(i);
        while(number.contains("1"))
        {
            number= number.substring(number.indexOf("1")+1);
            count ++;
        }
    }
    System.out.println(count);
	}
}
