package com.kh.darray.practice;

import java.util.Scanner;

public class DArrayPractice {

	/*
	 * 3행 3열짜리 문자열 배열을 선언 및 할당하고 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장
	 * 후 출력하세요.
	 * 
	 * ex. (0, 0)(0, 1)(0, 2) (1, 0)(1, 1)(1, 2) (2, 0)(2, 1)(2, 2)
	 */

	public void practice1() {

		String arr[][] = new String[3][3];

		// 행 지정
		for (int i = 0; i < arr.length; i++) {

			// 열 지정
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = "(" + i + ", " + j + ")";

				System.out.printf("%s", arr[i][j]);
			} // 안쪽 for end

			System.out.println();
		} // 출력 시 행 구분을 위한 줄바꿈

	}

	public void practice2() {

		/*
		 * 4행 4열짜리 정수형 배열을 선언 및 할당하고 1) 1 ~ 16까지 값을 차례대로 저장하세요. 2) 저장된 값들을 차례대로 출력하세요.
		 */

		int dala[][] = new int[4][4];

		int value = 1;

		for (int i = 0; i < dala.length; i++) {

			for (int j = 0; j < dala[i].length; j++) {

				dala[i][j] = value++;

				System.out.printf("%2d", dala[i][j]);
			}
			System.out.println();
		}
	}

	public void practice3() {
		/*
		 * 4행 4열짜리 정수형 배열을 선언 및 할당하고 1) 16 ~ 1과 같이 값을 거꾸로 저장하세요. 2) 저장된 값들을 차례대로 출력하세요
		 */

		int coffee[][] = new int[4][4];

		int value = 16;

		for (int i = 0; i < coffee.length; i++) {

			for (int j = 0; j < coffee[i].length; j++) {

				coffee[i][j] = value--;
				System.out.printf("%2d", coffee[i][j]);
			}
			System.out.println();
		}

	}

	public void practice4() {

		/*
		 * 4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후 아래의 내용처럼 처리하세요
		 */

		int arr[][] = new int[4][4];

		// 난수 생성
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr[i].length - 1; j++) {

				arr[i][j] = (int) (Math.random() * 9 + 1);

			}

		}
		
		
		// 행, 열 합
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (i < 3 && j < 3) {

					arr[3][j] += arr[i][j];
					arr[i][3] += arr[i][j];

				}

				//System.out.printf("%3d", arr[i][j]);

			}
		}
		
		// 총합
		for(int i = 0; i<arr.length-1; i++) { 
			arr[3][3] += arr[i][3] + arr[3][i];
		}

		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

		

		System.out.println();

	}

	public void practice5() {

		/*
		 * 2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 1~10사이 숫자가 아니면 “반드시 1~10 사이의 정수를 입력해야 합니다.”
		 * 출력 후 다시 정수를 받게 하세요. 크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요. (char형은
		 * 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄, 알파벳은 총 26글자)
		 */

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("행 크기 : ");
			int num = sc.nextInt();
			sc.nextLine();
	
			System.out.println("열 크기 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
	
			if (!(num < 11 || num > 0) || !(num2 < 11 || num2 > 0)) {
				System.out.print("반드시 1~10 사이의 정수를 입력해야 합니다.");
	
			} else {
				char[][] arr = new char[num][num2];
	
				for (int i = 0; i < arr.length; i++) {
	
					for (int j = 0; j < arr[i].length; j++) {
	
						arr[i][j] = (char) (int) (Math.random() * 10 + 65);
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
				
				break;
			}
		}

	}

	public void practice6() {

		/*-String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원",
			"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
			위의 초기화되어 있는 배열을 가지고 아래의 ‘[그림] 실습문제6 흐름’과 같은 방식으로 출력하세요.
			단, print()를 사용하고 값 사이에 띄어쓰기(“ “)가 존재하도록 출력하세요.*/

		String[][] strArr = {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원",
			"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};

		for (int i = 0; i < strArr.length; i++) {

			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");
						
			}
			
		}
		
			
			
		}
	public void practice7() {
	
		/*사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
	       문자형 가변 배열을 선언 및 할당하세요.
	       그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		ex.
		행의 크기 : 4
		0열의 크기 : 2
		1열의 크기 : 6
		2열의 크기 : 3
		3열의 크기 : 5
		a b
		c d e f g h
		i j k
		l m n o p 
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("행의 크기 : ");
		int a = sc.nextInt();

		
		char[][] arr = new char[a][];
				
			for(int i = 0; i<arr.length; i++) {
			
				
			System.out.println ( i + "열의 크기 : " );
			int b = sc.nextInt();
		
			
			arr[i]= new char[b];		
			}
			
			char value = 'a';
			for(int i = 0; i<arr.length; i++) {
				for(int j = 0; j<arr[i].length; j++) {
					
					arr[i][j] = value++;
					
				}
			}
			for(int i=0; i<arr.length;i++) {
				for(int j = 0; j<arr[i].length; j++) {
					
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			
			
		}
	

		
	}


