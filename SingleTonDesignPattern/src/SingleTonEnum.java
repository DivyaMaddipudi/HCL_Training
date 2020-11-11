

//4
enum Singleton {
	
	INSTANCE; //1. does not support lazy loading
			  //2. if we wnt to convert it from single ton to multiton class
			  //    enum would not allow that
	//getInstance
	
}

public class SingleTonEnum {
	
	public static void main(String[] args) {
		
		Singleton singleton = Singleton.INSTANCE;
		System.out.println(singleton.hashCode());
		
		Singleton singleton1 = Singleton.INSTANCE;
		System.out.println(singleton1.hashCode());
		
		System.out.println(Singleton.INSTANCE);
	}


}
