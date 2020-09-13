<<<<<<< HEAD
package hw;
import java.util.Scanner;

public class hw1 {
	
	public static void main(String[] args) {
		int x1, y1, x2, y2;
		double r1, r2, d;
		
		System.out.println("Ã¹¹øÂ° ¿øÀÇ Áß½É°ú ¹ÝÁö¸§ ÀÔ·Â");
		Scanner scanner=new Scanner(System.in);
		x1=scanner.nextInt();
		y1=scanner.nextInt();
		r1=scanner.nextDouble();
		System.out.println("µÎÂ° ¿øÀÇ Áß½É°ú ¹ÝÁö¸§ ÀÔ·Â");
		x2=scanner.nextInt();
		y2=scanner.nextInt();
		r2=scanner.nextDouble();
		
		 d = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
		
		 if(d <= r1+r2) {
	         System.out.print("µÎ ¿øÀº ¼­·Î °ãÄ£´Ù.");
	      }
	      else {
	         System.out.print("µÎ ¿øÀº ¼­·Î °ãÄ¡Áö ¾Ê´Â´Ù.");
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
		
		System.out.println("ì²«ë²ˆì§¸ ì›ì˜ ì¤‘ì‹¬ê³¼ ë°˜ì§€ë¦„ ìž…ë ¥");
		Scanner scanner=new Scanner(System.in);
		x1=scanner.nextInt();
		y1=scanner.nextInt();
		r1=scanner.nextDouble();
		System.out.println("ë‘ì§¸ ì›ì˜ ì¤‘ì‹¬ê³¼ ë°˜ì§€ë¦„ ìž…ë ¥");
		x2=scanner.nextInt();
		y2=scanner.nextInt();
		r2=scanner.nextDouble();
		
		 d = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
		
		 if(d <= r1+r2) {
	         System.out.print("ë‘ ì›ì€ ì„œë¡œ ê²¹ì¹œë‹¤.");
	      }
	      else {
	         System.out.print("ë‘ ì›ì€ ì„œë¡œ ê²¹ì¹˜ì§€ ì•ŠëŠ”ë‹¤.");
	      }
		 scanner.close();
	}
}

>>>>>>> 5a17130dbb6dcda222220ad1735d8bb17edf0f6c
