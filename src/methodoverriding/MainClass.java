package methodoverriding;
	public class MainClass{ 
			public static void main(String[] args){
				C c1 = new C(); 
				c1.test();
		} 
} 
	class A{
		void test(){
			System.out.println("Hello java");
		} 
} 
		class B extends A{
			protected void test(){ 
				System.out.println("This is protected method of B class ");
			} 
}
		class C extends B{

		 public void test(){
			 System.out.println("Hello");
		 } 
		 }

