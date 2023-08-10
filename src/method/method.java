package method;

import training.Method;

public class method {

	public static void main(String[] args) {
			method M1 = new method() ;
			int retValue = M1.sub(20,30);
			int sqr = M1.square(retValue);
			System.out.println(sqr);
		
	}
		 int sub(int a1, int a2) {
				int a3 = a1 -a2;
				return a3;
			}
			
			 int square(int i) {
				int sq = i * i;
				return sq;
			}
	

		public int sumOfValuse(int number) {
			int sum = 0;
			while(number !=0) {
		sum = sum + number%10;
		number = number / 10;
	}
	return sum;
	
}	

}
