package com.kh.poly.chap01.ex.model.service;

import com.kh.poly.chap01.ex.model.vo.Electronics;
import com.kh.poly.chap01.ex.model.vo.Tablet;

public class ElectronicsService {
	
	// 부모 타입 객체배열을 선언 및 할당하여 
	// 자식 객체들을 한번에 관리 
	
	private Electronics[] el = new Electronics[3];
	
	private int index = 0;
	
	
	// 외부에서 생성된 객체의 주소를 전달받아 el배열에 추가
/*	public void insert(Desktop desk) {}
	public void insert(Laptop lap) {}
	public void insert(Tablet tap) {}*/
	
	//오버로딩을 사용해도 되지만 코드길이가 늘어나서 비효율적
	// --> 다형성을 적용하여 매개변수의 타입을 부모타입으로 ㅏ여
	//자식 객체 주소를 전달받도록 함.
	
	
	public void insert(Electronics e) { // 매개변수에 다형성 적용
		el[index++] = e;
		//index 번째 el요소에 전달받은 자식 객체 주소를 추가하고
		//index를 1 증가시킴
	}
	
	//전체 정보 조회
	public String selectAll() {
		String str = "\n@@@@@ 전체 상품 조회 @@@@@\n";
		
		for(int i=0; i<el.length ; i++) {
			str += el[i].toString() + "\n" ; 
		// el[i].toString()
		// 부모의 toString()을 호출하고 있지만 (정적 바인딩)
		// 실제 실행 시 자식의 오버라이딩된 toString()을 호출함
		// (동적바인딩)
		}
		
		return str;
	}
	
	
	// 각 기기 정보 조회
  /*public Desktop selectOne(int i ) {}
	public Laptop selectOne(int i ) {}
	*/
	//전자 기기 하나씩의 정보를 반환해야되는 경우
	//기기별로 타입이 모두 다르므로 반환형을 다르게 해서 메소드를 작성해야함.
	//하지만, 오버로딩이 성립하지 않음(매개변수가 모두 동일)
	//그래서 메소드를 따로따로 만드어야 하지만 번거롭고 효율적이지 않음
	// --> 반환형에 다형성을 적용
	
	public Electronics selectOne(int i) {
		return el[i-1];
	}
	
	
	
	//기기 판매 가능 여부 (품절)
	public String selectSoldOut(Electronics e) {
		
		if(e instanceof Tablet) {
			//e가 참조하고 있는 객체가 Tablet 타입이면
			return "판매 불가[품절]";
			
		}else {
			return "판매 가능";
			
		}
	}
	

	
}
