package com.kh.inherit.cha01.model.service;

import com.kh.inherit.cha01.model.vo.Car;
import com.kh.inherit.cha01.model.vo.Computer;

public class InheritService {
	public void example1() {
		//Product를 상속받은 Computer 객체 생성
		
		Computer com = new Computer();
		
		//Computer만의 메소드
		
		com.setCpu("i7 - 9700k");
		com.setRam(32);
		
		//Product로 부터 상속받은 메소드
		com.setpName("삼성 오딧세이");
		com.setPrice(2000000);
		
		
		System.out.println(com.getCpu());
		System.out.println(com.getRam());
		System.out.println(com.getpName());
		System.out.println(com.getPrice());
		
	
		
		System.out.println("====================");
		
		Car car = new Car("V6", "핑크색", "트럭", "포터 벚꽃에디션", 3000000);
		
		System.out.println(car.getEngine());
		System.out.println(car.getColor());
		System.out.println(car.getCarType());
		System.out.println(car.getpName());
		System.out.println(car.getPrice());
		
		System.out.println(car.selectField());
		
	}

}
