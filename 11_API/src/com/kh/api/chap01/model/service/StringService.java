package com.kh.api.chap01.model.service;

import java.util.Scanner;

public class StringService {
	// String Ŭ����
	// - immutable(�Һ�) ��ü�� �ѹ� ������ ���ڿ��� ���� �Ұ���
	// 		--> ���� �� ���ο� ���ڿ� ��ü�� �����ǰ� �ش� �ּҸ� ��ȯ��
	
	public void example1() {
		
		// 1) String �� ������ �ּҰ� �ٲ���� Ȯ��
		
		String s1 = "ABC";
		// System.out.println(s1.hashCode());
		// String�� hashCode()�� ���ڿ��� �̿��Ͽ� ���� ���ϴ� ���̱� ������
		// �ּҰ� ������ Ȯ���ϴµ��� ������.
		// --> System.identityHashcode() ���
		//		--> ��ü�� ���� ���� �ּҸ� �̿��Ͽ� hashCode�� ����� �޼ҵ�.
		
		System.out.println("������ s1: " +System.identityHashCode(s1));
		
		s1 = "ABCD";// s1 ����
			
		System.out.println("������ s1: " +System.identityHashCode(s1));
		
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str1 == str2 : " + (str1 == str2));
		
		// String Literal (���ͷ�)�� String �� ���� ��
		// ���� ���ڿ��� ��� ���� �ּҸ� ��ȯ�Ѵ�.
		// (+String Pool) <- ���ͷ��� �� �͵��� ����Ǵ� ��.
		
		// String�� Ŭ������ new�� ���� �� ����!
		String str3 = new String("Hello"); 
		// �̰��� �� ��ü ���� ���� �ʱ�ȭ.! ���ͷ��� ǥ���� ���� �ƴ�
		System.out.println("str3 = " + str3);
		System.out.println("str1 == str2 : " + (str1 == str3));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("str4 �Է�: ");
		String str4 = sc.nextLine();
		System.out.println("str1 == str4 : " + (str1 == str4));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str4)); // ���� �ٸ� �ּ� str3 �� str4�� false
		
		System.out.println("String ����񱳰� �ʿ��ϸ� equals ����� ��!");
		System.out.println("String�� �Һ��̴�.");
		
	}	
	
	public void example2() {
		// StringBuffer
		// - ���ڿ� ������ ������ mutable(����) ��ü.
		
		StringBuffer sb = new StringBuffer();
		
		// StringBuffer ��ü�� �⺻ �����ڷ� ���� ��
		// �⺻ ����ũ�� 16�� �Ҵ���.
		
		System.out.println("sb.capacity() : " + sb.capacity()); // capacity: ũ��
		System.out.println("sb.hashcode() : " + sb.hashCode()); // java.lang.hashcode
		// Stringbuffer Ŭ������ hashCode()�� �������̵� ���� ����.
		// Object.hashCode() : ��ü �ּҸ� �̿��Ͽ� �ؽ��ڵ� ����.
		
		// append() : ���� ���ڿ� �ڿ� �߰�
		sb.append("java api");
		
		System.out.println("�߰� �� sb.capacity() : " + sb.capacity()); 
		System.out.println("�߰� �� sb.hashcode() : " + sb.hashCode());
		
		sb.append("1234567890"); // ���� �뷮�� 16�� �ʰ� ( ���� 18)
		
		System.out.println("�߰�2 �� sb.capacity() : " + sb.capacity()); 
		System.out.println("�߰�2 �� sb.hashcode() : " + sb.hashCode());
		// hashcode�� �ּҴ� ������ ����. �뷮�� �þ���. ���� �뷮�� +1 x2 ���� 17�� 2���� 34ũ��
		// ���� ������ �ִ� ��(�ּ�) �ڿ� ũ�� �߰��� ��.
		
		System.out.println("sb : " + sb /*.toString()*/); // �������� sb �ڿ� JVM�� ���ؼ� �ڵ����� toString�� ����
		
		// StringBuffer�� String���� ��ȯ�ϴ� ���.
		String str = sb.toString(); // String������ �ʵ带 ����ض�.
	}
	
	public void example3() {
		// String.split(������)
		// --> ���ڿ��� �ش� �����ڸ� �������� �ɰ��� String[] ���·� ��ȯ
		
		String str = "���, ����, ����, ������, ����, ���, ������, �ڵ�";
		
		// ,(����)�� �����ڷ� �Ͽ� ����
		String[] arr = str.split(", ");
		for(int i= 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	
		
	
}