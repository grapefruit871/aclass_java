package com.kh.inherit.cha01.model.vo;

public class Computer extends Product{

	private String cpu;
	private int ram;
	private String pName;
	private int price;
	
	
	//기본생성자
	public Computer() {
		super();
	}

	//생성자 자동 완성
	//alt + shift + s -> o 
	public Computer(String cpu, int ram, String pName, int price) {

		this.cpu = cpu;
		this.ram = ram;
		//this.pName = pName;
		//this.price = price;
	}

	// getter / setter
	// alt + shift + s  --> r
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	/*public String getpName() {
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
	}*/
	
	
	// 필드 정보 모두 반환하는 메소드
	public String selectField() {
		return cpu + " / " + ram + " / "; // + pName + " / " + price;
	}
	

}
