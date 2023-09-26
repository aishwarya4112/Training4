package abstrac;

		abstract class M{
			public  static void openpage() {
				System.out.println("This is Static method of abstract class M");
			}
			
			public  static void selectOption() {
				System.out.println("This is also static method of class M");
			}
		}
		
		class N extends M{
			public static void openpage() {
				System.out.println("Testometer");
			}
			public static void selectOption() {
				System.out.println("Course");
			}
		}
public class StaticMethod {

	public static void main(String[] args) {
		M.openpage();
		M.selectOption();
	
	}

}
