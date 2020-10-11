package hw;

import java.util.Scanner;

public class Person_ex {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1번째 선수 이름>>");
		String name = scanner.next();
		
		Person person1 = new Person(name);
		System.out.print("2번째 선수 이름>>");
		name =scanner.next();
		
		Person person2 = new Person(name);
		String buffer = scanner.nextLine();
		while(true) {
			System.out.print("["+person1.name+"]:<Enter>");
			buffer = scanner.nextLine();
			if(person1.game()) {
				System.out.println(person1.name+"님이 이겼습니다!");
				break;
			}
			System.out.println("아쉽군요!");
			
			System.out.print("["+person2.name+"]:<Enter>");
			buffer = scanner.nextLine();
			if(person2.game()) {
				System.out.println(person2.name+"님이 이겼습니다!");
				break;
			}
			System.out.println("아쉽군요!");
		}
		scanner.close();
	}
}