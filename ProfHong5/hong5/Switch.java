package hong5;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // �Է��� �غ�
		int k17_n = sc.nextInt(); // ���������� k17_n�� �����ϰ� �Է°��� ���� �غ� �մϴ�. 
		
		switch(k17_n) { // �������������� �ѹ��� ǥ�ð���, ����ġ ���ǹ�
			case 1: // ù��° ���̽�
				System.out.println("Onepiece"); // 1���϶��� ������ ������ ����մϴ�.  
				break; // �����ϴ�. ������ ������ ��� ���̽����� ��¹����� �� ����մϴ�. 
			case 2: // �ι�° ���̽�
				System.out.println("2nel"); //2���϶��� ������ ������ ����մϴ�. 
				break; // �����ϴ�. 
			case 3: // ����° ���̽�
				System.out.println("Tree"); // 3���϶��� ������ ������ ����մϴ�. 
				break; // �����ϴ�. 
		}
	}
}
