package method;

public class ParameterizedMethod {
	 	int sub(int a, int d) {
		 int i = a;
		 int j = d;
		 int res = i -j;
		 return res;
	}

	   static void add(int k, int l) {
		  int a = k;
		  int b = l;
		  int res = a + b;
		 System.out.println("add =" + res);
			
	}
	  	
		public static void main(String[] args) {
				ParameterizedMethod d1 = new ParameterizedMethod();
				int value = d1.sub(40, 15);
				System.out.println("Sub =" + value);
				ParameterizedMethod.add(20, 40);
			}
	
	}


