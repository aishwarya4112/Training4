import java.util.Scanner;
public class PrimeNum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			System.out.println("Enter your number:");
			int num = in.nextInt();
	
		while (true) {
			int j = 0;
			boolean flag =false;
			for(int i = 2; i<= num /2; ++i) {
				
				if(num %i==0) {
					flag =true;
					break;
				}
				
			}
			if (!flag)
				
				System.out.println(num + "is prime number");
		else 
			System.out.println(num + "is not a prime number");
		
		}
	
	}}


	


