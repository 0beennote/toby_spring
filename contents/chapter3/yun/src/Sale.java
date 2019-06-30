public class Sale {
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public void add(Item item) {
		items.add(item);
	}
	
	public ArrayList<Item> get() {
		return items;
	}
}
