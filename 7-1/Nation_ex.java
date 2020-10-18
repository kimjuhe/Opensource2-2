package hw;
import java.util.Scanner;
import java.util.Vector;
public class Nation_ex {
	private Vector<Nation> nat = new Vector<Nation>();
	private Scanner scanner = new Scanner(System.in);
	
	public Nation_ex() {
		//nat�ʱ�ȭ
		nat.add(new Nation("����", "������"));
		nat.add(new Nation("�߽���", "�߽��ڽ�Ƽ"));
		nat.add(new Nation("��Ű", "��ī��"));
		nat.add(new Nation("����", "����"));
		nat.add(new Nation("�߱�", "����¡"));
		nat.add(new Nation("�Ϻ�", "����"));
		nat.add(new Nation("�����̽þ�", "��˶��Ǫ��"));
		nat.add(new Nation("�븸", "Ÿ�̺���"));
		nat.add(new Nation("�׸���", "���׳�"));
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
	private boolean contains(String country) {
		for(int i=0; i<nat.size(); i++) {
			if(nat.get(i).country.equals(country)) { //�̹� �Է��� ������ ���
				return true;
			}
		}
		
		return false;
	}
	private void input() {
		int n = nat.size();
		System.out.println("���� " + n + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
		n++;
		while(true) {
			System.out.print("����� ���� �Է�" + n + ">> ");
			String country = scanner.next(); //���� �Է�
			if(country.equals("�׸�")) {
				break;
			}
			String capital = scanner.next(); //���� �Է�
			if(contains(country)) { //�̺� �ִ� ������ ���
				System.out.println(country + "�� �̹� �ֽ��ϴ�!");
				continue;
			}
				
			nat.add(new Nation(country, capital));
			n++;
		}
	}
	private void quiz() {
		while(true) {.
			int index = (int)(Math.random()*nat.size()); //���� �������� �ϳ� ����
			
			Nation nation = nat.get(index);
			String question = nation.country;
			String answer = nation.capital;
			
			System.out.print(question + "�� ������? "); //���� ���
			
			String useranswer = scanner.next(); //���� �Է�
			if(useranswer.equals("�׸�")) { //���߱� ���� ���
				break;
			}
			if(useranswer.equals(answer)) //������ ���� Ʋ�� ���
				System.out.println("����!!");
			else
				System.out.println("�ƴմϴ�!!");				
		}	
		
	}

	public static void main(String[] args) {
		Nation_ex game = new Nation_ex();
		game.run();
	}
}