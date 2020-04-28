package com.kh.inherit.cha01.model.vo;

public class Car extends Product {

	private String engine;
	private String color;
	private String carType;
	//private String pName;
	//private int price;
	
	
	//기본생성자
	
	public Car() {}


	public Car(String engine, String color, String carType, String pName, int price) {
		
		super(pName, price);
		this.engine = engine;
		this.color = color;
		this.carType = carType;
	//	this.pName = pName;
	//	this.price = price;
	}


	public String getEngine() {
		return engine;
	}


	public void setEngine(String engine) {
		this.engine = engine;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getCarType() {
		return carType;
	}


//	public void setCarType(String carType) {
	//	this.carType = carType;
//	}


	//public String getpName() {
	//	return pName;
	//}


//	public void setpName(String pName) {
//		this.pName = pName;
//	}


//	public int getPrice() {
//		return price;
//	}


//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	// 모든 필드 정보 반환
	
	public String selectField() {
		return engine + " / " + color + " / " + carType + " / " + super.selectField();
	}															// ===> pName + "/" + price
	
	
	// super 참조 변수
	// - 자식 객체 내에 부모 시작 부분을 참조하는 변수
	// - 부모의 필드와 메소드에 접근해야할 때 사용.
	
	
}
