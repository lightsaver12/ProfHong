package hong5;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int k17_i = 0; k17_i < 10; k17_i++) { 
			//for ���� ���� k17_i �� 0���� 10���� �ݺ��Ͽ� ������ ��������ϴ�. 
			if (k17_i % 3 == 0) {
				// ���⿡ ���ǹ��� �ϳ� ��������ϴ�. 
				// 0���� 10���� ���� for�� �ȿ��� ���� k17_i�� 3���� �������� �������� 0�̶��,
				// �� 3�� ������ 
				continue; // �ؿ� ��¹��� �����ϰ� continue�ض� 
			}
			System.out.println(k17_i); // �׸��� ���������� k17_i�� ����ϸ�
		}
	} // 3�� ����� �����ϰ� 0 ���� 10������ ���ڵ��� ��µǴ� ���� �� �� �ֽ��ϴ�. 
}