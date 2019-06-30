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
		//프린터 주입
		PrinterStrategy printerStrategy = new HD108ReceiptPrinter();
		printerStrategy.printReceipt(sale.get());
	}
}