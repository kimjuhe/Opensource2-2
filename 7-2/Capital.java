package hw;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Capital {
	private HashMap<String, String> nat = new HashMap<String, String>();
	private Scanner scanner = new Scanner(System.in);
	
	public Capital() { //nat 초기화
		nat.put("독일", "베를린");
		nat.put("멕시코", "멕시코시티");
		nat.put("터키", "앙카라");
		nat.put("영국", "런던");
		nat.put("중국", "베이징");
		nat.put("일본", "도쿄");
		nat.put("말레이시아", "쿠알라룸푸르");
		nat.put("대만", "타이베이");
		nat.put("그리스", "아테네");
	}
	
	public void run() {
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		while(true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			int menu = scanner.nextInt();
			switch(menu) {
				case 1: 
					input(); break;
				case 2: 
					quiz(); break;
				case 3: 
					System.out.println("게임을 종료합니다."); return;
				default: 
					System.out.println("잘못된 입력입니다.");
			}
		}
		
	}

	private void input() {
		int n = nat.size();
		System.out.println("현재 " + n + "개 나라와 수도가 입력되어 있습니다.");
		n++;
		while(true) {
			System.out.print("나라와 수도 입력" + n + ">> ");
			String country = scanner.next(); // 나라를 입력받음
			if(country.equals("그만")) {
				break;
			}
			String capital = scanner.next(); // 수도를 입력받음
			if(nat.containsKey(country)) { 
				System.out.println(country + "는 이미 있습니다!");
				continue;
			}
				
			nat.put(country, capital);
			n++;
		}
	}
	private void quiz() {
		Set<String> keys = nat.keySet();
		Object [] array = (keys.toArray());
		while(true) {
			int index = (int)(Math.random()*nat.size()); //나라중에 하나를 랜덤으로 결정
			
			String question = (String)array[index];
			String answer = nat.get(question);
			
			System.out.print(question + "의 수도는? "); //랜덤으로 출력
			
			String useranswer = scanner.next(); //사용자가 정답 입력
			if(useranswer.equals("그만")) { //그만할 경우
				break;
			}
			if(useranswer.equals(answer)) //정답인지 아닌지 판별
				System.out.println("정답!!");
			else
				System.out.println("아닙니다!!");				
		}	
		
	}

	public static void main(String[] args) {
		Capital game = new Capital();
		game.run();
	}
}
