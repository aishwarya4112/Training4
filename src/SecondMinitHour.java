import java.util.Scanner;
public class SecondMinitHour {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Second");
		int second = in.nextInt();
		
		
		int sec = second  % 60;
		int hour = second / 60;
		int min = hour % 60;
		hour = hour /60;
		System.out.println(hour + ":" + min + ":" +sec ); 
	}


	}
