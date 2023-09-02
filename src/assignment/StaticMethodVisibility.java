package assignment;

public class StaticMethodVisibility {
			public static int add() {
				int i = 10;
				int j = 20;
				int res = i+j;
				return res;
			}
			
			private static int sub() {
				int a = 30;
				int b = 25;
				int res = a - b;
				return res;
			}
				
			static int mul() {
				int k = 20;
				int l = 20;
				int res = k *l;
				return res;
			}
			
			protected static int division() {
				int c = 25;
				int d = 5;
				int res = c / d;
				return res;
				  
			}
				
			
			public static void main(String[] args) {
				System.out.println(StaticMethodVisibility.add());
				System.out.println(StaticMethodVisibility.sub());
				System.out.println(StaticMethodVisibility.mul());
				System.out.println(StaticMethodVisibility.division());
	}

}
