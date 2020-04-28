package com.kh.control.chap01.practice;

import java.util.Scanner;

public class ControlPractice {

	public void practice5() { 
		
		/*아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		로그인 성공 시 “로그인 성공”,
		아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
		비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
		*/
		
		Scanner sc = new Scanner(System.in);
		String id = "myId";
		String password = "myPassword12";
		
		System.out.print("아이디 : ");
		String inputId =sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String inputPassword = sc.nextLine();
		
		// *클래스도 자료형 -> 그래서 String도 자료형
		// String.equals()
		// String 자료형이 가지고 있는 진짜 값들이 같은지를 비교하는 메소드
		// 결과로 true 또는 false 반환
		
		if(id.equals(inputId)) {
			if(password.equals(inputPassword)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
			
		}
		
	}
	
	public void practice1() {
		/*아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
		종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
		ex.
		1. 입력
		2. 수정
		3. 조회
		4. 삭제
		7. 종료
		메뉴 번호를 입력하세요 : 3
		조회 메뉴입니다.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴번호를 입력하세요 : ");
		String menu = sc.nextLine();
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1: System.out.println("입력"); break;
		case 2: System.out.println("수정"); break;
		case 3: System.out.println("조회"); break;
		case 4: System.out.println("삭제"); break;
		case 7: System.out.println("종료"); 
		
				
		
		default : System.out.println("잘못 입력함"); break;
		
		
		}
		System.out.println( menu + "메뉴 입니다.");
		
		
		
		
		
		
		
	}
	
	public void practice2() {
		/*키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
		짝수가 아니면 “홀수다“를 출력하세요.
		양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		ex.
		숫자를 한 개 입력하세요 : -8
		양수만 입력해주세요.
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0) {
		
		if(num / 2 == 0 ) {
			System.out.println("짝수다");
			
		
		}else if (num / 2 == 1 ) {
			System.out.println("홀수다.");
		}
	}
	
	
	}
	
	public void practice3() { 
		/*국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		불합격인 경우에는 “불합격입니다.”를 출력하세요
		 * */
		
		Scanner sc = new Scanner (System.in);
		System.out.print("국어점수 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("영어점수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("수학점수 : ");
		int num3 = sc.nextInt();
		sc.nextLine();
		

		
		String result = (num1 + num2 + num3 / 3 < 40) ? "불합격입니다.": ((num1 + num2 + num3 / 3 > 60) ? "축하합니다. 합격입니다" : "불합격입니다." );
		
		System.out.println(result);
		

	
		
		
		
		
		
		}
	
	public void practice4() {
		/*수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.
		ex 1.
		1~12 사이의 정수 입력 : 8
		8월은 여름입니다.
		ex 2.
		1~12 사이의 정수 입력 : 99
		99월은 잘못 입력된 달입니다.*/
		
		/*if(month == 1 || month == 2 || month == 12) {
			season = "겨울";
			} else if(month >= 3 && month <= 5) {
			season = "봄";
			} else if(month >= 6 && month <= 8) {
			season = "여름";
			} else if(month >= 9 && month <= 11) {
			season = "가을";
			} else {
			season = "해당하는 계절이 없습니다.";
			}  */
		
		Scanner sc= new Scanner(System.in);
		System.out.print(" 1~12사이의 정수 입력 : ");
		int month = sc.nextInt();
		sc.nextLine();
		
		switch(month) {
		case 1 : case 2 : case 3:
			System.out.printf("%d월은 봄입니다.", month); break;
			
		case 4 : case 5 : case 6:
			System.out.printf("%d월은 여름입니다", month); break;
			
		case 7 :  case 8 : case 9:
			System.out.printf("%d월은 가을입니다.", month); break;
			
		case 10: case 11: case 12:
			System.out.printf("%d월은 겨울입니다.", month); break;
			
			default : System.out.printf("%d월은 해당하는 계절이 없습니다. ", month);
			
		}
		
		
		
		
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BM1");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		
		System.out.println("선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		//같은 클래스 내의 메소드 끼리는 
		//메소드명을 작성하는 것으로 호출 가능
		switch(menu) { 
		case 1 : practice1(); break;
		case 2 : practice2(); break;
		case 3 : practice3(); break;
		case 4 : practice4(); break;
		case 5 : practice5(); break;
		case 6 : practice6(); break;
		case 7 : practice7(); break;
		case 8 : practice8(); break;
		case 9 : practice9(); break;
		case 10 : aif.example1(); break;


		default : System.out.println("잘못 입력하셨습니다.");
		
		
		
		
		
		
		
		
		
			
	}
			
	
}
