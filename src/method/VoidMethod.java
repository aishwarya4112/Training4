package method;

public class VoidMethod {
	
			

			void add () {
			int a = 25;
			int b = 5;
			int res = a+ b;
			System.out.println("addition = " + res);
		}
		
		static void mul() {
			int i = 22;
			int j = 4;
			int res = i * j;
			System.out.print("Multiplication =" + res);
			
		}

		public static void main(String[] args) {
				VoidMethod v1 = new VoidMethod();
				v1.add();
				VoidMethod.mul();
				

	}

}
