package hw;

import java.util.Scanner;

public class Person_ex {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1��° ���� �̸�>>");
		String name = scanner.next();
		
		Person person1 = new Person(name);
		System.out.print("2��° ���� �̸�>>");
		name =scanner.next();
		
		Person person2 = new Person(name);
		String buffer = scanner.nextLine();
		while(true) {
			System.out.print("["+person1.name+"]:<Enter>");
			buffer = scanner.nextLine();
			if(person1.game()) {
				System.out.println(person1.name+"���� �̰���ϴ�!");
				break;
			}
			System.out.println("�ƽ�����!");
			
			System.out.print("["+person2.name+"]:<Enter>");
			buffer = scanner.nextLine();
			if(person2.game()) {
				System.out.println(person2.name+"���� �̰���ϴ�!");
				break;
			}
			System.out.println("�ƽ�����!");
		}
		scanner.close();
	}
}