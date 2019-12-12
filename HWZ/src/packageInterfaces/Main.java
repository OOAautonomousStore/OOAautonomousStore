package packageInterfaces;

public class Main {

	public static void main(String[] args) {
		
		Car oPorsche = new Car(55, 12345, "large is good");
		Book oHarryPotter = new Book("Harry Potter", "Joanna K. Rowling", 20192811);

		oPorsche.Kaufen(true);
		oHarryPotter.Kaufen(false);
	}

}
