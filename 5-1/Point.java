package hw;

import java.util.Scanner;

class Point {
	private int x, y; // �� ���� �����ϴ� x, y ��ǥ
	public void set(int x, int y) {
		this.x = x; 
		this.y = y;
	}
	public void showPoint() { // ���� ��ǥ ���d
			System.out.println("(" + x + "," + y + ")");
	}
}