package hw;

import java.util.Scanner;

public class SamsungPhone implements PhoneInterface{
	@Override
	public void sendCall() {
	System.out.println("�츮������");
	}
	@Override
	public void receiveCall() {
	System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	// �޼ҵ� �߰� �ۼ�
	public void flash() { System.out.println("��ȭ�⿡ ���� �������ϴ�."); }
}