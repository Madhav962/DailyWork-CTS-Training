import java.util.Scanner;

public class NumberAdditionRecursion {

	public static void main(String[] args) {
		
		Scanner Num = new Scanner(System.in);
		System.out.print("Enter a  Number: ");
		int Number = Num.nextInt();
		
		   int sum = Add(Number);
	        System.out.println("Sum = " + sum);
	    }

	    public static int Add(int num) {
	        if (num != 0)
	            return num + Add(num - 1);
	        else
	            return num;
	    }

	}


