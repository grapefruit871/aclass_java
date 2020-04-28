package com.kh.control.practice;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		//키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		String result = (num1 > 0) ? "양수이다." : "양수가 아니다.";
		
		System.out.println(result);
		
		
		
	
		
	}
	
	public void practice2() {
		
		//키보드로 입력 받은 하나의 정수가 양수이면 “양수다“,
		//양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		String result = (num1 > 0) ? "양수이다." : ((num1 < 0) ? "음수다." : "0이다.");
		
		System.out.println(result);
	}
	
	public void practice3() {
		//키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num1 = sc. nextInt();
		sc.nextLine();
		
		String result = (num1 % 2 == 0) ? "짝수다." : "홀수다.";
		
		System.out.println(result);
		
	}
	
	public void practice4() { 
		//모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
		//1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수 : ");
		int num1 = sc. nextInt();
		sc.nextLine();
		
		System.out.print("사탕갯수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		int result1 = (num2 / num1);
		int result2 = (num2 % num1);
		
		System.out.println("1 인당 사탕 개수 : " + result1 );
		System.out.println("남은 사탕 개수 : " + result2);
		
		
	}
	
	public void practice5() {
		//키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		//이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		sc.nextLine();
		
		System.out.print("반 : ");
		int classes = sc.nextInt();
		sc.nextLine();
		
		System.out.print("번호 : ");
		int number1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적 : ");
		double test = sc.nextDouble();
		sc.nextLine();
		

		//System.out.printf();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

	
	
	
	
}
