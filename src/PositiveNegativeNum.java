import java.util.Scanner;
public class PositiveNegativeNum {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter your Number:");
		int in = scan.nextInt();
		if(in>=0) {
		System.out.println("Number is positive");

	}else{
		System.out.println("Number is negative");
	}
	}
}
