package assignment;

public class Student {
	public static String country = "India";
	private static String name = "Aishwarya";//i am trying to access it in S1 class in the same package and also in the accessmodifier package
	static String age = "23";//trying to access it in S1 class of same package and also in accessmodifier package in test4 class
	protected static String course = "java";//trying to access it in S1 class of same package and also in accessmodifier package in test4 class
		
		
	public static void main(String[] args) {
		System.out.println(Student.country);
		System.out.println(Student.name);
		System.out.println(Student.age);
		System.out.println(Student.course);
		

	}


	
}
