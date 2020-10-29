package com.ARM;


class Door implements AutoCloseable {

	public Door() {
		System.out.println("ctr of door");
	}
	@Override
	public void close() throws Exception {
		System.out.println("close is called for door");		
	}
	
	public void doDoorLogic() {
		if(1==1)
			throw new NullPointerException();
	}
}

class Window implements AutoCloseable {

	public Window() {
		System.out.println("ctr of window");
	}
	@Override
	public void close() throws Exception {
		System.out.println("close is called for window");
		
	}
	
	public void doWindowLogic() {
		System.out.println("some bl with window");
	}
	
}
public class HowArmWorks {
	
	public static void main(String[] args) {
		try(Door door = new Door(); Window window = new Window();) {
			door.doDoorLogic();
			window.doWindowLogic();
		} catch (Exception e) {
			System.out.println(e.getCause());
		}
	}

}
