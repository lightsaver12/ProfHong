package hong5;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // �Է��� �ϱ� ���� �غ�
		int k17_n = sc.nextInt(); // ������ ���� n�� �����ϰ� �Է��� �غ� �Ѵ�.

		for (int k17_i = 1; k17_i <= k17_n; k17_i++) {
			// ������ for �ݺ����߿��� ù��° for ���� ù��° ������ �ش�˴ϴ�.
			// ù��° ������ 1���� n ��°���� �ݺ��Ͽ� ��µǰ� �ϳ��� �������ϴ�.
			for (int k17_j = 1; k17_j <= k17_n; k17_j++) {
				// �ι�° for���� �ι��� ������ �ش��մϴ�. ���������� 1���� n��°����
				// �ݺ��Ͽ� ��µ˴ϴ�. 
				System.out.println(k17_i + "X" + k17_j + "=" + k17_j * k17_i);
				// ���������� �� ���� ����Ҷ� �� �Է��� 3���� �ް� �Ǹ�, 
				// �� ���� ��� 1���� 3���� ���ʴ�� ��µǸ� ���ʰ� ������ 
				// ���� ���ڷ� �Ѿ �ٽ� �ݺ��� �����մϴ�. 
			}
		}
	}
}
