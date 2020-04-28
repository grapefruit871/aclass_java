package com.kh.poly.chap02.ex1.model.service;

public class ExampleServiceImpl implements ExampleService {

	@Override
	public String javaFeatures() {
		
		return "자바의 특징 : 1. 운영체제에 독립적(이식성이 높음)\r\n" + 
				"2. 객체 지향 언어\r\n" + 
				"3. 사용하기 쉬운 언어\r\n" + 
				"- 능률적이고 명확한 코드 작성 가능\r\n" + 
				"- 다른 언어의 단점 보완(포인터, 메모리 관리)\r\n" + 
				"4. 자동 메모리 관리(Garbage Collection)\r\n" + 
				"5. 동적 로딩 지원\r\n" + 
				"6. 멀티쓰레드 지원\r\n" + 
				"7. 네트워크와 분산환경 지원";
	}

	@Override
	public String defineInheritance() {
	
		return "다른 클래스가 가지고 있는 멤버(필드, 메소드)들을 새로 작성할 클래스에서 직접 만들지 않고 상속을 받음으로써 "
				+ "새 클래스가 자신의 멤버처럼 사용할 수 있는 기능";
	}

	@Override
	public String definePolymorphism() {
		
		return null;
	}

	@Override
	public String defineAbstractClass() {
		
		return null;
	}

	@Override
	public String defineInterface() {
	
		return null;
	}

	@Override
	public String gugudan(int start, int end) {
		
		return null;
	}

	@Override
	public String reverseStar(int input) {
		
		return null;
	}

}
