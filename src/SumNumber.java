import java.util.Scanner;

public class SumNumber {

	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your number");
			int number = scan.nextInt();

			int sum = 0;
			while(number != 0) {
				sum = sum + number%10;
				number =number / 10;
			}
			System.out.println("Sum is "+ sum);

		}
	
	}
	


	}


