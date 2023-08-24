package method;

public class NonParameterizedMethod {

	
		int mul() {
			 int i = 20;
			 int j = 5;
			 int res = i *j;
			 return res;
		}

		   static int sub() {
			  int a = 45;
			  int b = 20;
			  int res = a - b;
			 return res;
	}
		   public static void main(String[] args) {
		   	NonParameterizedMethod n1 = new NonParameterizedMethod();
		   	
		   	System.out.println(n1.mul());
		   	System.out.println(NonParameterizedMethod.sub());

}}
