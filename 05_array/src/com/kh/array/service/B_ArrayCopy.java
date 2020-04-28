package com.kh.array.service;

import java.util.Arrays;
import java.util.Scanner;

public class B_ArrayCopy {
	// 얕은 복사 : 참소하는 배열의 시작 주소만을 복사

	// 깊은 복사 : 복사하고자 하는 배열과
	// 동일한 자료형, 크기를 가지는 배열을 만들어
	// 내부 데이터를 똑같이 작성(복사)하는것
	// 복사본을 수정하더라도 원본내용 그대로 !
	public void example1() {
		// 얕은 복사 시 원본데이터 유지 여부 확인

		int origin[] = { 10, 20, 30, 40, 50 };

		// 얕은 복사 진행

		int copyArr[] = origin;
		// 배열 참조형 변수에 저장된 주소값을 복사해옴

		// 데이터 변경 전 원본
		System.out.println(Arrays.toString(origin));
		// Arrays 클래스 : 배열을 편하게 사용하거나 또는 추가적인 기능을 제공하는 클래스
		// Arrays.toString(배열명)
		// : 배열 내의 데이터를 한번에 출력

		// 데이터 변경 전 복사본
		System.out.println(Arrays.toString(copyArr));

		// 복사본의 데이터를 변경

		copyArr[2] = 10000;

		System.out.println("복사본 값 변경 후");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));

		// 배열의 해시코드 출력
		// 해시코드란? 주소값을 해시함수라는걸 이용하여 변경된 모습
		// 해시함수란? 특정 문자열을 정해진 길이의 형태로 변형
		System.out.println("origin의 hashCode()" + origin.hashCode());
		System.out.println("CoppyArr의 hashCode()" + copyArr.hashCode());
	}

	public void example2() {
		// for문을 이용한 깊은 복사 원본 데이터 유지 확인
		int[] origin = { 1, 2, 3, 4, 5 };
		// 깊은 복사를 하려면 같은 자료형, 같은 크기 이상의 배열을
		// 선언 및 할당해야됨.
		int[] copyArr = new int[origin.length];

		for (int i = 0; i < copyArr.length; i++) {
			copyArr[i] = origin[i];

		}
		System.out.println("변경 전 :");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));

		// 복사본 데이터 변경
		copyArr[2] = 9999;

		System.out.println("변경 후 :");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));

		// 두 배열의 해시코드 출력(다른지 화깅ㄴ)
		System.out.println("origin의 hashCode() :" + origin.hashCode());
		System.out.println("copyArr의 hashCode() : " + copyArr.hashCode());

	}

	public void example3() {
		// System.arraycopy()를 이용한 깊은 복사 + 원본데이터 유지확인

		int[] origin = { 1, 2, 3, 4, 5 };

		int[] copyArr = new int[origin.length];

		// System.arraycopy(원본배열명, 복사시작 인덱스 지정, 복사본 배열명,복사본에서 복사될 인덱스 지정, 복사 길이);
		System.arraycopy(origin, 0, copyArr, 0, origin.length);

		System.out.println("변경 전 :");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));

		// 복사본 데이터 변경
		copyArr[2] = 9999;

		System.out.println("변경 후 :");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));

		// 두 배열의 해시코드 출력(다른지 화깅ㄴ)
		System.out.println("origin의 hashCode() :" + origin.hashCode());
		System.out.println("copyArr의 hashCode() : " + copyArr.hashCode());
	}

	public void example4() {
		// 처음에 배열 크기를 입력하고
		// 해당 크기만큼의 입력을 진행하여
		// 각 인텍스에 값을 초기화함.

		// 입력 완료 시 추가적으로 더 입력할 내용이 있는지 물어보고
		// 있을 경우, 추가로 필요한 배열 크기를 입력 받아
		// 다시 늘어 난 배열크기만큼 입력을 받음.

		// 추가적으로 입력할 내용이 없다면.
		// 배열에 저장된 모든 내용을 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("배열 크기 입력 : ");
		int size = sc.nextInt();
		sc.nextLine();

		int[] arr = new int[size];

		int i = 0; // 초기식
		while (true) {
			System.out.println(i + "번째 인덱스 입력 : ");
			arr[i] = sc.nextInt();
			sc.nextLine();

			i++;

			// 증가한 i값이 현재 배열 길이와 같다면
			if (i == arr.length) {
				System.out.println("추가로 입력 하시겠습니까?(아무거나/n) : ");
				char ch = sc.nextLine().charAt(0);

				if (ch == 'n') {
					break; // 'n' 입력시 반복문 종료
				} else {
					System.out.println("추가할 배열 길이 : ");
					size += sc.nextInt();
					sc.nextLine();

					// 깊은 복사용 배열 선언 및 할당.
					int[] copyArr = new int[size];

					// 깊은 복사 진행
					System.arraycopy(arr, 0, copyArr, 0, arr.length);

					// arr변수가 깊은 복사된 배열 주소를 참조 (얕은 복사)
					arr = copyArr;
				}
			}
		}
		// arr에 저장된 내용 모두 출력
		for (int j = 0; j < arr.length; j++) {
			System.out.println("arr[" + j + "] =" + arr[j]);
		}

	}
}
