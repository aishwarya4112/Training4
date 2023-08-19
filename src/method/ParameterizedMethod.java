package method;

public class ParameterizedMethod {
	 int sub() {
		 int i = 40;
		 int j = 15;
		 int res = i -j;
		 return res;
	}

	   static void add() {
		  int a = 20;
		  int b = 40;
		  int res = a + b;
		 System.out.println("add =" + res);
			
	}
	  	
		public static void main(String[] args) {
				ParameterizedMethod d1 = new ParameterizedMethod();
				int value = d1.sub();
				System.out.println("Sub =" + value);
				ParameterizedMethod.add();
			}
	
	}


