package hw;
import java.util.Scanner;

public class hw1 {
	
	public static void main(String[] args) {
		int x1, y1, x2, y2;
		double r1, r2, d;
		
		System.out.println("ù��° ���� �߽ɰ� ������ �Է�");
		Scanner scanner=new Scanner(System.in);
		x1=scanner.nextInt();
		y1=scanner.nextInt();
		r1=scanner.nextDouble();
		System.out.println("��° ���� �߽ɰ� ������ �Է�");
		x2=scanner.nextInt();
		y2=scanner.nextInt();
		r2=scanner.nextDouble();
		
		 d = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
		
		 if(d <= r1+r2) {
	         System.out.print("�� ���� ���� ��ģ��.");
	      }
	      else {
	         System.out.print("�� ���� ���� ��ġ�� �ʴ´�.");
	      }
		 scanner.close();
	}
}
