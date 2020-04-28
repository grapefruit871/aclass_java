package com.kh.api.chap03.model.service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateService {
	public void example1() {
		// java.util.Date Ŭ����
		// Date() �⺻ ������ : ��ü�� ������ ���� ����� ms ������ �ʱ�ȭ
		Date now = new Date(); 
		
		System.out.println("���� �ð�: " + now);
		
		// ��µ� �� "KST" ==> �ѱ� ǥ�ؽ�
		
		// Date(long date)
		Date dt1 = new Date(0L);
		System.out.println("���ؽð� : " + dt1);
		
		// UTC : ���� ����� 
		// -> ������ �������� 1970�� 1�� 1�� 0�� 0�� 0�ʸ� 	
		// 0ms �������� �� + �ѱ��� ���� ���� 9�ð��̾ 9�÷� ����
		
		
		// 86400000 ms = 1��
		Date dt2 = new Date(86400000L);
		System.out.println("dt 2 : " + dt2);
		
		
	}
	public void example2() {
		
		Date now = new Date(); // ���� �ð� ����
		System.out.println(now);
		
		// SimpleDateFormat : Date�� ���ϴ�  �������� ����
		SimpleDateFormat sdf = new SimpleDateFormat("G yyyy��  MM�� dd�� E���� hh:mm:ss");
		String str = sdf.format(now); // now�� ���� ������ ������ ����ϰڴ�.
		System.out.println(str);
	
	}
	
}
