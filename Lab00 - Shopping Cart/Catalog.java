import java.util.ArrayList;

public class Catalog {
	private String name;
	private ArrayList<Item> list = new ArrayList<Item>();

	public Catalog(String name) {
		this.name = name;
	}

	public void add(Item item) {
		list.add(item);
	}

	public int size() {
		return list.size();
	}

	public Item get(int Index) {
		return list.get(Index);
	}

	public String getName() {
		return name;
	}
}
