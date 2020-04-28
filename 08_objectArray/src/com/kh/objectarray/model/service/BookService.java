package com.kh.objectarray.model.service;

import java.util.Scanner;

import com.kh.objectarray.model.vo.Book;

public class BookService {

	
	
		// Book 객체 5개를 매개변수 있는 생성자를 이용하여 생성 후 
		// 책 제목을 입력받아
		// 해당 책이 있는지 검색하여
		// 있으면 Book 객체의 필드정보 출력
		// 없으면 "해당하는  책이 없습니다." 출력
		
		private Scanner sc = new Scanner(System.in);
		
		public void searchBookV1() {
			//책 5권 객체 생성
			Book book1 = new Book("김경수바보", 30000, 0.2, "서나정");
			Book book2 = new Book("C언어의 정석", 50000, 0.1, "김철수");
			Book book3 = new Book("와 자바 재밌다", 100000, 0.5, "백동현");
			Book book4 = new Book("어린 왕자", 10000, 0.1, "생택쥐베리");
			Book book5 = new Book("해리포터", 12000, 0.1, "조앤k.롤링");
			
			// 검색할 책 제목 입력받기
			System.out.print("검색할 책 제목을 입력하세요 : ");
			String title = sc.nextLine();
			
			if(book1.getTitle().equals(title)) {
				//book1의 제목과 입력받은 제목이 같을 경우+
				System.out.println(book1.selectBook());
				
			}else if(book2.getTitle().equals(title)) {
				System.out.println(book2.selectBook());
			}else if(book3.getTitle().contentEquals(title)) {
				System.out.println(book3.selectBook());
				
			}else if(book4.getTitle().equals(title)) {
				System.out.println(book4.selectBook());
			}else if(book5.getTitle().equals(title)) {
				System.out.println(book5.selectBook());
			
		}else {
			System.out.println("해당하는 책이 없습니다.");
					}
	}
	
		//객체 배열을 이용하여 책 검색하기
		public void searchBookV2() {
			
		/*	Book[] books = new Book[5];
			
			books[0] = new Book("자바의 정석", 30000, 0.2, "남궁 성");
			books[1] = new Book("C언어의 정석", 50000, 0.1, "김철수");
			books[2] = new Book("와 자바 재밌다", 100000, 0.5, "백동현");
			books[3] = new Book("어린 왕자", 10000, 0.1, "생택쥐베리");
			books[4] = new Book("해리포터", 12000, 0.1, "조앤k.롤링");
			*/
			
			Book[] books = {
					new Book("자바의 정성", 30000, 0.2, "남궁 성"),
					new Book("C언어의 정석", 50000, 0.1, "김철수"),
					new Book("와 자바 재밌다", 100000, 0.5, "백동현"),
					new Book("어린 왕자", 10000, 0.1, "생택쥐베리"),
					new Book("해리포터", 12000, 0.1, "조앤k.롤링")
			        };
			//int[] arr = {1,2,3,4,5};
		// 책 제모 입력 받기
			System.out.print("검색할 책 제목을 입력하세요 : ");
			String title = sc.nextLine();
			
			boolean flag = true;
			
			for(int i = 0; i <books.length ; i++) {
				if(books[i].getTitle().equals(title)) {
					//books의 i번째 인덱스 요소의 Title이
					//입력받은 값과같다면?
				System.out.println(books[i].selectBook());
				flag = false; //검색이 된 경우 flag를 false로 바꿈
				break;
				}
			}//for end 
			
			if(flag) {
				System.out.println("해당하는 책이 없습니다.");
			}
		
		}
		
}
