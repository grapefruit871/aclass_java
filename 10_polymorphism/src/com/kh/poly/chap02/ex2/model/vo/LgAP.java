package com.kh.poly.chap02.ex2.model.vo;

public class LgAP extends AllinOnePrinter implements Fax {

	@Override
	public void print() {
		System.out.println("프린트잘됨");
		
	}

	@Override
	public void scan() {
		System.out.println("빠르게 스캔");
	}

	@Override
	public void powerOn() {
		System.out.println("매우 잘켜짐");	
	}

	@Override
	public void powerOff() {
		System.out.println("매우 잘꺼짐");
		
	}

	@Override
	public void fax() {
		System.out.println("팩스를 주고 받을 수 있음.");
	}

	
	
	
}
