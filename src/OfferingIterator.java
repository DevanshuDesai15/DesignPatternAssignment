import java.util.Iterator;

public class OfferingIterator {

	@SuppressWarnings("rawtypes")
	private OfferingList offeringList;

	public boolean hasNext(Iterator iterator) {

		return iterator.hasNext();
	}

	public Offering Next(Iterator iterator) {
		if (this.hasNext(iterator)) {
			return (Offering) iterator.next();
		} else {
			return null;
		}
	}

	public void MoveToHead() {
		System.out.println("Head Moved ");
	}

	public void Remove(Iterator iterator) {
		if (this.hasNext(iterator)) {
			iterator.remove();
		}
	}

}
