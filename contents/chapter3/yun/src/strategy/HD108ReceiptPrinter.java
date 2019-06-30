public class HD108ReceiptPrinter implements PrinterStrategy {
	
	@Override
	public void printReceipt(ArrayList<Item> items) {
		Iterator<Item> itr = items.iterator();
		StringBuffer buf = new StringBuffer();
		while(itr.hasNext()) {
			Item item = itr.next();
			buf.append(item.getName());
			buf.append(item.getPrice());
		}
		print(buf.toString());
	}
	
	private void print(String param) {
		System.out.println(param);
	}
}