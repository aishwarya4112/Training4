package main;

	class Test1 {
		static int x = 0;
			public static void main(String args[]) {
				//System.out.println(Test1.x);
			System.out.println(Test1.fun());
			
			}
			static int fun() {
			return ++x;
			}
			
			Test1 t1 = new Test1();
			
			}

