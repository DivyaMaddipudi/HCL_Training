package ntu_oops.classes5;

public class Tester5 {
	public static void main(String[] args) {
		InvoiceItem invoice = new InvoiceItem("123", "Bag", 2, 500.0);
		System.out.println("Total amount:" +invoice.getTotal());
		System.out.println(invoice.toString());
	}

}
