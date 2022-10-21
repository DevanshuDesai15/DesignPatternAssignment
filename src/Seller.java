import java.io.FileNotFoundException;

public class Seller extends Person {

	private Person person;

	Seller(String uname) throws FileNotFoundException {
		System.out.println("\nThe Factory Method is initiated here...\n");
		System.out.println("Now the instance for the Seller is been created...\n");
		userType = 1;
		username = uname;
		attachProduct();
	}

	public void showMenu() {

	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

}
