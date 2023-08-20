package method;

public class ParameterizedMethod {
	 	int sub(int a, int d) {
		 int i = a;
		 int j = d;
		 int res = i -j;
		 return res;
	}

	   static int add(int k, int l) {
		  int a = k;
		  int b = l;
		  int res = a + b;
		 return res;
			
	}
	  	
		public static void main(String[] args) {
				ParameterizedMethod d1 = new ParameterizedMethod();
				
				System.out.println(d1.sub(40, 15));
				System.out.println(ParameterizedMethod.add(40, 20));
			}
	
	}


