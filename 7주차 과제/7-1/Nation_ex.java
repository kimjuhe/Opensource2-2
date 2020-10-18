package hw;
import java.util.Scanner;
import java.util.Vector;
public class Nation_ex {
	private Vector<Nation> nat = new Vector<Nation>();
	private Scanner scanner = new Scanner(System.in);
	
	public Nation_ex() {
		//nat초기화
		nat.add(new Nation("독일", "베를린"));
		nat.add(new Nation("멕시코", "멕시코시티"));
		nat.add(new Nation("터키", "앙카라"));
		nat.add(new Nation("영국", "런던"));
		nat.add(new Nation("중국", "베이징"));
		nat.add(new Nation("일본", "도쿄"));
		nat.add(new Nation("말레이시아", "쿠알라룸푸르"));
		nat.add(new Nation("대만", "타이베이"));
		nat.add(new Nation("그리스", "아테네"));
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
	private boolean contains(String country) {
		for(int i=0; i<nat.size(); i++) {
			if(nat.get(i).country.equals(country)) { //이미 입력한 나라일 경우
				return true;
			}
		}
		
		return false;
	}
	private void input() {
		int n = nat.size();
		System.out.println("현재 " + n + "개 나라와 수도가 입력되어 있습니다.");
		n++;
		while(true) {
			System.out.print("나라와 수도 입력" + n + ">> ");
			String country = scanner.next(); //나라 입력
			if(country.equals("그만")) {
				break;
			}
			String capital = scanner.next(); //수도 입력
			if(contains(country)) { //이비 있는 나라일 경우
				System.out.println(country + "는 이미 있습니다!");
				continue;
			}
				
			nat.add(new Nation(country, capital));
			n++;
		}
	}
	private void quiz() {
		while(true) {.
			int index = (int)(Math.random()*nat.size()); //나라를 랜덤으로 하나 선택
			
			Nation nation = nat.get(index);
			String question = nation.country;
			String answer = nation.capital;
			
			System.out.print(question + "의 수도는? "); //문제 출력
			
			String useranswer = scanner.next(); //정답 입력
			if(useranswer.equals("그만")) { //멈추길 원할 경우
				break;
			}
			if(useranswer.equals(answer)) //정답일 경우와 틀릴 경우
				System.out.println("정답!!");
			else
				System.out.println("아닙니다!!");				
		}	
		
	}

	public static void main(String[] args) {
		Nation_ex game = new Nation_ex();
		game.run();
	}
}