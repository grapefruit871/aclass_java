package com.kh.inherit.practice.model.vo;

public class Circle extends Point {
	
	
	private int radius; // 반지름
	
	public Circle() {}//기본생성자
       
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
		
		
		
		
		
	}
	@Override
	public String toString() {
	   return super.toString() + ", " + radius;
	   		// x+"," + y
	} 
		
}
