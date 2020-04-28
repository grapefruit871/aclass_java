package com.kh.control.chap01.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	
	
	public void practice1() {
		/*
		�Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ ��OO�޴��Դϴ١���,
		���� ��ȣ�� ������ �����α׷��� ����˴ϴ�.���� ����ϼ���.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("9. ����");
		
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int menu = sc.nextInt();
		
		// 1. if-else if�� �̿��ϴ� ���
		/*
		if(menu == 1) {
			System.out.println("�Է� �޴��Դϴ�.");
		}else if(menu == 2) {
			System.out.println("���� �޴��Դϴ�.");
		}else if(menu == 3) {
			System.out.println("��ȸ �޴��Դϴ�.");
		}else if(menu == 4) {
			System.out.println("���� �޴��Դϴ�.");
		}else if(menu == 9) {
			System.out.println("���α׷��� ����˴ϴ�.");
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		*/
		
		// 2. switch�� �̿��ϴ� ���
		/*
		switch(menu) {
		case 1 : System.out.println("�Է� �޴��Դϴ�."); break;
		case 2 : System.out.println("���� �޴��Դϴ�."); break;
		case 3 : System.out.println("��ȸ �޴��Դϴ�."); break;
		case 4 : System.out.println("���� �޴��Դϴ�."); break;
		case 9 : System.out.println("���α׷��� ����˴ϴ�."); break;
		default : System.out.println("�߸��Է��ϼ̽��ϴ�."); break;
		}
		*/
		
		
		// 3. switch�� �̿��� �� String ���� �̿��ϴ� ���
		String str;
		
		switch(menu) {
		case 1 : str = "�Է�"; break;
		case 2 : str = "����"; break;
		case 3 : str = "��ȸ"; break;
		case 4 : str = "����"; break;
		case 9 : System.out.println("���α׷��� ����˴ϴ�."); return;
		default : System.out.println("�߸��Է��ϼ̽��ϴ�."); return;
		}
		
		System.out.println(str + " �޴��Դϴ�.");
		
	}
	
	
	public void practice2() {
		/*
		Ű����� ������ �Է� ���� ������ ����̸鼭 ¦���� ���� ��¦���١��� ����ϰ�
		¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
		����� �ƴϸ� ������� �Է����ּ���.���� ����ϼ���.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("¦����.");
			}else {
				System.out.println("Ȧ����.");
			}
		}else {
			System.out.println("����� �Է����ּ���.");
		}
	}
	
	
	
	public void practice3() {
		/*
		����, ����, ���� �� ������ ������ Ű����� �Է� �ް� �հ�� ����� ����ϰ�
		�հ�� ����� �̿��Ͽ� �հ� / ���հ� ó���ϴ� ����� �����ϼ���.
		(�հ� ���� : �� ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� ���)
		�հ� ���� ��� ���� �� ������ �հ�, ���, �������մϴ�, �հ��Դϴ�!���� ����ϰ�
		���հ��� ��쿡�� �����հ��Դϴ�.���� ����ϼ���.
	 	*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int kor = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int math = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng; // �հ�
		double avg = sum / 3.0; // ���
		
		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("���� : " + kor);
			System.out.println("���� : " + math);
			System.out.println("���� : " + eng);
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + avg);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
		
	}
	
	
	public void practice4() {
		// ���� �ڷ�(7page)���� if������ �Ǿ��ִ� ��, ����, ����, �ܿ� ������ switch������ �ٲ㼭 ����ϼ���.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 12 ������ ���� �Է� : ");
		int num = sc.nextInt();
		
		String season;
		
		switch(num) {
		case 12:
		case 1:
		case 2:
				season = "�ܿ�";
				break;
		case 3:
		case 4:
		case 5: 
				season = "��";
				break;
		case 6:
		case 7:
		case 8:
				season = "����";
				break;
		case 9:
		case 10:
		case 11:
				season = "����";
				break;
		default : 
				season = "�߸� �Էµ� ��";
				break;
		}
		
		System.out.println(num + "���� " + season + "�Դϴ�.");
	}
	
	
	public void practice5() {
		/* �ǽ����� 5
		���̵�, ��й�ȣ�� ���صΰ� �α��� ����� �ۼ��ϼ���.
		�α��� ���� �� ���α��� ������, 
		���̵� Ʋ���� �� �����̵� Ʋ�Ƚ��ϴ�.��,
		��й�ȣ�� Ʋ���� �� ����й�ȣ�� Ʋ�Ƚ��ϴ�.���� ����ϼ���.
		*/
		
		Scanner sc = new Scanner(System.in);
		String id = "myId";
		String password = "myPassword12";
		
		System.out.print("���̵� : ");
		String inputId = sc.nextLine();
		
		System.out.print("��й�ȣ : ");
		String inputPassword = sc.nextLine();
		
		// * Ŭ������ �ڷ��� -> �׷��� String�� �ڷ���
		// String.equals()
		// String �ڷ����� ������ �ִ� ��¥ ������ �������� ���ϴ� �޼ҵ�
		// ����� true �Ǵ� false ��ȯ
		
		if(id.equals(inputId)) {
			
			if(password.equals(inputPassword)) {
				System.out.println("�α��� ����");
			}else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
			
		}else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
	}
	
	
	public void practice6() {
		/*
		����ڿ��� ������, ȸ��, ��ȸ�� �� �ϳ��� �Է� �޾� �� ����� ���� �� �ִ� ������ ����ϼ���.
		��, �����ڴ� ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ�
		ȸ���� �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ�
		��ȸ���� �Խñ� ��ȸ�� �����մϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		
		switch(sc.nextLine()) {
		case "������" : System.out.println("ȸ������, �Խñ� ����,");
		case "ȸ��"  : System.out.println("�Խñ� �ۼ�, ��� �ۼ�, ");
		case "��ȸ��" : System.out.println("�Խñ� ��ȸ"); break; // ���⼭ break�ؾ� default������ �Ѿ�� �ʴ´�.
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); break;
		}
	}
	
	
	
	public void practice7() {
		/*
		Ű, �����Ը� double�� �Է� �ް� BMI������ ����Ͽ� ��� ����� ���� 
		��ü��/����ü��/��ü��/���� ����ϼ���.
		BMI = ������ / (Ű(m) * Ű(m))
		BMI�� 18.5�̸��� ��� ��ü��  /  18.5�̻� 23�̸��� ��� ����ü��
		BMI�� 23�̻� 25�̸��� ��� ��ü��  /  25�̻� 30�̸��� ��� ��
		BMI�� 30�̻��� ��� �� ��
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է����ּ��� : ");
		double height = sc.nextDouble();
		
		System.out.print("������(kg)�� �Է����ּ��� : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.println("BMI ���� : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("��ü��");
		}else if(bmi < 23) {
			System.out.println("����ü��");
		}else if(bmi < 25) {
			System.out.println("��ü��");
		}else {
			System.out.println("��");
		}
	}
	
	
	public void practice8() {
		/*
		Ű����� �� ���� ������ ���� ��ȣ�� �Է� �޾� ���� ��ȣ�� ���� ���� ����� ����ϼ���.
		(��, �� ���� ���� ��� ����� ���� �۵��ϸ� ���� ���� ��ȣ�� �Է� ���� �� 
		���߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.�� ���)
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		char ch = sc.nextLine().charAt(0);
		
		
		double result=0;
		
		if(num1 > 0 && num2 > 0) {
			
			switch(ch) {
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '*': result = num1 * num2; break;
			case '/': result = (double)num1 / num2; break;
			case '%': result = num1 % num2; break;
			default: System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�."); return;
			}
			
			System.out.printf("%d %s %d = %f", num1, ch, num2, result);
		}else {
			System.out.println("����� �ƴ� ���� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�."); 
		}
		

	}
	
	public void practice9() {
		/*
		�߰����, �⸻���, ��������, �⼮ȸ���� �Է��ϰ� Pass �Ǵ� Fail�� ����ϼ���.
		�� ������ �߰���� 20%, �⸻��� 30%, ���� 30%, �⼮ 20%�� �̷���� �ְ�
		�� ��, �⼮ ������ �⼮ ȸ���� �� ���� ȸ�� 20ȸ �߿��� �⼮�� ���� ���� ������ ����ϼ���. 
		70�� �̻��� ��� Pass, 70�� �̸��̰ų� ��ü ���ǿ� 30% �̻� �Ἦ �� Fail�� ����ϼ���.
		*/

		Scanner sc = new Scanner(System.in);

		System.out.print("�߰� ��� ���� : ");
		int midTerm = sc.nextInt();

		System.out.print("�⸻ ��� ���� : ");
		int finalTerm = sc.nextInt();

		System.out.print("����  ���� : ");
		int homework = sc.nextInt();

		System.out.print("�⼮ ȸ�� : ");
		int attendance = sc.nextInt();
		
		double m = midTerm * 0.2;
		double f = finalTerm * 0.3;
		double hw = homework * 0.3;
		double at = attendance;
		
		double sum = m + f + hw + at;
		
		System.out.println("===========���==========");
		if(at >= 20 * 0.7) {
			System.out.println("�߰� ��� ����(20) : " + m);
			System.out.println("�⸻ ��� ����(30) : " + f);
			System.out.println("���� ����       (30) : " + hw);
			System.out.println("�⼮ ����       (20) : " + at);
			
			System.out.println("���� : " + sum);
			
			if(sum >= 70) {
				System.out.println("PASS");
			}else {
				System.out.println("FAIL [���� �̴�] (���� " + sum + ")");
			}
		}else {
			System.out.println("FAIL [�⼮ Ƚ�� ����] (" + attendance + "/20)");
		}
	}
	

}
