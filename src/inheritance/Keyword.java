package inheritance;

public class Keyword {

	public static void main(String[] args) {
		
		N n1 = new N();
		n1.test1();
		M m1 = new M();
		m1.test1();
	}

}

	class M{
		public void test1() {
			System.out.println("Hello");
		}
	}
	
	class N extends M{
		public void test2() {
			test1();
		}
	}