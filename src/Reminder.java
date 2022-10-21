public class Reminder {

    public void Remind(){
            NodeVisitor visitor = new ReminderVisitor();
            visitor.visitProduct(new Product("New Product"));
            visitor.visitTrading(new Trading("Bid Date"));
    }

}
