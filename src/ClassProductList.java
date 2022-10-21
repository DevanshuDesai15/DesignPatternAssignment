import java.util.ArrayList;
import java.util.List;

public class ClassProductList {
//	public void accept(NodeVisitor visitor) {
//
//	}
List<Product> productList;
	int count;
	ClassProductList(){
		productList = new ArrayList<>();
		count = 0;
	}

	public void addProduct(Product obj) {
		productList.add(obj);
		count++;
	}
}
