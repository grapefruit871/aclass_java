package com.kh.poly.chap01.practice.model.vo;

public class ComicBook extends Book {
	
	private int accessAge;
	
	public ComicBook() {
		super(); // 미작성된 경우 JVM에 의해서 생성자 제일 상단에 컴파일 시 자동 추가됨.
		
	}// 기본 생성자
	
	public ComicBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		
	}

	

	@Override
	public String toString() {
		return "ComicBook [" + super.toString() + ", "+ accessAge + "]";
	}

	/**
	 * @return the accessAge
	 */
	public int getAccessAge() {
		return accessAge;
	}

	/**
	 * @param accessAge the accessAge to set
	 */
	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
	
	
}
