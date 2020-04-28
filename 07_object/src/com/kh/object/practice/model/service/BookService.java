package com.kh.object.practice.model.service;

import com.kh.object.practice.model.vo.Book;

public class BookService {

		public void practice() {
			
			Book b1 = new Book();
			
		
			
			System.out.println(b1.selectBook());
			
			
			
			
			Book b2 = new Book("자바의 정석", 30000, 0.2, "남궁성");
			
			System.out.println(b2.selectBook());
			
			
			System.out.println("===================");
			
			
			b1.setTitle("C언어");
			b1.setPrice(30000);
			b1.setDiscountRate(0.1);
			b1.setAuthor("홍길동");
			
			System.out.println("수정된 결과 화면");
			System.out.println(b1.selectBook());
	
			System.out.println("===================");
			
			System.out.println("도서명 = " + b1.getTitle());
			System.out.println("할인된 가격 = " + (int)(b1.getPrice() - (b1.getPrice() * b1.getDiscountRate())) + "원");
			
			System.out.println("도서명 = " + b2.getTitle());
			System.out.println("할인된 가격 = " + (int)(b2.getPrice() - (b2.getPrice() * b2.getDiscountRate())) + "원");
			
			
			
		}
		
		
		
		
}
