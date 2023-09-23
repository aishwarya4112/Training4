package constructor;

	class B {// It is constructor which is called by creating object 
	 B(){
		 System.out.println("B class constructor");

	 }

	void B(){ //It is method which is called by using object variable
		System.out.println("B is void method");
 }

	
	
	public static void main(String[] args) {
		B b1 = new B();
		b1.B();
	}
}