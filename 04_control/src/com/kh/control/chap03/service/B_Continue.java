package com.kh.control.chap03.service;

public class B_Continue {
	
	//continue
	// - 반복문 내에서만 사용 가능한 예약어
	// - 코드 실행 중 continue를 만나게 되면 
	//   이후 내용을 실행하지 않고 반복문 처음으로 돌아감.
	// - 처음으로 돌아갈 때 증감식을 이를 수행함.
	
	public void example1() { 
		// 1~100사이의 정수 중 4의 배수를 제외하고
		// 나머지 수들의 합을 구하여라(continue)
	
		int sum = 0;
		
		for(int i=1; i<=100 ; i++) {
			
			if(i % 4 == 0)	{ //4의 배수 검출
				continue;
					}
			sum += i;
		}	
			System.out.println("sum : " + sum);
			
	}
	
	public void example2() {
		//  2~9단 구구단 출력
		// 단, 3단, 6단, 9단은 출력하지 않음.
		
		
		for(int i=2; i<=9 ; i++) { //단 지정
			 
			
			if(i % 3 == 0) { //dan이 3의 배수인 경우
			continue;
			}for(int j = 1 ; j <=9 ; j++) { //곱해지는 수 지성
				//System.out.println(i + "X" + j + "=" + (i*j));
				System.out.printf("%2d * %2d = %2d", i, j, i*j);
				
				}
			
			System.out.println(); //줄바꿈
			}
			
		}
		
		
		
	    
	  
}
	
	

