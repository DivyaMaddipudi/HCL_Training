package com.map_examples;
import java.util.*;

class Key {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Key(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Key [id=" + id + "]";
	}
	
	
}
public class MapWithUseDefinedKey {
	
	public static void main(String[] args) {
		
		//if ur key is user defined object in hashmap then 
		// that key class must be immutable (other wise we could have bugs)
		
		Key key = new Key(121);
		Map<Key, String> hMap = new HashMap<>();
		
		hMap.put(key, "123");
		key.setId(10001);
		System.out.println(hMap.get(key));
		
//		hMap.put(new Key(121), "divya");
//		hMap.put(new Key(122), "satya");
//		hMap.put(new Key(123), "riya");
//		
//		System.out.println(hMap.get(new Key(121)));
		
	}

}
