package com.kh.poly.chap02.ex1.view;

import java.util.Scanner;

import com.kh.poly.chap02.ex1.model.service.ExampleService;
import com.kh.poly.chap02.ex1.model.service.ExampleServiceImpl;

public class ExampleView {
	private ExampleService service = new ExampleServiceImpl();
	       // 인터페이스 					인터페이스를 구현한 클래스 
		 // 부모 타입 참조 변수				자식 타입 객체 (다형성)
	
	private Scanner sc = new Scanner(System.in);
	
	public ExampleView()
	{
		service.insert
	}
	
	public void mainMenu() {
		
		int input = 0;
		
		do {
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1 ~ 7 사이를 입력해 주세요 : ");
		input = sc.nextInt();
		
		switch(input) {
			case 1 : System.out.println(service.javaFeatures()); break;
			case 2 : System.out.println(service.defineInheritance());break;
			case 3 : System.out.println(service.definePolymorphism());break;
			case 4 : System.out.println(service.defineAbstractClass()); break;
			case 5 : System.out.println(service.defineInterface());break;
			case 6 : System.out.println(service.gugudan(2, 9));break;
			case 7 : System.out.println(service.reverseStar(input)); break;
			case 9 : System.out.println("종료");break;
			default: System.out.println("다시 입력");break;
		}
		
		
		}while(input != 9);
		
		
		}
	
	public void javaFeature() {
		
		System.out.println(service.javaFeatures());
		}
		
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
