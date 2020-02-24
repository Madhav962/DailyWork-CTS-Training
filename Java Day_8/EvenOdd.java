//	A Daphne Array is defined to be an array that contains alteast 1 odd no and begins and ends with the same no of Even numbers.
//So {4,8,6,3,2,9,8,11,8,13,12,12,6} is a Daphne array, because it begins with 3 even numbers and ends with 3 even numbers and it contains alteast 1 odd number.
//The array {2,4,6,8,6} is not a daphne array because it does not contain an odd number.
//The array {2,8,7,10,-4,6} is not a daphne array because it begins with 2 even numbers but ends with 3 even numbers.
//Write a Program that returns 1 if its array argument is a daphne array otherwise it returns 0.



package Day8;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String args[])
	{
		int count=0,count1=0,count3=0;
        Scanner s=new Scanner(System.in);

        System.out.println("enter number of elements");

        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements");

        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();

        }
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]%2==0)
        	{
        		count++;
        	}
        	else 
        		{
        		count3++;
        		break;
        		}
        	
		}
        for(int i=arr.length-1;i>=count;i--)
        {
        	if(arr[i]%2==0)
        	{
        		count1++;
        	}else break;
        }
       
        if(count==count1&&count3!=0&&count!=0)
        {
        	System.out.println("Yes this is a Daphe Array");
        }
        else
        {
        	System.out.println("No this is a Daphe Array");
        }
	}
}
