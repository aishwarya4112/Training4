package abstrac;

	public class Abstract {

	public static void main(String[] args) {
		A2 a1 = new B2();
		a1.addition();
		a1.multiplication();
		
		
	}
}
	
	abstract class A2{
		public abstract void addition();
		public abstract void multiplication();
	}
	
	 class B2 extends A2{
		 public void addition() {
			 System.out.println(10 + 20);
		 }
		
		 public void multiplication() {
			 System.out.println(20 * 20);
		 }
		 
	 }