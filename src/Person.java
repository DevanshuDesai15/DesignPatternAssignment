import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Person {

	 ClassProductList productList = new ClassProductList();
	private ProductMenu theProductMenu;

	public String username;
	public int userType;

	Facade facade = new Facade();
	public void attachProduct() throws FileNotFoundException {
		System.out.println("Now attaching Product to The specific Person - "+username);
		Scanner scan = new Scanner(new File("UserProduct.txt"));
		while(scan.hasNext()) {
			String line[] = scan.nextLine().split(":");
			if(username.equals(line[0])) {
				Product product = new Product(line[1]);
				productList.addProduct(product);
			}
		}
	}
	public void showMenu(int choice) throws FileNotFoundException {
		ProductMenu productMenu;
		if(choice == 0) {
			productMenu = new MeatProductMenu();
			if(userType == 1) {
				productMenu.buyerMenu();
			}
			else {
				productMenu.sellerMenu();
			}
		}
		else if(choice == 1) {
			productMenu = new ProduceProductMenu();
			if(userType == 1) {
				productMenu.buyerMenu();
			}
			else {
				productMenu.sellerMenu();
			}
		}
		else {
			facade.login();
		}
	}

	public void showAddButton() {
		facade.addTrading();
	}

	public void showViewButton() {

	}

	public void showRaidButton() {

	}

	public void showLabels() {

	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

}
