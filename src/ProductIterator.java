public class ProductIterator {

	ClassProductList list;
	int iter = 0;
	ProductIterator(Person obj){
		list = obj.productList;
	}

	public boolean hasNext() {
		if(iter < list.count)
			return true;
		return false;
	}

	public Product Next() {
		return list.productList.get(iter++);
	}

	public void MoveToHead() {

	}
	public Product get(int i) {
		return list.productList.get(i);
	}

	public void Remove() {

	}

}
