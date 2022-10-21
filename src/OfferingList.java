import java.util.ArrayList;
import java.util.Iterator;

public class OfferingList {

    ArrayList<String> offering = new ArrayList<>();

    OfferingList() {
        offering.add("Biding for Onions");
        offering.add("Biding for tomatoes");
        offering.add("Biding for Meat");
    }

    @SuppressWarnings("rawtypes")
    public Iterator createIterator() {
        return this.offering.iterator();
    }

}
