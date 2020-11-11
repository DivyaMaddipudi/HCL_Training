
class Initialization {
	
	private static Initialization instance; 
	private Initialization() {}
	
	//Double checked singleton
	public static Initialization getInstance() { //if we have huge amount of work to be done by getInstance() method
															  // it will decrease ur performance by factor of 100
		
		return instance;
	}
}

public class Implementations {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Initialization singleton = Initialization.getInstance();
				System.out.println(singleton.hashCode());
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Initialization singleton = Initialization.getInstance();
				System.out.println(singleton.hashCode());
				
			}
		});
		
		t1.start();
		t2.start();
	}

}
