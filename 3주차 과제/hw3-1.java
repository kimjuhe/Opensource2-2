package hw;
import java.util.InputMismatchException;
import java.util.Scanner;

public class hw1 {
	
	public static void main(String[] args) {
		
		int n=0;
		int m=0;
		Scanner scanner=new Scanner(System.in);
		while(true) {
		try {
			System.out.println("���ϰ��� �ϴ� �� �� �Է�>>");
			n = scanner.nextInt();
			m = scanner.nextInt();
			break;
		}
		catch(InputMismatchException ime) {
			scanner = new Scanner(System.in);
			System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
		}
		}
		
		System.out.println(n+"x"+m+"="+n*m);
		scanner.close();
	}
}
