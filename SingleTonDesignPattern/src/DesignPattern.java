import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

class SingletonPattern {
	
	private static final SingletonPattern instance = new SingletonPattern(); // eager initialization
	
	private SingletonPattern() {
		//2
		if(instance != null) {
			throw new IllegalStateException("instance is already created"); //this will give us run time exception 
																			//and prevents from creating another instance
		}
		System.out.println("instance is being created");
	}
	
	public static SingletonPattern getInstance() { //global access point
		return instance;
	}
}

public class DesignPattern {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException, SecurityException {
		
		SingletonPattern singletonPattern = SingletonPattern.getInstance();
		System.out.println(singletonPattern.hashCode());
		
		//3 change access level of private field and make it to null
		Field instance = SingletonPattern.class.getDeclaredField("instance");
		instance.setAccessible(true); // hey java i want get all the fields
		instance.set(instance, null);
		
		//1
		Constructor[] constructors = singletonPattern.getClass().getDeclaredConstructors();
		constructors[0].setAccessible(true); //hey java i want to call all the private methods/constructors
		
		SingletonPattern singleton2 = (SingletonPattern) constructors[0].newInstance();	
		
		System.out.println(singleton2.hashCode()); 
		
	}
}
