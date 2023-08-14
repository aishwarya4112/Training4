import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter a Number: ");
		 double num = input.nextDouble();
		double number ;
		double squareNum ;
		double cubeNum ;
		double forthNum ;
	
			squareNum = num * num;
			cubeNum = squareNum * num;
			forthNum = cubeNum *num;
			
		
		System.out.println(squareNum);
		System.out.println(cubeNum);
		System.out.println(forthNum);
		
	}

	}
