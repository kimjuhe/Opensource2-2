package hw;

import java.util.Scanner;

public class Reservation {
	Scanner sc = new Scanner(System.in);
	private Seat s[]; // 세개의 등급 당 좌석 생성
	private String seatGrade[] = {"S", "A", "B"}; // 좌석 등급별 이름
	
	public Reservation() {
		s  = new Seat[3];
		for(int i=0; i<s.length; i++) {
			s[i] = new Seat();
		}
	}
	
	public void Reserve() {
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		int grade = sc.nextInt();
		System.out.print(seatGrade[grade-1]+">>");
		s[grade-1].Show();
		
		System.out.print("이름>>");
		String name = sc.next();
		System.out.print("번호>>");
		int num = sc.nextInt();
		s[grade-1].Set(name, num);
	}
	
	public void Check() {
		for(int i=0; i<s.length; i++ ) {
			System.out.print(seatGrade[i]+">>");
			s[i].Show();
		}
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	
	public void Cancel() {
		System.out.print("좌석 S:1, A:2, B:3>>");
		int grade = sc.nextInt();
		System.out.print(seatGrade[grade-1]+">>");
		s[grade-1].Show();
		
		System.out.print("이름>>");
		String name = sc.next();
		
		boolean result = s[grade-1].reSet(name);
		if(result==true)
			System.out.println("<<<취소를 완료하였습니다.>>>");
		else
			System.out.println("존재하지 않는 정보입니다.");
	}
	
	public void Run() {
		int option;
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
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
