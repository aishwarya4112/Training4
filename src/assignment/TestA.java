package assignment;

public class TestA {
		public void n1()  {
			System.out.println("TestA -> n1(Hello)");
		}
		
		private void n2() {// trying to access it in Test3 class of accessmodifier package
			System.out.println("TestA -> n2(Hello java)");
		}
		
		void n3() {// trying to access it in Test3 class of accessmodifier package
			System.out.println("TestA - > n3(this is java session)");
		}
		
		protected void n4() {// trying to access it in Test3 class of accessmodifier package
			System.out.println("TestA - > n4(Hello everyone)");
		}
		
		
			public static void main(String[] args) {
				TestA t = new TestA();
				t.n1();
				t.n2();
				t.n3();
				t.n4();
			}
}
