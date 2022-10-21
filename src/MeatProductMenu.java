import java.util.Scanner;

public class MeatProductMenu implements ProductMenu {

	public MeatProductMenu(){
		System.out.println("The Factory Method is initiated here...");
	}

	Scanner sc = new Scanner(System.in);
	int choice;

	public void showMenu() {

	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRaidButton() {

	}

	public void showLabels() {

	}

	public void showComboxes() {

	}

	@Override
	public void buyerMenu() {
		System.out.println("Below is the Product Menu for Seller:-");
		System.out.println("1. Show Product\n2. Bid for product");
		System.out.println("Enter the choice");
		choice = sc.nextInt();
		implementOption(choice);

	}

	@Override
	public void sellerMenu() {
		System.out.println("Below is the Product Menu for Buyer:-");
		System.out.println("4. Add Product\n5. Show Bids\n6. Decide Bids");
		System.out.println("Enter the choice");
		choice = sc.nextInt();
		implementOption(choice);

	}

	@Override
	public void implementOption(int choice) {
		System.out.println("The Bridge Pattern is initiated here...");

		if(choice == 1) {
			System.out.println("Show Products");
		}
		else if(choice ==2)
			System.out.println("Show Bids");
		else if(choice == 3) {
			System.out.println("Remind");
			Remind();
		}
		else if(choice == 4) {
			System.out.println("Add Products");
		}

		else if(choice == 5)
			System.out.println("Show Bids");
		else if(choice == 6)
			System.out.println("Decide Bids");
	}
	public void Remind() {
		Reminder reminder = new Reminder();
	}


}
