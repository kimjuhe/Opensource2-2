package hw;
import java.util.Scanner;

public class hw1 {
	
	public static void main(String[] args) {
		double num1, num2, result;
		String x;
		
		System.out.println("����>>");
		Scanner scanner=new Scanner(System.in);
		
		num1=scanner.nextDouble();
		x=scanner.next();
		num2=scanner.nextDouble();
		
		switch(x) {
	     case "+" :
	        result = num1+num2;
	        System.out.print(num1+x+num2+"�� ��� ����� "+result);
	        break;
	     case "-":
	        result = num1-num2;
	        System.out.print(num1+x+num2+"�� ��� ����� "+result);
	        break;
	     case "*":
	        result = num1*num2;
	        System.out.print(num1+x+num2+"�� ��� ����� "+result);
	        break;
	     case "/":
	        if(num2==0) {
	           System.out.print("0���� ���� �� �����ϴ�.");
	           break;
	        }
	        else {
	           result = num1 / num2;
	           System.out.print(num1+x+num2+"�� ��� ����� "+result);
	           break;
	        }
	     default:
	        System.out.print("�߸� �Է��Ͽ����ϴ�.");
	     }
		
		scanner.close();
	}
}
