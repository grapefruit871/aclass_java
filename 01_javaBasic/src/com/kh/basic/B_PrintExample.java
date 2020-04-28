package com.kh.basic;

public class B_PrintExample {

		public void printValue() {
			// 여러가지 형태의 값을 출력하는 메소드(기능)
			
			//문자열("")
			System.out.println("문자열 출력");
			System.out.print("오늘도 화이팅입니당!ㅎ");
			System.out.println(); //줄바꿈 역할(엔터)
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("쉬는시간 입니다...!");
			
			//숫자 출력
			//문자열 처럼 ""(쌍따옴표)를 사용하지 않아도 된다.
			System.out.println("숫자 출력~~");
			System.out.println(123); //정수 
			System.out.println(1.23); //실수
			
			//숫자는 직접적으로 연산도 가능하다.
			System.out.println(2+3); //5
			System.out.println(3.14 - 0.14); //3.0
			// 실수 연산의 결과값은 똑같이 실수
			
			//자바는 문자열 끼리도 더하기가 될까..? ->가능하다.
			//abc + def = abcdef
			System.out.println("~문자열더하기~");
			System.out.println("아...." + "배고파요..");
			
			// 숫자 + 문자열
			// 문자열은 더해지는 대상이 문자열이 아닌 경우
			// 다 문자로 바꿔버림.
			System.out.println("숫자 + 문자열");
			System.out.println(5+ 10 + "Hello"); //15Hello
			//15+ "Hello" --> "15" + "Hello" == 15Hello
			
			
			// 문자열 + 숫자
			System.out.println("문자열+ 숫자");
			System.out.println("Hello" + 5 + 10);
			//"Hello"+5+10 --> "Hello" + "5" + 10
			// "Hello5" + "10"
			// "Hello510"
			
		}
}
