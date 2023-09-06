package assignment;

public class H1 {
		public String name = "Viraj";
		private String age = "27";// trying to access it in visibility1 class of same class
		String country = "US";
		protected String course = "Automation";
		
	public static void main(String[] args) {
			H1 h = new H1();
			System.out.println(h.name);
			System.out.println(h.age);
			System.out.println(h.course);
			System.out.println(h.country);
			
	}

}
