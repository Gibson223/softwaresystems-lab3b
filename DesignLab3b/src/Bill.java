package bill;

import bill.Printer;
public class Bill{
	public static interface Item{
		public double getAmount();
		public String toString();
	}
	private double total;
	public Printer printer;
	public Printer getPrinter() {
		return printer;
	}
	;
	public Bill(Printer printer) {
		this.printer = printer;
		}
	public void addItem(Bill.Item item) {
		total = total + item.getAmount() ;
	}
	public void close() {
		this.printer.printLine("This is the total bill....", total );
	}
	public double getSum() {
		return total;
	}
}