import java.util.Scanner;

public class NumberFactors {

	public static void main(String[] args) {
		Scanner Num = new Scanner(System.in);
		System.out.print("Enter a  Starting Number: ");
		int Number = Num.nextInt();
		
		
		System.out.print("Factors are: ");
        for(int i = 1; i <= Number; i++) {
            if (Number % i == 0) {
                System.out.print(i + " ");

	}

        }
	}
}
