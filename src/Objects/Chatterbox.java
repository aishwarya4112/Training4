package Objects;

public class Chatterbox {

	public static void main(String[] args) {
		Human h1 = new Human();
		h1.Name="Viraj";
		h1.age = 27;
		h1.Country ="India";
		
		Human h2 = new Human();
		h2.Name = "Shweta";
		h2.age = 24;
		h2.Country = "USA";
		
		Human h3= new Human();
		h3.Name ="Aishwarya";
		h3.age =23;
		
		h1.speak("Hello Goodmorning!");
		h2.speak("Hello Java class");
		h3.speak("welldone");
		

	}

}
