package hw;

import java.util.Scanner;

public class Reservation {
	Scanner sc = new Scanner(System.in);
	private Seat s[]; // ������ ��� �� �¼� ����
	private String seatGrade[] = {"S", "A", "B"}; // �¼� ��޺� �̸�
	
	public Reservation() {
		s  = new Seat[3];
		for(int i=0; i<s.length; i++) {
			s[i] = new Seat();
		}
	}
	
	public void Reserve() {
		System.out.print("�¼����� S(1), A(2), B(3)>>");
		int grade = sc.nextInt();
		System.out.print(seatGrade[grade-1]+">>");
		s[grade-1].Show();
		
		System.out.print("�̸�>>");
		String name = sc.next();
		System.out.print("��ȣ>>");
		int num = sc.nextInt();
		s[grade-1].Set(name, num);
	}
	
	public void Check() {
		for(int i=0; i<s.length; i++ ) {
			System.out.print(seatGrade[i]+">>");
			s[i].Show();
		}
		System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
	}
	
	public void Cancel() {
		System.out.print("�¼� S:1, A:2, B:3>>");
		int grade = sc.nextInt();
		System.out.print(seatGrade[grade-1]+">>");
		s[grade-1].Show();
		
		System.out.print("�̸�>>");
		String name = sc.next();
		
		boolean result = s[grade-1].reSet(name);
		if(result==true)
			System.out.println("<<<��Ҹ� �Ϸ��Ͽ����ϴ�.>>>");
		else
			System.out.println("�������� �ʴ� �����Դϴ�.");
	}
	
	public void Run() {
		int option;
		while(true) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			option = sc.nextInt();
			
			switch(option) {
			case 1:
				Reserve();
				break;
			case 2:
				Check();
				break;
			case 3:
				Cancel();
				break;
			case 4:
				return;
			}
		}
	}
}
