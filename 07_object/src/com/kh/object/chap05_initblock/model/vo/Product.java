package com.kh.object.chap05_initblock.model.vo;

public class Product {
	
	private String pName = "갤럭시Z플립"; //상품명
							// 명시적 초기화
	private int price; // 가격
	
	{ //인스턴스 초기화 블록
		// 인스턴스 변수(멤버변수)를 
		//객체 생성 시 마다 한번에 초기화 하는 용도
		
		pName = "갤럭시Z플립";
		price = 1200000;
		
	}
	
	public String selectProduct() {
		
		return pName + " / " + price;
	}
	
	//getter / setter
	
	
	
	
	
}
