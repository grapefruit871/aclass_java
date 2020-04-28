package com.kh.control.chap02.service;

import java.util.Scanner;

public class B_While {
	
	//While문
	//for문과 달리 반복 횟수가 정해져 있지 않고
	//특정 조건에서 false가 될 때 까지 반복하는 용도로 사용되는 반복문
	
	
	/*[표현식]
	 * 
	 * [초기식]
	 * while(조건식){
	 *       수행될 문장;
	 *       [증감식 or 분기문]
	 *       }
	 * 
	 * - 조건식 확인 -> 조건식이 true이면 while 내부 코드 수행
	 * -> while문 처음으로 돌아가 조건식 확인 -> (반복)
	 * -> 조건식이 false가 되면 while문을 빠져 나옴
	 * 
	 * 
	 * */
	public void example1() {
		// 1~5까지 출력(While)
		
		int i = 1; //초기식
		while(i <= 5) {//조건식
			System.out.println(i); //수행될 문장
			i++; //증감식
		}
		
	}
	
	public void example2() { 
		// 10~1 까지 출력
		
		int i = 10;
		while(i>=1) { 
			System.out.println(i);
			i--;
		}
		
		
		
	}
	
	public void example3() { 
		// 입력되는 모든 수의 합 (0 입력 시 종료)
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; //합계를 저장하기위한 변수 선언 및 0으로 초기화
		
		int input = 0; //입력되는 값을 저장하기 위한 변수 선언 및 초기화
		// 0으로 초기화 하는 이유? 0이 int형의 기본 값
		
		boolean flag = true;//while문 반복 제어용 변수
		
		while(flag) {
			System.out.println("입력 : ");
			input = sc.nextInt();
			sc.hasNextLine();
			
			if(input == 0) {//입력된 값이 0인 경우 종료		}
				// --> while문을 멈춰야됨
				// --> While문의 조건식을 false로 변환
				// --> flag 변수를 false로 변환
                 		
				flag = false;
			}else {
				sum += input;
			}
	}
	
		System.out.println("합계  : " + sum);

	}
	
	public void example4() {
		//증첩while문
		//입력되는 수 만큼의 가로 세로 길이의 "*"로 채워진 사각형 출력하기
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수 입력 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		int i = 0; //초기식
		while(i < input) { //행 조건식
		
			int j = 0; //초기식2
			while(j<input) { //열조건식
				System.out.print("*");
				j++ ;
			}
			
			System.out.println(); //줄바꿈ㄴ
			
			i++; //증감식
		
	}		
		
		//while문을 중첩해서 사용하는 것은 권자아지 않는다.
		//사용해야될 경우 종료 조건을 명확하게 할 것.
		
		
	
	}
	
	public void example5() {
		//키보드로 문자열을 입력받아 그대로 출력하기 반복
		//단 , exit 입력시 종료
		
		Scanner sc = new Scanner(System.in);
		String str = null; 
		// null은 참조형 변수의 기본값
		// null의 의미 : 참조하고 있는 값이 없다
		// "비어있다"와는 다른 의미
		
		//	String str2 = ""; // 빈문자열(공백)
		do { //반복문이 최초 한번은 무조건 실행하겠다는 의미
			System.out.println("문자열 입력 : ");
			str = sc.nextLine();
			
			System.out.println("str : " + str);
			
		}while(!str.contentEquals("exit"));
			
			
			
	
	}
	
	public void example6() {
		//종료에 해당하는 번호가 입력되기 전까지
		//무한히  반복되는 메뉴 만들기
		
		Scanner sc = new Scanner(System.in);
		
		int menu = 0; // 입력받는 번호를 저장할 변수 선언 및 초기화
		
		do {
			System.out.println("=====================");
			System.out.println("1. 1번기능");
			System.out.println("2. 2번기능");
			System.out.println("3. 3번기능");
			System.out.println("0. 프로그램 종료");
			System.out.println("=====================");
			
			System.out.print("메뉴 선택 >> ");
			menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : System.out.println("1번 기능 수행"); break;
			case 2 : System.out.println("2번 기능 수행"); break;
			case 3 : System.out.println("3번 기능 수행"); break;
			case 0 : System.out.println("프로그램을 종료합니다..."); break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
			
		}while(menu != 0);
		
		
		
	}
	

}
