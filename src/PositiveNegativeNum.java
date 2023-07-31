import java.util.Scanner;
public class PositiveNegativeNum {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter your number");
		int i = scan.nextInt();
		if(i>0)
		{
			System.out.println("Number is +");
		} 
		
		else{
			
			System.out.println("Number is -");
		}
		
		

	}

}
