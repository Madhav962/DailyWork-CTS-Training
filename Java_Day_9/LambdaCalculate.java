package Day9;

public class LambdaCalculate {

	public static void main(String[] args) {
		
		Hello1 add=(a,b)->a+b;
		System.out.println(add.calculate(4.2, 3.5));
		Hello1 subtract=(a,b) -> a-b;
		System.out.println(subtract.calculate(4.2, 3.5));
		Hello1 multiply=(a,b)-> a*b;
		System.out.println(multiply.calculate(4.2, 3.5));
		Hello1 divide=(a,b)-> a/b;
		System.out.println(divide.calculate(4.2, 3.5));

	}

}
interface Hello1
{
	double calculate(double a,double b);
}