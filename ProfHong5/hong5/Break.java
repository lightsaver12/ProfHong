package hong5;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k17_i = 0; // ������ ���� k17_i�� �����ϰ� 0���� �ʱ�ȭ�մϴ�. 
		int k17_sum = 0; // ������ ���� k17_sum�� �����ϰ� 0���� �ʱ�ȭ�մϴ�. 

		while (true) { // ���ѹݺ��� while(true)��
			if (k17_sum > 10) // ���� k17_sum ������ 10���� Ŀ����쿡
				break; // ���ѷ����� Ż���մϴ�. 
			k17_i++; // ���� k17_i�� ����ؼ� 1�� Ŀ���ϴ�. 
			k17_sum += k17_i; // k17_sum������ k17_i�� �յ��� ����ؼ� �������ݴϴ�. 

		} // while���� ��
		System.out.println(k17_i); //k17_i�� ������ּ���.
		System.out.println(k17_sum); // k17_sum������ ������ּ���. 
	}	// k17_i�� ���Ѵ�� �����ְ� �� ������ k17_sum���ٰ� �������ݴϴ�. 
		// �׷��� ���ǹ��� k17_sum�� ���� 10���� Ŀ�� ��쿡 ���ѷ����� Ż���ϱ� ������
		// k17_sum�� 15�� ��쿡 Ż��ǰ� �׶��� k17_i���� 5�϶��Դϴ�. 
}	
