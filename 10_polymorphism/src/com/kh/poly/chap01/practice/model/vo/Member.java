package com.kh.poly.chap01.practice.model.vo;

public class Member {
		private String name;
		private int age;
		private char gender;
		private int couponCount; //jvm에 의해서 기본값 출력 (0)    //캡슐화 외부로부터 직접접근 차단  정보 은닉효과
		
		public Member() {}
		public Member(String name, int age,char gender) {
			this.name = name;
			this.age = age;
			this.gender = gender;
		}
	//현재 객체의 시작주소를 알리는 참조변수 = this
	// 부모부분의 시작주소를 알리는 참조변수 =super
 	//this() = 현재 생성자에서 다른 생성자를 만드러내는 
	//상속 = 일반화관계
	//extends = 부모꺼도 내꺼 자식꺼도 내꺼 인터페이스끼리도 
	// Interface --> class  implements	
	//getter /setter
		
		
		public String getName () {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the age
		 */
		public int getAge() {
			return age;
		}
		/**
		 * @param age the age to set
		 */
		public void setAge(int age) {
			this.age = age;
		}
		/**
		 * @return the gender
		 */
		public char getGender() {
			return gender;
		}
		/**
		 * @param gender the gender to set
		 */
		public void setGender(char gender) {
			this.gender = gender;
		}
		/**
		 * @return the couponCount
		 */
		public int getCouponCount() {
			return couponCount;
		}
		/**
		 * @param couponCount the couponCount to set
		 */
		public void setCouponCount(int couponCount) {
			this.couponCount = couponCount;
		}
		@Override // 컴파일러에게 알려주는 용도
		public String toString() {
			return "Member [name=" + name + ", age=" + age + ", gender=" + gender + ", couponCount=" + couponCount
					+ "]";
		}
	
	
	
}
