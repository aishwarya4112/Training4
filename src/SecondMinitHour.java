
public class SecondMinitHour {

	public static void main(String[] args) {
		int i = 86399;
		
		// h = (sec /3600);
		// m = (sec -(3600*h))/60;
		// s = (sec -(3600*h)-(m*60));
		
		System.out.println(86399/3600);
		
		System.out.println(86399%3600/60);
		System.out.println(86399%60);
	}

}
