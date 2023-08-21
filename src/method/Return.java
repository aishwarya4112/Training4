package method;

public class Return {
		public int add(int i , int j){
			int k = i+j;
			return k;  

		 }
		public static int add1(int a, int b) {
			int c = a + b;
			return c;
	}
	public static void main(String[] args) {
		
			Return a1 = new Return();
			System.out.println(a1.add(40, 80));
			System.out.println(Return.add1(50, 50));
	}

}
