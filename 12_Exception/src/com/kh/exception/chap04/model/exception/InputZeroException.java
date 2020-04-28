package com.kh.exception.chap04.model.exception;

public class InputZeroException extends Exception{
	//사용자 정의 예외 생성 방법
	// --> Exception 또는 그 후손 클래스를 상속받으면 됨
	
	// 만약 CheckdException으로 만들 경우
	// 보통 Exception 상속받음
	
	// 만약 UnChecked Exception으로 만들 경우
	// RuntimeException을 상속 받음.
	
	public InputZeroException() {
		super();
	}
	
	public InputZeroException(String msg) {
		super(msg);
	}
}
