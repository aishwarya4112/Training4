package Objects;

public class Laptopchatterbox {

	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.name = "HP";
		l1.model = "Pavilion";
		l1.price = 50000;
		
		Laptop l2 = new Laptop();
		l2.name = "Dell";
		l2.model = "Inspiron 16";
		l2.price = 77000;
		
		Laptop l3 = new Laptop();
		l3.name = "Apple";
		l3.model = "MacBook Air 15";
		l3.price = 145000;
		
		l1.practice("Java");
		l2.practice("paint");
		l3.practice("API");
		
	}

}
