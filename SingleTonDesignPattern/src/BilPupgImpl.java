

class BillPugh {
	
	private BillPugh() {
		
	}
	private static class BillPugHelper {
		private static final BillPugh instance = new BillPugh();
	}
	
	public static BillPugh getInstance() {
		return BillPugHelper.instance;
	}
	
}

public class BilPupgImpl {
	
	public static void main(String[] args) {
		
		BillPugh bill = BillPugh.getInstance();
		System.out.println(bill.hashCode());
		

		BillPugh bill1 = BillPugh.getInstance();
		System.out.println(bill1.hashCode());
		
	}

}
