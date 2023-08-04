package Objects;

public class Sportmanchatterbox {

	public static void main(String[] args) {
		SportMan s1 = new SportMan();
		s1.name = "MS Dhoni";
		s1.age = 47;
		s1.game = "Cricket";
		
		SportMan s2 = new SportMan();
		s2.name = "Sania Mirza";
		s2.age = 36;
		s2.game  = "Tennis";
		
		SportMan s3 = new SportMan();
		s3.name = "Kim Yeon-Koung";
		s3.age = 35;
		s3.game = "Vollyball";
		
		s1.playing("Cricket");
		s2.playing("Tinnes");
		
}
}
