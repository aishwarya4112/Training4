package inheritance;

public class Overriding {

	public static void main(String[] args) {
		A a1 = new A();
		a1.test1marks();
		B b1 = new B();
		b1.test1marks();
		C c1 = new C();
		c1.test1marks();
	}

}

	class A{
		public void test1marks() {
			System.out.println("20");
		}
	}
	
	class B extends A{
		protected void test1marks() {
			System.out.println("40");
		}
	}
	
	class C extends B{
		private void test1marks() {
			System.out.println("60");
		}

		
	}