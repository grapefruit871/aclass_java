package com.kh.inherit.practice.model.service;

import com.kh.inherit.practice.model.vo.Circle;

public class CircleService {
	
	private Circle c = new Circle();
	

	
	
	public String calcArea(int x, int y, int radius) {
		//원 넓이 계산 기능
		
		//객체 필드 초기화
				c.setX(x);
				c.setY(y);
				c.setRadius(radius);
		
		double area = Math.PI * radius * radius;
		
		
		
		return "원넓이 : " + c + " / " + area;
	}
	
	public String calcCircum(int x, int y, int radius) {
		//원 둘레 계산 기능
		
		//객체 필드 초기화
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		// 원 둘레
		double circum = 2 * Math.PI * radius;
		
		return "원둘레 : " + c.toString() + " / " + circum;
	}

}
