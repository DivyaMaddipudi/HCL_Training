package com.day2.relations;

public class Refill {
	private String inkColor;
	private String refilBrand;
	
	public Refill() { }
	
	public Refill(String inkColor, String refilBrand) {
		this.inkColor = inkColor;
		this.refilBrand = refilBrand;
	}

	public String getInkColor() {
		return inkColor;
	}

	@Override
	public String toString() {
		return "Refill [inkColor=" + inkColor + ", refilBrand=" + refilBrand + "]";
	}
	
	
	
}
