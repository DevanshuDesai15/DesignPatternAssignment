import java.util.Scanner;

public class ProduceProductMenu implements ProductMenu {

	public ProduceProductMenu(){
		System.out.println("\nThe Factory Method is initiated here...\n");
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
		System.out.println("\nBelow is the Product Menu for Seller:-");
		System.out.println("\n1. Show Product\n2. Bid for product");
		System.out.println("\nEnter the choice");
		choice = sc.nextInt();
		implementOption(choice);

	}

	@Override
	public void sellerMenu() {
		System.out.println("\nBelow is the Product Menu for Buyer:-");
		System.out.println("\n4. Add Product\n5. Show Bids\n6. Decide Bids");
		System.out.println("\nEnter the choice");
		choice = sc.nextInt();
		implementOption(choice);

	}

	@Override
	public void implementOption(int choice) {
		System.out.println("\nThe Bridge Pattern is initiated here...");

		if(choice == 1) {
			System.out.println("\nShow Products");
		}
		else if(choice ==2)
			System.out.println("\nShow Bids");
		else if(choice == 3) {
			System.out.println("\nRemind");
			Remind();
		}
		else if(choice == 4) {
			System.out.println("\nAdd Products");
		}

		else if(choice == 5)
			System.out.println("\nShow Bids");
		else if(choice == 6)
			System.out.println("\nDecide Bids");
	}
	public void Remind() {
		Reminder reminder = new Reminder();
	}


}
