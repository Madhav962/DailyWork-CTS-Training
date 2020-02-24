//Given a number we need to find the number of times its digits need
// to be added so it becomes a single digit number .
//    Example 91=9+1=10
//    10=1+0=1
//    So two times.
//    Sample Input
//    91
//    output
//    2


package Day8;

import java.util.*;
public class SumDigitCount {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter The Number:");
		  int  num = sc.nextInt();
		  int sum=0,count =1;
		  while(num > 0 || sum > 9)
		    {
		        if(num == 0)
		        {   count++;
		            num = sum;
		            sum = 0;
		        }
		        sum  =sum + num % 10;
		        num = num  / 10;
		    }
		    System.out.println(count);
	}
}