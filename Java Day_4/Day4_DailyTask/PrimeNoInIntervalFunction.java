package third;

import java.util.Scanner;

public class PrimeNoInIntervalFunction {

	public static void PrimeFunc(int x,int y)
	{
		while (x < y) {
			boolean flag = false;

			for (int i = 2; i <= x / 2; ++i) {
				if (x % i == 0) {
					flag = true;
					break;
				}
			}

			if (!flag)
				System.out.print(x + " ");

			++x;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no.");
		int a = sc.nextInt();
		System.out.println("Enter second no");
		int b = sc.nextInt();
        PrimeFunc(a,b);
	}
}
