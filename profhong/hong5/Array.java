package hong5;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] k17_score; // �迭�� �����մϴ�. 
		k17_score = new int []{70, 40, 60, 20, 80}; 
		// ũ�Ⱑ 5�� �迭�� �����ϰ� �迭�ȿ� ������ �������ݴϴ�. 
		System.out.println(k17_score[0]);
		System.out.println(k17_score[5]);
		// �ټ���°���� ������ִ� ���� ���⶧���� index out of bounds��� ������ ����� �˴ϴ�. 
		//�迭���� 0��° ������ ����� ������ ������ݴϴ�. 
		// score[0] = 70
		// score[1] = 40
		// score[2] = 60 ==> �̷� ������ ���� �迭�� ������ֽ��ϴ�. 
		// score[3] = 20
		// score[4] = 80
	}
}
