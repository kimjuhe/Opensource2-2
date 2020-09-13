package hw;
import java.util.Scanner;

public class hw1 {
	
	public static void main(String[] args) {
		double num1, num2, result;
		String x;
		
		System.out.println("연산>>");
		Scanner scanner=new Scanner(System.in);
		
		num1=scanner.nextDouble();
		x=scanner.next();
		num2=scanner.nextDouble();
		
		switch(x) {
	     case "+" :
	        result = num1+num2;
	        System.out.print(num1+x+num2+"의 계산 결과는 "+result);
	        break;
	     case "-":
	        result = num1-num2;
	        System.out.print(num1+x+num2+"의 계산 결과는 "+result);
	        break;
	     case "*":
	        result = num1*num2;
	        System.out.print(num1+x+num2+"의 계산 결과는 "+result);
	        break;
	     case "/":
	        if(num2==0) {
	           System.out.print("0으로 나눌 수 없습니다.");
	           break;
	        }
	        else {
	           result = num1 / num2;
	           System.out.print(num1+x+num2+"의 계산 결과는 "+result);
	           break;
	        }
	     default:
	        System.out.print("잘못 입력하였습니다.");
	     }
		
		scanner.close();
	}
}
