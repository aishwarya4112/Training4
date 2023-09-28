package abstrac;
	abstract class Manual{
		public abstract void course();
		public void java() {
			System.out.println("This is selenium course");
		}
	}
	
	class Automation extends Manual{
		public void course() {
			System.out.println("This is Manual course");
		}
		public void java() {
			System.out.println("Hello java");
		}
	}
	
	interface Manual1{
		public void Api();
		public void Sql();
	}
	
	interface ManualAndAutomation{
		public void FullStake();
	}
	
	class Automation1 implements Manual1, ManualAndAutomation{
		public void Api() {
			System.out.println("This is Api manual");
		}
		public void Sql() {
			System.out.println("This Sql and database");
		}
		
		public void FullStake() {
			System.out.println("This is FullStake course");
			
			
		}
	}
	
	public class Difference {

	public static void main(String[] args) {
		Manual m = new Automation();
		m.course();
		m.java();
		
		Manual1 m1 = new Automation1();
		m1.Api();
		m1.Sql();
		
		ManualAndAutomation a1 = new Automation1();
		a1.FullStake();
		
		
	}

}
