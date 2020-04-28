package com.kh.inherit.cha01.model.vo;

public class Cup {
	
	private String brand;
	private double capacity;
	private String pName;
	private int price;
	
	//기본 생성자
	public Cup() {}

	//매개변수 있는 생성자
	public Cup(String brand, double capacity, String pName, int price) {

		this.brand = brand;
		this.capacity = capacity;
		this.pName = pName;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String selectFeld() {
		return brand + " / " + capacity + " / " + pName + " / " + price;
	}
}
