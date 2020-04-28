package com.kh.basic.run;

import com.kh.basic.A_MethodCall;
import com.kh.basic.B_PrintExample;
// import : 다른 클래스를 해당 클래스에서 사용할 수 있게 가져오는 것.
  //설정, 위치 정보 알려줌
public class BasicRun {
	// xxxRun 클래스의 역할 :  자바 애플리케이션을 실행하는 역할
	public static void main(String[] args) {
		// main 메소드의 역할 == 자바 애플리케이션의 단순 실행
		// main 메소드에는 자체적인 기능을 작성하기보단,
		// 수행하고자 하는 기능을 가진 타 클래스를 생성하고,
		// 해당 기능을 호출하는 역할
	
		
		// 다른 클래스가 가진 메소드를 호출하는 방법
		// [호출하려는 메소드가 존재하는 클래스명] [별칭(변수명)] = new [호출하려는 메소드가 존재하는 클래스명]
		/*A_MethodCall amc = new A_MethodCall();
		
		amc.methodA();
		// A_methodCall이 가지고 있는 methodA() 기능(메소드)을 호출한다.
		
		amc.methodB();
		
		amc.methodA();
		
		amc.methodB();
		amc.methodB();
		amc.methodB();*/
		
		B_PrintExample bpe = new B_PrintExample();
		bpe.printValue();
		
		
	}
}
