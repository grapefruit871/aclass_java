package com.kh.objectarray.model.vo;

/*
 * 최대 10명의 학생에 대한 정보를 기록할 수 있는 프로그램이다.
입력된 모든 학생의 학년, 반, 이름, 국어, 수학,영어 점수를 기록하고 평균을 출력 하시오.
해당 구현 클래스 다이어그램과 클래스 구조를 참고하여 프로젝트를 완성 하시오.*/


public class Student {
/*	
	- grade : int  // 학년
	- classroom : int // 반
	- name : String  // 이름
	- kor : int  // 국어점수
	- eng : int  // 영어점수
	- math : int  // 수학점수
*/
	
	private int grade;
	private int classroom;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	/*
	 * + Student()
+ Student(grade:int, classroom:int, name:String,
kor:int, eng:int, math:int)
+ selectStudent() : String*/
	
	
	public Student() {}

	public Student(int grade, int classroom, String name, int kor, int eng, int math) {
		super();
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
	public String selectStudent() {
		return grade + "학년" + classroom + "반" + name + " >> " + "국어 : " + kor + "," + " 영어 : " + "," + "수학 : " + math + "," + " 평균 : " + (kor+eng+math / 3);
	}
	
	/*
	 * 3학년 5반 홍길동 >> 국어 : 100, 영어 : 50, 수학 :70, 평균 : 73
2학년 3반 김개똥 >> 국어 : 30, 영어 : 50, 수학 :80, 평균 : 53*/
	
	
	
	
	
	
	
	
	
	
	
}
