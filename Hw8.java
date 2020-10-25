package hw;
import java.io.*;
import java.util.*;

public class Hw8 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("대상 파일명 입력>> ");
		File file = new File("C:\\Users\\USER\\eclipse-workspace\\Opensource1\\", scanner.next());
		scanner.nextLine(); //우선 입력된거 지움
		try {
		for(;;) {
			Scanner fScanner = new Scanner(new FileInputStream(file),"MS949");
			//그리고 FileReader로 했더니 한글이 다 깨져서 나와서 FileInputStream으로 써서
			//한글 인코딩 가능한 문자 집합을 지정해줘야한다
			//그리고 여기 fScanner 넣은 이유는 다시 검색하면 처음부터 해야되니까
			int linenumber=1;
			System.out.print("검색할 단어나 문장>> ");
			String search = scanner.nextLine();
			if(search.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
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
			System.out.println("오류");
		}
	}
}