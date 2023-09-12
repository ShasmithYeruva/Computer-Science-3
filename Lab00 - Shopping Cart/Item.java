
public class Item {
	private String name;
	private double price;
	private int bulkQty;
	private double bulkPrice;

	Item(String name, double price) {
		this(name, price, 0, 0);
	}

	public Item(String name, double price, int bulkQty, double bulkPrice) {
		if (price < 0 || bulkQty < 0 || bulkPrice < 0) {
			throw new IllegalArgumentException("error");
		}
		this.name = name;
		this.price = price;
		this.bulkQty = bulkQty;
		this.bulkPrice = bulkPrice;
	}

	public double priceFor(int quantity) {
		if (quantity >= bulkQty && bulkQty > 0) {
			return bulkPrice * quantity;
		} else if (quantity >= 0) {
			return price * quantity;
		} else {
			throw new IllegalArgumentException("error");
		}
	}

	@Override
	public boolean equals(Object obj) {
		Item other = (Item) obj;
		return name.equals(other.name);
	}

	public String toString() {
		String x = name + ", " + price;
		if (bulkQty > 0) {
			x += " bulk: " + bulkQty + ", $" + bulkPrice;
		}
		return x;
	}
}
