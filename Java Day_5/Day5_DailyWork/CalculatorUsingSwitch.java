package package5;

import java.util.Scanner;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter fist number: ");
		double first = ip.nextDouble();
		System.out.print("Enter second number: ");
		double second = ip.nextDouble();

		System.out.print("Enter an operator (+, -, *, /): ");
		char operator = ip.next().charAt(0);

		double result;

		switch (operator) {
		case '+':
			result = first + second;
			break;

		case '-':
			result = first - second;
			break;

		case '*':
			result = first * second;
			break;

		case '/':
			result = first / second;
			break;
		default:
			System.out.printf("Choose Correct Option");
			return;
		}

		System.out.println(result);
	}

}
