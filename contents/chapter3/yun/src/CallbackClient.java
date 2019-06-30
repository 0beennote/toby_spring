public class Client {
	
	Sale sale = new Sale();
	
	Item item1 = new Item("노브랜드1", "1000");
	Item item2 = new Item("노브랜드2", "1000");
	Item item3 = new Item("노브랜드3", "1000");
	Item item4 = new Item("노브랜드4", "1000");
	Item item5 = new Item("노브랜드5", "1000");
	
	public void saleItems(Item item) {
		sale.add(item);
	}
	
	public void printReceipt() {
		//콜백 방식(템플릿으로 묶을 기능이 없어 콜백/템플릿은 아닌듯...ㅠㅜ)
		PrinterStrategy hd108ReceiptPrinter = new PrinterStrategy() {

			@Override
			public void printReceipt(ArrayList<Item> items) {
				Iterator<Item> itr = items.iterator();
				StringBuffer buf = new StringBuffer();
				while(itr.hasNext()) {
					Item item = itr.next();
					buf.append(item.getName());
					buf.append(item.getPrice());
				}
				System.out.println(buf.toString());
			}
			
		};
		
		hd108ReceiptPrinter.printReceipt(sale.get());
	}
}