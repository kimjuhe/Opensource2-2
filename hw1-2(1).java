<<<<<<< HEAD
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
=======
package hw;
import java.util.Scanner;

public class hw1 {
	
	public static void main(String[] args) {
		int x1, y1, x2, y2;
		double r1, r2, d;
		
		System.out.println("첫번째 원의 중심과 반지름 입력");
		Scanner scanner=new Scanner(System.in);
		x1=scanner.nextInt();
		y1=scanner.nextInt();
		r1=scanner.nextDouble();
		System.out.println("두째 원의 중심과 반지름 입력");
		x2=scanner.nextInt();
		y2=scanner.nextInt();
		r2=scanner.nextDouble();
		
		 d = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
		
		 if(d <= r1+r2) {
	         System.out.print("두 원은 서로 겹친다.");
	      }
	      else {
	         System.out.print("두 원은 서로 겹치지 않는다.");
	      }
		 scanner.close();
	}
}

>>>>>>> 5a17130dbb6dcda222220ad1735d8bb17edf0f6c
