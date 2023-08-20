package method;

public class ParamMethod {
	int sub(int i1,int i2) {
		  int i3 = i1 - i2;
			return i3;
	}

	  public static int add(int a1,int a2) {
		  int a3 = a1 +a2;
			return a3;
			
	}
	  	
		public static void main(String[] args) {
				ParamMethod p1 = new ParamMethod();
				System.out.println(p1.sub(50,30));
				System.out.println(ParamMethod.add(40,80));
			}
	

	}


