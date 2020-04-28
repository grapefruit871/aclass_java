package com.kh.inherit.cha01.model.vo;

// Computer 클래스가 Product 클래스를 상속
// 상속 키워드 : extends(확장하다)
// 부모의 멤버 + 자식의 멤버 - > 부모보다 몸집이 확장됨

public class Product  {

	
		// Computer, Cup, Car 클래스에서 공통되었던 부분을 작성함
	
		private String pName;
		private int price;
		
		// 기본 생성자
		public Product() {}

		public Product(String pName, int price) {
			this.pName = pName;
			this.price = price;
			
			}
		
		// 공통된 getter / setter 추출 
		public String getpName() {
			return pName;
		}

		public void setpName(String pName) {
			this.pName = pName;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		public String selectField( ) {
			return pName + " / " + price;
		}
		
		
}
