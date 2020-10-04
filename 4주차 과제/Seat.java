package hw;

public class Seat {
	//class Seat { // �¼� ����
		private String seat[];
		
		public Seat() { // �¼� ������
			seat = new String[10]; //10���� �¼�
			for(int i=0; i<seat.length; i++) {
				seat[i] = "---";
			}
		}
		
		public void Show() { // �¼� ���� ���
			for(int i=0; i<seat.length; i++) {
				System.out.print(seat[i]+" ");
			}
			System.out.println();
		}
		
		public void Set(String name, int num) { // ���ŵ� �¼� ���� ó��
			seat[num-1] = name;
		}
		
		public boolean reSet(String name) { // �¼� ��� ���� Ȯ�� ��, ó��
			for(int i=0; i<seat.length; i++) {
				if(name.equals(seat[i])) {
					seat[i] = "---";
					return true;
				}
			}
			return false;
		}
	
}
