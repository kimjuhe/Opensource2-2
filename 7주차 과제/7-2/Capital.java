package hw;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Capital {
	private HashMap<String, String> nat = new HashMap<String, String>();
	private Scanner scanner = new Scanner(System.in);
	
	public Capital() { //nat �ʱ�ȭ
		nat.put("����", "������");
		nat.put("�߽���", "�߽��ڽ�Ƽ");
		nat.put("��Ű", "��ī��");
		nat.put("����", "����");
		nat.put("�߱�", "����¡");
		nat.put("�Ϻ�", "����");
		nat.put("�����̽þ�", "��˶��Ǫ��");
		nat.put("�븸", "Ÿ�̺���");
		nat.put("�׸���", "���׳�");
	}
	
	public void run() {
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		while(true) {
			System.out.print("�Է�:1, ����:2, ����:3>> ");
			int menu = scanner.nextInt();
			switch(menu) {
				case 1: 
					input(); break;
				case 2: 
					quiz(); break;
				case 3: 
					System.out.println("������ �����մϴ�."); return;
				default: 
					System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
		
	}

	private void input() {
		int n = nat.size();
		System.out.println("���� " + n + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
		n++;
		while(true) {
			System.out.print("����� ���� �Է�" + n + ">> ");
			String country = scanner.next(); // ���� �Է¹���
			if(country.equals("�׸�")) {
				break;
			}
			String capital = scanner.next(); // ������ �Է¹���
			if(nat.containsKey(country)) { 
				System.out.println(country + "�� �̹� �ֽ��ϴ�!");
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
			int index = (int)(Math.random()*nat.size()); //�����߿� �ϳ��� �������� ����
			
			String question = (String)array[index];
			String answer = nat.get(question);
			
			System.out.print(question + "�� ������? "); //�������� ���
			
			String useranswer = scanner.next(); //����ڰ� ���� �Է�
			if(useranswer.equals("�׸�")) { //�׸��� ���
				break;
			}
			if(useranswer.equals(answer)) //�������� �ƴ��� �Ǻ�
				System.out.println("����!!");
			else
				System.out.println("�ƴմϴ�!!");				
		}	
		
	}

	public static void main(String[] args) {
		Capital game = new Capital();
		game.run();
	}
}
