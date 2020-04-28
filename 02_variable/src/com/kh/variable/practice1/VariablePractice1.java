package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice1 {

	public void method() {
		// 문제를 충족시킬수 있는 코드 작성

		// ex이름을 입력하세요 : 아무개
		// 성별을 입력하세요(남/여) : 남
		// 나이를 입력하세요 : 20
		// 키를 입력하세요(cm) : 180.5

		// 키 180.5cm인 20살 남자 아무개님 반갑습니다^^
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 :");
		String name = sc.nextLine();

		System.out.print("성별을 입력하세요(남/여) :");
		char gender = sc.nextLine().charAt(0);

		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();

		sc.nextLine();

		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		sc.nextLine();

		System.out.printf("키 %.1fcm인, %d살, %c자, %s님 반갑습니다^^", height, age, gender, name);

	}
	

}
