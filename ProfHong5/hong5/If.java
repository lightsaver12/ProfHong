package hong5;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // �Է��� �ޱ� ���ؼ�
		int k17_n = sc.nextInt(); // ������ ���� k17_n�� �����ϰ� ���� �غ� �մϴ�. 
		int k17_a = 6; //������ ���� k17_a�� �����ϰ� 6�� �������ݴϴ�. 
		if (k17_n > k17_a) { // ���� k17_n������ k17_a�������� ũ�ٸ�
			System.out.println(k17_n + " is bigger than " + k17_a); // k17_n�� k17_a���� ũ��
		} else {// �ƴϸ� 
			System.out.println(k17_n + " is smaller than " + k17_a); // k17_n�� k17_a���� �۴�
		}
		// if ���ǹ��� ����� ���߿� �ϳ��Դϴ�. 
		// ~�ϰų�, �ƴ� ~���� �ʰų� �ѷ� ������ �˴ϴ�. ���� ����ؼ� ����� true or false�Դϴ�. 
	}
}
