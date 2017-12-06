

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
public class Billtest {
	public class item implements bill.Bill.Item {
		public String getText() {
			return Text;
		}
		public void setText(String text) {
			Text = text;
		}
		public void setAmount(double amount) {
			Amount = amount;
		}
		private String Text;
		private double Amount;
		public item(String text, double amount) {
			Text = text;
			Amount = amount;
		}
		public double getAmount() {
			return Amount;
		}
		public String toString() {
			return this.Text + this.getAmount();
		}
	}
//	@Test
//	public void test() {
//		System.out.println("Not yet implemented");
//	}
	@Test
	public void testitem() {
		Printer a = new StringPrinter();
		Bill bill = new Bill(a);
		item item = new Billtest.item("fries", 2);
		assertEquals(bill.getSum(), 0,00 );
		bill.addItem(item);
		assertEquals(item.getAmount(), 2,0);
		assertEquals(item.getText(), "fries");
		assertEquals(bill.getSum(), 2,0);
		
	}
	@Test
	public void testSetGet() {
		Printer a = new StringPrinter();
		Bill bill = new Bill(a);
		item item = new Billtest.item("fries", 2);
		bill.addItem(item);
		assertEquals(bill.getPrinter(), a);
		assertEquals(bill.getPrinter().getClass() , StringPrinter.class);
		assertEquals(bill.getPrinter(), a);
	}
	@Test
	public void testPrinterAnd2Items() {
		Printer a = new StringPrinter();
		Bill bill = new Bill(a);
		item item = new Billtest.item("fries", 2);
		item item2 = new item("fish", 10);
		bill.addItem(item);
		bill.addItem(item2);
		
	}
		
	}
}
