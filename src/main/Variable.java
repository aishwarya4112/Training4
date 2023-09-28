package main;
	
	public class Variable {
		int j = 4;// instance variable
		
		static int k = 10;// static variable
		
	public static void main(String[] args) {
		int i = 411;//local variable
		
	
		Variable v = new Variable();
		System.out.println(Variable.k);
		
		System.out.println(v.j);
		
		System.out.println(i);
		
	}
	}

		
		