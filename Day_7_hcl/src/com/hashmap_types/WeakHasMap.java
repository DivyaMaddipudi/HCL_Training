package com.hashmap_types;

import java.time.temporal.WeekFields;
import java.util.*;


class Value {
	private int id;

	public Value(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
		Value other = (Value) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Value [id=" + id + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalized is called....");
		super.finalize();
	}
	
}

public class WeakHasMap {
	
	public static void main(String[] args) {
		
		WeakHashMap<Value, Integer>  map = new WeakHashMap<>();
		
		Value value = new Value(33);
		map.put(value, 33);
		value = null;
		Runtime.getRuntime().gc();
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {}
		
		System.out.println(map);
	}

}
