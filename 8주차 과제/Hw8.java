package hw;
import java.io.*;
import java.util.*;

public class Hw8 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("��� ���ϸ� �Է�>> ");
		File file = new File("C:\\Users\\USER\\eclipse-workspace\\Opensource1\\", scanner.next());
		scanner.nextLine(); //�켱 �ԷµȰ� ����
		try {
		for(;;) {
			Scanner fScanner = new Scanner(new FileInputStream(file),"MS949");
			//�׸��� FileReader�� �ߴ��� �ѱ��� �� ������ ���ͼ� FileInputStream���� �Ἥ
			//�ѱ� ���ڵ� ������ ���� ������ ����������Ѵ�
			//�׸��� ���� fScanner ���� ������ �ٽ� �˻��ϸ� ó������ �ؾߵǴϱ�
			int linenumber=1;
			System.out.print("�˻��� �ܾ ����>> ");
			String search = scanner.nextLine();
			if(search.equals("�׸�")) {
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
			while(fScanner.hasNext()) {
				String line = fScanner.nextLine();
				if(line.contains(search)) {
					System.out.println(linenumber+":"+line);
				}
				linenumber++;
			}
		}
		} catch(FileNotFoundException e) {
			System.out.println("����");
		}
	}
}