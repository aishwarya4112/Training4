package accessModifier;

public class AccessModifier { // trying to access all these methods in AccessModifier2 class 
	public int publicAccess = 04;
	private int privateAccess = 11;
	protected int protectedAccess = 2;
	 int defaultAccess = 200;
	

	public void publicAccessMethod() {
		System.out.println("it is accessible in everywhere");
	}
	
	private void privateAccessMethod() {// it showing error not accessible in another class
		System.out.println("it is not accessible in different class");
	}
	
	protected void protectedAccessMethod() {
		System.out.println("it is accessible in different class");
	}
	
	void defaultAccessMethod() {
		System.out.println("it is accessible in anothe class");
	}
}