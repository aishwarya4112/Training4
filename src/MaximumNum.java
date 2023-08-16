import java.util.Scanner;
import java.util.Scanner;
public class MaximumNum {

	public static void main(String[] args) {
	
			  Scanner in = new Scanner(System.in);
			   
			  System.out.print("Enter 1st number:");
			  int A = in.nextInt();
			   
			  System.out.print("Enter 2nd number:");
			  int B = in.nextInt();
			   
			  System.out.print("Enter 3rd number:");
			  int C = in.nextInt();
			   
			   
			  if (A > B)
			   if (A >C)
			    System.out.println("Maximum num is"+A);
			   
			  if (B > A)
			   if (B >C)
			    System.out.println("Maximum num is"+B);
			   
			  if (C >A)
			   if (C > B)
			    System.out.println("Maximum num is"+C);
			 }
			}
			


