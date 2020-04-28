package com.kh.poly.chap01.practice.view;

import java.util.Scanner;

import com.kh.poly.chap01.practice.model.service.LibraryService;
import com.kh.poly.chap01.practice.model.vo.Book;
import com.kh.poly.chap01.practice.model.vo.Member;

public class LibraryMenu {
	
	
	
	private LibraryService service  = new LibraryService();
	
	private Scanner sc = new Scanner(System.in);
	
	
	
			
	public void mainMenu() { 
		
		System.out.print("이름 : ");
		String name = sc.next(); // 입력되는 다음 한 단어 ( 공백문자 이전까지 읽어들임)
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		System.out.println("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		
		//sc.next()는 버퍼에 남아있는 개행문자를 무시하고 다음 단어를 읽어 들임
		
		
		Member m = new Member(name, age, gender);
		
		service.insertMember(m);
		
		
		int menu = 0;
		while(true) {
			System.out.println(" =====메뉴 ===== \n"
					            + "1. 마이페이지 \n"
								+ "2. 도서 전체 조회 \n"
								+ "3. 도서 검색 \n"
								+ "4. 도서 대여하기 \n"
								+ "9. 프로그램 종료하기 \n"
								+ "메뉴 번호 :  \n");
								
			menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 :  System.out.println(service.myInfo()); break;
			case 2 : selectAll(); break;
			case 3 : searchBook(); break;
			case 4 : rentBook(); break;
			case 9 : System.out.println("시스템을 종료합니다."); return;
			// return  : 호출한 메소드 반환(돌아가라)
			// void 메소드는 "반환값" 은 없다!
			// JVM이 컴파일 시 void 메소드 제일 마지막에 return을 자동 추가
			
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
			}
		}
	}
																	
	public void selectAll() {
										
		Book[] bList = service.selectAll();
		
		for(int i =0; i<bList.length ; i++) {
			System.out.println(i + "번 도서 : " + bList[i].toString());
			// 참조 변수를 출력(print)할 때는 자동으로 .toString()이 JVM에 의해서 추가됨
		}
		
		
	}
	public void searchBook() {
			System.out.println("검색할 제목 키워드 : ");
			String keyword = sc.nextLine();
			
			
			
			Book[] searchList = service.searchBook(keyword);
			
			for(int i =0; i<searchList.length ; i++) {
				if(searchList[i] == null ) {
					break;
				}
				
				System.out.println(searchList[i]);
			
			}
			
			

	}
	public void rentBook() {
		selectAll();
			
		System.out.println("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		int result = service.rentBook(index);
		
		if(result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
			
			
		}else if(result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		}else {
			System.out.println("성공적으로 대여되었습니다." 
								+ "요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
		}
								
	}
																	
			
			
}
