public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	ReminderVisitor(){
		System.out.println("\nThe visitor Pattern is initiated here...");
	}

	public void visitProduct(Product product) {
		System.out.println("\nVisit product object to retrieve the trading");
	}

	public void visitTrading(Trading trading) {
		System.out.println("\nHere is the trading reminder.");
	}

	public void visitFacade(Facade facade) {

	}

}
