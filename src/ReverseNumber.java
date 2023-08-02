
public class ReverseNumber {

	public static void main(String[] args) {
		int i = 346;
		//643
		
		int reverseNumber = 0;
		
		int remider = i % 10 ; 
		reverseNumber = (reverseNumber*10)+ 6;
		i = i /10; // i = 346
		
		i = i % 10; // 4
		reverseNumber = (reverseNumber*10)+ 4;
		 i = i / 10; // i = 643/10 = 64
		
		 i = i % 10; // 3
		reverseNumber = (reverseNumber*10)+ 3;
		i = i /10; // i = 64/10 = 6
		
		while(i != 0) {
			int reminder = i % 10; //5
			reverseNumber = (reverseNumber*10)+reminder;
			i = i /10; // i = 346
			
		}
		System.out.println(reverseNumber);
		
	}

}
