import java.util.Scanner;
public class MaximumNum {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter 1st num");
		int i = scan.nextInt();
		
		System.out.println("Enter 2nd num");
		int j = scan.nextInt();
		
		System.out.println("Enter 3rd num");
		int k = scan.nextInt();
			
			 
			 	if(i > j && i >k) {
			 	System.out.println(i + "is maximum num");
			 }else {
				 if(j > k && j > i) {
				 System.out.println(j + "is maximum num");
			 }else {
				 if(k > i && k > j) {
				 System.out.println(k + "is maximum num");
					 }
				 }
			 }
	}}
			
			


