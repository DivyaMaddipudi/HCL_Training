import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Eager Initialization
class SingletonSer  implements Serializable, Cloneable{
	
	
	private static SingletonSer instance;
	
	private SingletonSer() {}
	
	//static initialization
	static {
		try {
			instance = new SingletonSer();
		} catch (Exception e) {
			throw new RuntimeException("error occured");
		}
	}
	
	public static SingletonSer getInstance() { // global access point 
		return instance;
	}
	
	//5
	//when an object is read, simply replace it with singleton instance
	private Object readResolve() {
		return instance;
	}

	//6
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new RuntimeException("clone not supported....");
//		return super.clone();
	}
	
	
}

public class SingletonUsingSerialization {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {
		
		//7
		SingletonSer singleton = SingletonSer.getInstance();
		System.out.println(singleton.hashCode());
		
		SingletonSer singleton1 = (SingletonSer) singleton.clone();
		System.out.println(singleton1.hashCode());
		
	}

}
