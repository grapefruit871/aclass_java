package com.kh.inherit.practice.model.service;

import com.kh.inherit.practice.model.vo.Rectangle;

public class RectangleService {

	
	private Rectangle r = new Rectangle();
	
	
	public String calcArea(int x, int y, int height, int width) {
		//사각형 넓이
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		
		double area = Math.PI * width * height;
		
		return "사각형 넓이 : " + r + " / " + area;
	}
		
	public String calcPerimeter(int x, int y, int height, int width) {
		//사각형 둘레
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		double Perimeter = 2*(width + height);
		
		return "사각형 둘레 : " + r + " / " + Perimeter;
		
	}
}
