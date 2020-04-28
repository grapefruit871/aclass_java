package com.kh.objext.chap04_field.model.vo;

public class FieldTest1 {
	
	// 접근 제한자에 따른 필드 직접 접근 가능 여부
	public int num1 = 1; //num1을 1로 명시적 초기화
						// 객채가 생성됨가 동시에 값이 저장되어 있음.
	
	// (+)public : 같은 프로젝트 내에서 어디서든 직접 접근 가능
	
	protected int num2 = 2;
	// (#)protected : 같은 패키지 내 + 외부 패키지 중 상속 관계에서 직접 접근 가능
	
	int num3 = 3;
	//(~)(default) : 같은 패키지 내에서 직접 접근 가능
	
	private int num4 = 4;
	// (-)private : 같은 클래스 내에서 직접 접근 가능
	
	public void print() {
		// 같은 패키지, 같은 클래스 내부여서
		// 모든 접근 제한자 관계없이 모두 접근 가능
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}
	
}
