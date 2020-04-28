package com.kh.objectarray.model.service;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.objectarray.model.vo.Student;

public class PracticeService {

	
	private Scanner sc = new Scanner(System.in);
	
	public void start() {
		
		/*
		 *  // 1) 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
			// 2)while문을 사용하여 학생들의 정보를 계속 입력 받고
			// 한 명씩 추가 될 때마다 카운트함
			// 계속 추가할 것인지 물어보고, ‘y’이면 계속 객체 추가
			// 3) 10명을 입력한 경우 모두 입력하거나, 계속 추가할 것인지 물어볼 때 ‘n’을 입력한 경우
			// 학생 정보 입력을 멈춤
			// 4) 'y' 또는 'n'을 입력하지 않은 경우
			// "잘못 입력하셨습니다. 다시 입력해 주세요" 출력 후
			// 다시 계속 추가할지 여부를 물어봄.
			// 5) 입력된 모든 학생들의 정보 + 평균 점수를 출력*/
		Student st = new Student();
		String name2 = sc.nextLine();
		name2= st.getName();
		
		
		String std[] = new String[10];
		
		
		int i = 1;

		
		while(i<=10) {
				System.out.println("학년 : " + st.getGrade());
				int grade = sc.nextInt();
				grade = st.getGrade();
				sc.nextLine();
				
				System.out.println("반 : " + st.getClassroom());
				int classroom = sc.nextInt();
				sc.nextLine();
				
				System.out.println("이름 : " + st.getName());
				String name = sc.nextLine();
				
				System.out.println("국어점수 : " + st.getKor());
				int kor = sc.nextInt();
				sc.nextLine();
				
				System.out.println("영어점수 : " + st.getEng());
				int eng = sc.nextInt();
				sc.nextLine();
				
				System.out.println("수학점수 : " + st.getMath());
				int math = sc.nextInt();
				sc.nextLine();
				
				System.out.println("계속 추가할 겁니까? (y/n) : ");
				char yn = sc.nextLine().charAt(0);
				sc.nextLine();
				
			if (yn == 'y') { 
				
				i++;
				
				
				
			}else if (yn == 'n') {
				System.out.println(st.selectStudent());
				
				break;
				
				
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요");
			}
	
		} 
		
		
		
		
		
		
		
		
		
		
	}
}
