package com.kh.control.chap01.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	
	
	public void practice1() {
		/*
		아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
		종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
		// 1. if-else if문 이용하는 방법
		/*
		if(menu == 1) {
			System.out.println("입력 메뉴입니다.");
		}else if(menu == 2) {
			System.out.println("수정 메뉴입니다.");
		}else if(menu == 3) {
			System.out.println("조회 메뉴입니다.");
		}else if(menu == 4) {
			System.out.println("삭제 메뉴입니다.");
		}else if(menu == 9) {
			System.out.println("프로그램이 종료됩니다.");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		*/
		
		// 2. switch문 이용하는 방법
		/*
		switch(menu) {
		case 1 : System.out.println("입력 메뉴입니다."); break;
		case 2 : System.out.println("수정 메뉴입니다."); break;
		case 3 : System.out.println("조회 메뉴입니다."); break;
		case 4 : System.out.println("삭제 메뉴입니다."); break;
		case 9 : System.out.println("프로그램이 종료됩니다."); break;
		default : System.out.println("잘못입력하셨습니다."); break;
		}
		*/
		
		
		// 3. switch문 이용할 때 String 변수 이용하는 방법
		String str;
		
		switch(menu) {
		case 1 : str = "입력"; break;
		case 2 : str = "수정"; break;
		case 3 : str = "조회"; break;
		case 4 : str = "삭제"; break;
		case 9 : System.out.println("프로그램이 종료됩니다."); return;
		default : System.out.println("잘못입력하셨습니다."); return;
		}
		
		System.out.println(str + " 메뉴입니다.");
		
	}
	
	
	public void practice2() {
		/*
		키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
		짝수가 아니면 “홀수다“를 출력하세요.
		양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수다.");
			}else {
				System.out.println("홀수다.");
			}
		}else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	
	
	public void practice3() {
		/*
		국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		불합격인 경우에는 “불합격입니다.”를 출력하세요.
	 	*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng; // 합계
		double avg = sum / 3.0; // 평균
		
		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	
	public void practice4() {
		// 수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		String season;
		
		switch(num) {
		case 12:
		case 1:
		case 2:
				season = "겨울";
				break;
		case 3:
		case 4:
		case 5: 
				season = "봄";
				break;
		case 6:
		case 7:
		case 8:
				season = "여름";
				break;
		case 9:
		case 10:
		case 11:
				season = "가을";
				break;
		default : 
				season = "잘못 입력된 달";
				break;
		}
		
		System.out.println(num + "월은 " + season + "입니다.");
	}
	
	
	public void practice5() {
		/* 실습문제 5
		아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		로그인 성공 시 “로그인 성공”, 
		아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
		비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
		*/
		
		Scanner sc = new Scanner(System.in);
		String id = "myId";
		String password = "myPassword12";
		
		System.out.print("아이디 : ");
		String inputId = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String inputPassword = sc.nextLine();
		
		// * 클래스도 자료형 -> 그래서 String도 자료형
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
	
	
	public void practice6() {
		/*
		사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
		단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		비회원은 게시글 조회만 가능합니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		
		switch(sc.nextLine()) {
		case "관리자" : System.out.println("회원관리, 게시글 관리,");
		case "회원"  : System.out.println("게시글 작성, 댓글 작성, ");
		case "비회원" : System.out.println("게시글 조회"); break; // 여기서 break해야 default문까지 넘어가지 않는다.
		default : System.out.println("잘못 입력하셨습니다."); break;
		}
	}
	
	
	
	public void practice7() {
		/*
		키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라 
		저체중/정상체중/과체중/비만을 출력하세요.
		BMI = 몸무게 / (키(m) * 키(m))
		BMI가 18.5미만일 경우 저체중  /  18.5이상 23미만일 경우 정상체중
		BMI가 23이상 25미만일 경우 과체중  /  25이상 30미만일 경우 비만
		BMI가 30이상일 경우 고도 비만
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		}else if(bmi < 23) {
			System.out.println("정상체중");
		}else if(bmi < 25) {
			System.out.println("과체중");
		}else {
			System.out.println("비만");
		}
	}
	
	
	public void practice8() {
		/*
		키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
		(단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시 
		“잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char ch = sc.nextLine().charAt(0);
		
		
		double result=0;
		
		if(num1 > 0 && num2 > 0) {
			
			switch(ch) {
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '*': result = num1 * num2; break;
			case '/': result = (double)num1 / num2; break;
			case '%': result = num1 % num2; break;
			default: System.out.println("연산자를 잘못 입력하셨습니다. 프로그램을 종료합니다."); return;
			}
			
			System.out.printf("%d %s %d = %f", num1, ch, num2, result);
		}else {
			System.out.println("양수가 아닌 값을 입력하셨습니다. 프로그램을 종료합니다."); 
		}
		

	}
	
	public void practice9() {
		/*
		중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
		평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		이 때, 출석 비율은 출석 회수는 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요. 
		70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		*/

		Scanner sc = new Scanner(System.in);

		System.out.print("중간 고사 점수 : ");
		int midTerm = sc.nextInt();

		System.out.print("기말 고사 점수 : ");
		int finalTerm = sc.nextInt();

		System.out.print("과제  점수 : ");
		int homework = sc.nextInt();

		System.out.print("출석 회수 : ");
		int attendance = sc.nextInt();
		
		double m = midTerm * 0.2;
		double f = finalTerm * 0.3;
		double hw = homework * 0.3;
		double at = attendance;
		
		double sum = m + f + hw + at;
		
		System.out.println("===========결과==========");
		if(at >= 20 * 0.7) {
			System.out.println("중간 고사 점수(20) : " + m);
			System.out.println("기말 고사 점수(30) : " + f);
			System.out.println("과제 점수       (30) : " + hw);
			System.out.println("출석 점수       (20) : " + at);
			
			System.out.println("총점 : " + sum);
			
			if(sum >= 70) {
				System.out.println("PASS");
			}else {
				System.out.println("FAIL [점수 미달] (총점 " + sum + ")");
			}
		}else {
			System.out.println("FAIL [출석 횟수 부족] (" + attendance + "/20)");
		}
	}
	

}
