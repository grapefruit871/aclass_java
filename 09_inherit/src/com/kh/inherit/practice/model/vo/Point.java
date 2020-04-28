package com.kh.inherit.practice.model.vo;

public class Point {
	private int x; //x좌표
	private int y;	// y좌표
	
	
	
	public Point() {} //기본 생성자


	//매개변수 있는 생성자
	public Point(int x, int y) { 
		super();
		this.x = x;
		this.y = y;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	@Override
	public String toString() {
		return x + ", " + y;
	}
	
	
	
	
}
