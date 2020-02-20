import java.util.Scanner;

public class FactorialByRecursion {

	public static void main(String[] args) {
		
		Scanner Num = new Scanner(System.in);
		System.out.print("Enter a  Number: ");
		int Number = Num.nextInt();
		
		long f = Factorial(Number);
        System.out.println("Factorial is : " + f);
    }
    public static long Factorial(int num)
    {
        if (num >= 1)
            return num * Factorial(num - 1);
        else
            return 1;
    }

}


