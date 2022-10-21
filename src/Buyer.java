import java.io.FileNotFoundException;

public class Buyer extends Person {

	private Person person;

	Buyer(String uname) throws FileNotFoundException {
		System.out.println("\nThe factory method is initiated here....");
		System.out.println("Now the instance for the Buyer is been created...\n");
		userType = 0;
		username = uname;
		attachProduct();
	}

	public void showMenu() {

	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

}
