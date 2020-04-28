package com.kh.poly.chap01.practice.model.vo;

public class CookBook extends Book {
	
	private boolean coupon;
	
	public CookBook() {
		
	}
	
	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
	}

	/**
	 * @return the coupon
	 */
	public boolean isCoupon() {
		return coupon;
	}

	/**
	 * @param coupon the coupon to set
	 */
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return "CookBook [" + super.toString() + "," + coupon + "]";
	}
	
	
	
}
