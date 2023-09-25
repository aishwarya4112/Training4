package method;
	class StaticMethod{
		static void addmethod() {
			System.out.println("addmethod in StaticMethod class");
		}
	}
	
	class StaticMethodSubclass extends StaticMethod {
		static void addmethod() {
			System.out.println("addmethod in StaticMethodSubclass");
		}
	}
	public class Main1 {
		public static void main(String[] args) {
			 StaticMethod s1 = new  StaticMethod();
			 StaticMethod s2 = new StaticMethodSubclass();
			 s1.addmethod();
			 s2.addmethod();
			 StaticMethodSubclass.addmethod();
		}
}
