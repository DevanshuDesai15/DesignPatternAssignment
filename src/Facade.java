import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Facade {

	private int UserType;
	private Product theSelectedProduct;
	private int nProductCategory;
	private ClassProductList theProductList;
	private Person thePerson;

	Facade()
	{
		System.out.println("The Facade Design Pattern is initiated here...\n");
	}

	public boolean login() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int input = -1;
		String path = "";
		System.out.println("The Bridge Design Pattern is initiated here...\n");
		do {
			System.out.println("Press 1 for accessing BUYER and for accessing SELLER press 2:-");
			input = sc.nextInt();
		}while (input!=1&&input!=2);
		Login login = new Login();
		if(input == 1)
		{
			path = "BuyerInfo.txt";
		}
		else
		{
			path = "SellerInfo.txt";
		}
		do {
			String uName = login.input(path);
			if (uName!=null) {
				System.out.println("Login was a Success for "+ uName);
				if(input == 1)
				{
					thePerson = new Buyer(uName);
					thePerson.userType = 1;
				}
				else
				{
					thePerson = new Seller(uName);
					thePerson.userType = 2;

				}
				displayProducts(thePerson);

			} else {
				System.out.println("Wrong username or password...");
			}
		}while (true);

	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void creatUser(UserInfoItem userinfoitem) {

	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public Product SelectProduct() {
		return null;
	}

	public void ProductOperation() {

	}



	public void displayProducts(Person thePerson) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nThe Iterator Design Pattern is initiated here....");
		ProductIterator productIterator = new ProductIterator(thePerson);
		int i = 0;
		while(productIterator.hasNext()) {
			System.out.println(i++ + " : "+productIterator.Next());
		}
		System.out.println("Enter Product to select for trading?");
		int choice = scan.nextInt();
		System.out.println("Here now "+productIterator.get(choice)+" is selected...");
		choice = 0;
		while(choice != 2) {
			System.out.println("Select an option - \n0 : Meat based product menu\n1 : Produced based product menu\n2 : Or you can logout...");
			choice = scan.nextInt();
			this.thePerson.showMenu(choice);
		}
	}

}
