package abstrac;

	abstract class L{
		public abstract void Selectoption();// it is abstract method
	
		public void Clickonbutton() {// it is non abstract method
			System.out.println("Click on submit button");
			
		}}
	
	class K extends L{
		public void Selectoption() {
			System.out.println("Select Salary option");
		}
		public void Clickonbutton() {
			System.out.println("Click on submit button");
			
		}
	}
	
	public class AbstractMethod {

		public static void main(String[] args) {
			L l1 = new K();
			l1.Selectoption();
			l1.Clickonbutton();
		}

	}
