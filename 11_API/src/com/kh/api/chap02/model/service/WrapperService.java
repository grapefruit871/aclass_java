package com.kh.api.chap02.model.service;

public class WrapperService {
	
	/* Wrapper Class
	 * - ���� Ÿ��(�⺻ �ڷ���)�� ��ü�� �����ϴ� Ŭ����
	 * 
	 * - ��? Wrapper Class�� ����ϴ°�?
	 * 1) �⺻ �ڷ������δ� ������ �� ���� �Ӽ�, ����� ����ϱ� ����.
	 * 	ex) �� �ڷ����� �ִ�, �ּҰ�, ����Ʈ ũ��
	 * 		String ("1") <-> int ���� (1)
	 * 
	 * 2) �⺻ �ڷ����� ��¿ �� ���� ��ü�� �ٷ��ߵǴ� ��찡 ����.
	 * 	-- �޼ҵ��� �Ű������� ��ü�� �䱸�� ��
	 *	-- �⺻ �ڷ����� �ƴ� ��ü�� ���� �����ؾ��� ��
	 *	-- ��ü���� �񱳰� �ʿ��� ��
	 * */
	
	public void example() { // �빮�ڿ� Ǯ����!
		/* byte		Byte
		 * short	Short
		 * int		Integer��
		 * long		Long
		 * float	Float
		 * double	Double
		 * char		Character��
		 * boolean	Boolean
		 * */
		
		// Integer Wrapper Ŭ������ �����ϴ� ��� �ʵ� /////////////// Integer�� Ŭ���� << Ŭ������.������ >> => static �̶�� ���� �� �� ���� >>
		System.out.println(Integer.BYTES); // public static final int BYTES = 4 ; final==> ������ �� �� �� �� ����. / static
		System.out.println(Integer.SIZE); // bit ũ�� (32)
		System.out.println(Integer.MAX_VALUE); //�ִ밪
		System.out.println(Integer.MIN_VALUE); //�ּҰ�
		
		// String �ڷ����� �⺻ �ڷ���(int)�� ��ȯ
		String str = "100, 200, 300, 400";
		String[] arr = str.split(", ");
		int sum = 0;
		
		for (int i = 0; i<arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
			// parseXXX : String ������
			// 			 �⺻ �ڷ����� ���¸� ������ ������
			// 			�ش� �ڷ������� ��ȯ. (�Ľ�, parsing)
			// 			 ex) "100" --> 100
		}
		System.out.println("�հ�: "+ sum);
		
		// �⺻ �ڷ��� (int) --> String ��ȯ
		String s1 = Integer.valueOf(123).toString(); // toString --> ��ü�� ������ �ִ� �ʵ尪�� ���ڿ��� ��ȯ�Ͽ���
		String s2 = 123 + ""; // ���ڿ��� �����~ �̰� ���� ����r��~
		
		// Boxing : �⺻ �ڷ����� Wrapper Class ��ü�� ����
		// int�� 427�� Integer ��ü�� ��ȯ(����)
		Integer it1 = new Integer(427);
		Integer it2 = new Integer("427");
		// -> ���� Ŭ���� ��뿡 �ֵ� ����: collection �����̴�.
		// 	--> Collection�� ���� ��ü�� ���� �����ϱ� ������
		// 		�⺻ �ڷ����� ��ü�� ��ȯ�� �ʿ䰡 ����.
		
		// UnBoxing : ���� Ŭ���� --> �⺻ �ڷ���
		int iNum1 = it1.intValue(); // int���� �̾� �� �� ����
		int iNUM2 = (int)it2; // ����Ŭ������ ������ ���� ����ȯ
		
		// (JDK 1.5�� �߰��� ���)
		// Auto Boxing / Auto UnBoxing
		// �ڵ����� �⺻ �ڷ��� <-> ����Ŭ���� ��ü�� ����ȯ
		
		Integer it3 = 1000; // Auto Boxing
		int iNum3 = it3; // Auto UnBoxing
	}
	
}
