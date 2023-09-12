import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<ItemOrder> list;

	public ShoppingCart() {
		list = new ArrayList<ItemOrder>();
	}

	public void add(ItemOrder newOrder) {
		list.remove(newOrder);
		list.add(newOrder);
	}

	public double getTotal() {
		double total = 0.0;
		for (int i = 0; i < list.size(); i++) {
			total += list.get(i).getPrice();
		}
		return total;
	}
}
