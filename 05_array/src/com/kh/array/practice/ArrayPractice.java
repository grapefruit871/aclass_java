package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice15() {

		/*
		 * 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고 문자의 개수와 함께 출력하세요. ex. 문자열 : application
		 * 문자열에 있는 문자 : a, p, l, i, c, t, o, n 문자 개수 : 8
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 : ");
		String abc = sc.nextLine();

		char cArr[] = new char[abc.length()];

		for (int i = 0; i < cArr.length; i++) {
			cArr[i] = abc.charAt(i);

//			System.out.println("문자열에 있는 문자 : " + cArr[i]);
		}

		System.out.print("문자열에 있는 문자 : ");

		int count = 0;

		for (int i = 0; i < cArr.length; i++) {

			boolean flag = true;

			for (int j = 0; j < i; j++) {

				if (cArr[i] == cArr[j]) {
					flag = false;
					break;
				}
			}

			if (flag) {
				System.out.print(cArr[i] + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("문자 개수 : " + count);

	}

	public void practice16() {

		/*
		 * 사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고 배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요. 단,
		 * 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지, 늘린 곳에 어떤 데이터를 넣을 것인지 받으세요. 사용자가 더 이상
		 * 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
		 */

		/*
		 * ex. 배열의 크기를 입력하세요 : 3 1번째 문자열 : 자바의 정석 2번째 문자열 : 알고리즘 3번째 문자열 : C프로그래밍 더 값을
		 * 입력하시겠습니까?(Y/N) : y 더 입력하고 싶은 개수 : 2 4번째 문자열 : 인간관계 5번째 문자열 : 자기계발 더 값을
		 * 입력하시겠습니까?(Y/N) : y 더 입력하고 싶은 개수 : 1 6번째 문자열 : 영단어600 더 값을 입력하시겠습니까?(Y/N) : n
		 * [자바의 정석, 알고리즘, C프로그래밍, 인간관계, 자기계발, 영단어600]
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요: ");
		int num = sc.nextInt();
		sc.nextLine();
		String str[] = new String[num];

		boolean flag = true;

		
		for (int i = 0; i < str.length; i++) {

			System.out.print((i + 1) + "번째 문자열 : ");
			str[i] = sc.nextLine();
		}
			
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char answer = sc.nextLine().charAt(0);

			if (answer == 'Y') {
				
				System.out.println("더 입력하고 싶은 개수 : ");
				int size = sc.nextInt();
				sc.nextLine();

				// 복사할 배열 선언 및 할당.
				String[] newArr = new String[str.length + size];
				
				// 깊은 복사
				System.arraycopy(str, 0, newArr, 0, str.length);
						
				for (int i = str.length; i < newArr.length; i++) {

					System.out.print((i+1) + "번째 문자열 : ");
					newArr[i] = sc.nextLine();
				} 
				
				// 얕은 복사
				str = newArr;
						
				
			} else if (answer == 'N') {
				//System.out.println(str[num]);
				
				System.out.println(Arrays.toString(str));
				break;

			}
		}

	}

}
