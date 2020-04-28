package com.kh.variable.controller;

public class C_Casting {

	/*
	 * 컴퓨터의 값 처리 규칙 1. 같은 자료형 끼리만 대입이 가능하다. 2. 같은 자료형 끼리만 계산이 가능하다. 3. 계산의 결과는 계산에
	 * 사용된 자료형과 같다.
	 * 
	 * --> 형변환을 이용하면 위 규칙을 깰 수 있다.
	 * 
	 * 형변환의 종류 1. 자동 형변환 2. 강제(명시적) 형변환
	 * 
	 */

	// 자동 형번환
	// 값의 범위가 작은 자료형과 큰 자료형 간의 연산 시
	// 컴파일러가 자동으로 작은 자료형을 큰 자료형으로 변환 시키는 것.

	public void autoCasting() {

		int i = 12; // 4byte
		double d = 3.3; // 8byte
		double result = i + d;
		// 12 + 3.3
		// 12.0 + 3.3 = 15.3

		System.out.println(i + " + " + d + " = " + (i + d));
		System.out.println(i + " + " + d + " = " + result);
		// 12 + 3.3 = 15.3

		// int(4byte) -> long(8byte)
		int i2 = 2147483647;
		long l2 = i2 + 1;
		// 컴파일러가 2147483647L + 1L형태로 변환해어 계산을 진행함.
		// 이것도 자동 형변화
		System.out.println("12의 값 : " + 12);

		// float(4byte) -> double(8byte)
		float f3 = 2.13F;
		double d3 = 3.14;
		double result3 = f3 + d3;
		System.out.println(f3 + " + " + d3 + " =  " + result3);
		// 2.13 + 3.14 = 5.27

		// 10진수 유한소수를 2진수로 변환하면 무한소수가 되는 경우가 많다.
		// 그런데, 컴퓨터는 실수를 부도소수점으로 표현하기 때문에
		// 2진수 무한 소수를 정확히 표현하는데 한계가 있다.
		// 그래서 오차가 발생한다.

		// char(2byte) -> int(4byte)
		int i4 = 'A'; // int형 변수에 char형 리터럴 값 대입
		/*
		 * char -> int 자동 형변환이 가능한 이유 char라는 자료형 변수은 문자 자체를 저장하는 변수가 아닌 2byte(0~65536)범위
		 * 내의 숫자를 저장하고, 유니코드라는 문자표에서 해당 번호와 일치하는 문자를 찾아 출력하는 자료형이다. --> 결론 : char는
		 * 정수형이면서 문자형
		 */

		// char 자료형 변수에 정수값 저장하기
		char ch5 = 65;

		System.out.println("i4의 값 : " + i4);
		System.out.println("ch5의 값 : " + ch5);

		// byte, short, int 간의 형변환
		byte bNum1 = 1;
		byte bNum2 = 10;
		// byte bResult = bNum1 + bNum2;

		// byte, short, char, int
		// 이 네 가지 자료형은 int 리터럴로 값을 초기화 할 수 있다.
		// 이는 int 자료형을 제외하고 최초 한 번만 가능하다.
		// 초기화 된 이후 byte, short, char 자료형 변수의
		// 값을 이용하여 계산 (연산) 진행 시
		// 무조건 int형으로 연산처리가 진행된다.

		// byte 변수끼리 연산 시
		// 변수의 값이 int형으로 처리되기 때문에
		// bResult 에 값 저장이 불가능한 상태.
		// --> int형 결과를 byte로 강제 형변환하면 저장 가능!
		byte bResult = (byte) (bNum1 + bNum2);

	}

	// 강제 형변환
	public void forcedCasting() {

		// 값의 범위가 큰 자료형 -> 작은 자료형으로 강제변환시키는 것
		int iNum1 = 10;
		long lNum1 = 10l;

		// 프로그래밍에서 '=' 기호는 대입 연산자를 의미
		// -> 대입도 연산이다.
		// long 형 변수에 int 리터럴 값을 대입할 경우
		// int 리터럴 값이 long형의 리터럴 자동 형변환하여 저장됨.

		// int result = iNum1 + lNum1;
		// iNum1 + lNum1 의 연산 결과 자료형은? long
		// int = long 대입연산 모양이 됨.

		// 에러 해결 방법
		// 방법 1. 사용자가 타협을 본다.
		// result의 타입 long형으로 변환
		long result = iNum1 + lNum1;

		// 방법2. iNum1 + lNum1의 연산 결과를
		// int형으로 강제 형변환한다.
		int result2 = (int) (iNum1 + lNum1);

		// 방법3. lNum1을 int형으로 강제 형변환 한다.
		int result3 = iNum1 + (int) lNum1;
	}

}
