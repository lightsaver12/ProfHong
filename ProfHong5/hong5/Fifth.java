package hong5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Fifth {

	public static int netprice(int k17_price, double k17_rate) { //k17_netprice��� �޼ҵ带 �����ϰ� �ȿ� parameter �� ������ ���� k17_price �� �Ǽ��� ���� k17_rate�� ����մϴ�.
		return (int)(k17_price/(1+ k17_rate)); // ���������� ���� k17_Price ������ (1+k17_rate)�� ���� �����մϴ�.
	}
	
	public static void main(String[] args) {
		
		DecimalFormat k17_df = new DecimalFormat("###,###,###,###,###"); // �޸��� ���ϱ� ���� ���Դϴ�. 
		Calendar k17_cal = Calendar.getInstance(); // ���� ��¥, �ð��� ���ϱ� ���� ���Դϴ�. 
		SimpleDateFormat k17_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // ���� ��¥, �ð��� ���ϴ� ������� �����ϴ� ���Դϴ�. 
		
		String k17_itemname1 = "ǻ��� �����ܿ븶��ũ(�ְ����)"; // ������ Ŭ���� k17_itemname1 �� �����ϰ� �ȿ� ���ڿ��� �������ݴϴ�. 
		String k17_itemcode1 = "[1031615]"; // ������ Ŭ���� k17_itemcode1�� �����ϰ� �ȿ� ���ڿ��� �������ݴϴ�. 
		int k17_price1 = 3000; // ������ ���� k17_price1�� �����ϰ� 3000�� �������ݴϴ�. 
		int k17_amount1 = 1; // ������ ���� k17_amount1�� �����ϰ� 1�� �������ݴϴ�. 
		
		String k17_itemname2 = "�����̵�ĸ�â(���θ�)(100ȣ)"; // ������ Ŭ���� k17_itemname2 �� �����ϰ� �ȿ� ���ڿ��� �������ݴϴ�. 
		String k17_itemcode2 = "[11008152]"; // ������ Ŭ���� k17_itemcode2�� �����ϰ� �ȿ� ���ڿ��� �������ݴϴ�.
		int k17_price2 = 1000; // ������ ���� k17_price2�� �����ϰ� 1000�� �������ݴϴ�. 
		int k17_amount2 = 1; // ������ ���� k17_amount2�� �����ϰ� 1�� �������ݴϴ�. 
		
		String k17_itemname3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)"; // ������ Ŭ���� k17_itemname3 �� �����ϰ� �ȿ� ���ڿ��� �������ݴϴ�.
		String k17_itemcode3 = "[1020800]"; // ������ Ŭ���� k17_itemcode3�� �����ϰ� �ȿ� ���ڿ��� �������ݴϴ�.
		int k17_price3 = 1000; // ������ ���� k17_price3�� �����ϰ� 1000�� �������ݴϴ�. 
		int k17_amount3 = 1; // ������ ���� k17_amount3�� �����ϰ� 1�� �������ݴϴ�. 
		
		int k17_price = 0; // ������ ���� k17_price �� �����ϰ� 0���� �ʱ�ȭ�մϴ�. 
		k17_price = (int)((k17_price1*k17_amount1)+(k17_price2*k17_amount2)+(k17_price3*k17_amount3));
		// k17_price �����ȿ� ������ ���� �� �������� ���ݰ� ������ ���ϰ� �� ������ �����ݴϴ�. 
		double k17_tax_rate = 0.1; // �Ǽ��� ���� k17_tax_rate�� �����ϰ� 0.1�� �������ݴϴ�. 
		
		int k17_netprice = netprice(k17_price, k17_tax_rate); // ������ ���� k17_netprice�� �����ϰ� �ȿ� netprice �޼ҵ��� �������� ������ְ� ������� �������ݴϴ�., 
		int k17_tax = k17_price - k17_netprice; // ������ ���� k17_tax�� �����ϰ� �ȿ� k17_price - k17_netprice�� ���� �������ݴϴ�. 
		
		System.out.printf("%25s\n", "\"���ΰ���, ���̼�\""); // %25s\n�� 25ĭ��ŭ�� ������ �ְ� ���� �ٲ۴ٴ� �ǹ��Դϴ�. \"�� �ǹ̴� "�� ����ϱ� �����Դϴ�. 
		System.out.printf("%s\n", "(��)�Ƽ����̼�_�д缭����"); // ���ڸ� ������ݴϴ�. 
		System.out.printf("%s\n", "��ȭ:031-702-6016"); // ���ڸ� ������ݴϴ�. 
		System.out.printf("%s\n", "����:���� ������ ���μ�ȯ�� 2748 (���)"); // ���ڸ� ������ݴϴ�. 
		System.out.printf("%s\n", "��ǥ:������,��ȣ�� 213-81-52063"); // ���ڸ� ������ݴϴ�. 
		System.out.printf("%s\n%s\n", "����:��⵵ ������ �д籸 �д��53���� 11 (����","��)"); // ���ڸ� ������ݴϴ�. 
		System.out.printf("================================================\n"); // == �� ������ݴϴ�. 
		System.out.printf("%26s\n%28s\n", "�Һ����߽ɰ濵(CCM) �������", "ISO 9001 ǰ���濵�ý��� �������"); // ���ڸ� ����մϴ�. 
		System.out.printf("================================================\n"); // == �� ����մϴ�. 
		System.out.printf("%29s\n%28s\n%26s\n%26s\n", "��ȯ/ȯ�� 14��(03��24��)�̳�,", "(����)������, ����ī�� ���� �� ���Ը��忡�� ����", 
							"����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�", "üũī�� ��� �� �ִ� 7�� �ҿ�"); // ���ڸ� ����մϴ�. 
		System.out.printf("================================================\n"); // == �� ����մϴ�. 
		System.out.printf("%s%35s\n", "[POS 1058231]", k17_sdt.format(k17_cal.getTime())); // k17_sdt.format(k17_cal.getTime())�� ���� ���� ��¥ �ð��� ���ϰ� ������ݴϴ�.
		System.out.printf("================================================\n"); // == �� ������ݴϴ�. 
		System.out.printf("%1.14s%8s%5d%9s\n%s\n", k17_itemname1, k17_df.format(k17_price1), k17_amount1, k17_df.format(k17_price1*k17_amount1), k17_itemcode1);
		// ex) %1.14s �� ���ϴ� ���� 1��ŭ�� ������ �ο��ϰ� ���� 14��°�ڸ����� ����ϰ� �ڴ� �����Ѵٴ� ���Դϴ�. 
		// �׸��� ������ ������ ������ݴϴ�. 
		System.out.printf("%1.14s%10s%5d%9s\n%s\n", k17_itemname2, k17_df.format(k17_price2), k17_amount2, k17_df.format(k17_price2*k17_amount2), k17_itemcode2);
		// ���������� ����մϴ�. 
		System.out.printf("%1.14s%8s%5d%9s\n%s\n", k17_itemname3, k17_df.format(k17_price3), k17_amount3, k17_df.format(k17_price3*k17_amount3), k17_itemcode3);
		// ���� ���������� ����մϴ�. 
		System.out.printf("%18s%26s\n", "�����հ�", k17_df.format(k17_netprice)); // �޸��� ���ϱ� ���� k17_df.format�� ����ϰ� ������ ���� ������ݴϴ�. 
		System.out.printf("%19s%26s\n", "�ΰ���", k17_df.format(k17_tax)); // �޸��� ���ϱ� ���� k17_df.format�� ����ϰ� ������ ���� ������ݴϴ�.
		System.out.printf("------------------------------------------------\n"); // --�� ����մϴ�. 
		System.out.printf("%s%40s\n", "�Ǹ��հ�", k17_df.format(k17_price)); // �޸��� ���ϱ� ���� k17_df.format�� ����ϰ� ������ ���� ������ݴϴ�.
		System.out.printf("================================================\n"); // ==�� ����մϴ�. 
		System.out.printf("%s%40s\n", "�ſ�ī��", k17_df.format(k17_price)); // �޸��� ���ϱ� ���� k17_df.format�� ����ϰ� ������ ���� ������ݴϴ�.
		System.out.printf("------------------------------------------------\n"); // --�� ����մϴ�. 
		System.out.printf("%s%40s\n", "�츮ī��", "538720**********"); // ���ڸ� ����մϴ�. 
		System.out.printf("%s%24s\n", "���ι�ȣ 77982843(0)", "���αݾ� "+k17_df.format(k17_price)); // �޸��� ���ϱ� ���� k17_df.format�� ����ϰ� ������ ���� ������ݴϴ�.
		System.out.printf("================================================\n"); // ==�� ����մϴ�. 
		System.out.printf("%28s%s\n", k17_sdt.format(k17_cal.getTime()), " �д缭����"); // �ð��� ���ϱ� ���� k17_sdt.format(k17_cal.getTime())�� ����ϰ� �ð��� ���ڸ� ����մϴ�. 
		System.out.printf("%s\n", "��ǰ �� ��Ÿ ���� : 1522-4400"); // ���ڸ� ����մϴ�. 
		System.out.printf("%s\n", "����� �� �����̼� ���� ���� : 1599-2211"); // ���ڸ� ����մϴ�. 
		System.out.printf("%33s\n", "|||||||||||||||||||"); // ���ڵ带 ����մϴ�. 
		System.out.printf("%31s\n", "211820610158231"); // ���ڸ� ����մϴ�. 
		System.out.printf("------------------------------------------------\n"); // --- �� ����մϴ�. 
		System.out.printf("%27s\n%25s", "*���̼� ����� �� �Ǵ� Ȩ�������� �����ϼż�", "ȸ������ �� �پ��� ������ ����������!*"); // ���ڸ� ����մϴ�. 
	}
}
