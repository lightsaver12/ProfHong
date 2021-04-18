package hong5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Fourth {

	public static int netprice(int k17_price, double k17_rate) { //k17_netprice��� �޼ҵ带 �����ϰ� �ȿ� parameter �� ������ ���� k17_price �� �Ǽ��� ���� k17_rate�� ����մϴ�. 
		return (int) (k17_price/(1+ k17_rate)); // ���������� ���� k17_Price ������ (1+k17_rate)�� ���� �����մϴ�. 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k17_price = 33000; // ������ ���� k17_price�� �����ϰ� �ȿ� 33000���� �ֽ��ϴ�. 
		double k17_tax_rate = 0.1; // �Ǽ��� ���� k17_tax_rate �� �����ϰ� 0.1�� �����մϴ�. 
		
		int k17_netprice = netprice(k17_price, k17_tax_rate); // ������ ���� k17_netprice�� �����ϰ� �ȿ� k17_netprice �޼ҵ��� ���� ���� �ֽ��ϴ�. 
		int k17_tax = k17_price - k17_netprice; // ������ ���� k17_tax�� �����ϰ� �ȿ� k17_price - k17_netprice�� ���� �ֽ��ϴ�. 
		
		DecimalFormat k17_df = new DecimalFormat("###,###,###,###,###"); // �޸��� ���ϱ� ���� ���Դϴ�. 
		Calendar k17_cal = Calendar.getInstance(); // ���� ��¥, �ð��� ���ϱ� ���� ���Դϴ�. 
		SimpleDateFormat k17_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // ���� ��¥, �ð��� ���ϴ� ������� �����ϴ� ���Դϴ�. 
		
		System.out.printf("%s\n", "�ſ����"); // ���ڿ� Ŭ�����̹Ƿ� %s�� ����ϰ� \n�� ���� ���� �ٲߴϴ�. �׸��� �������� ���ϴ� ���ڿ��� ����մϴ�. 
		System.out.printf("%s%5s%18s%5s\n","�ܸ��� : ","2N6865898", "��ǥ��ȣ : ", "0421218"); // ���ڿ� Ŭ�����̹Ƿ� s�� ����մϴ�. 
		System.out.printf("%s%5s\n", "������ : ", "�Ѿ��ġ�"); // ���������� 5ĭ�� ������ �ְ� ���ڿ��� ����մϴ�.
		System.out.printf("%s%5s\n%s\n", "�� �� : ","��� ������ �д籸 Ȳ�����351���� 10 .","1��"); // ���� ����մϴ�. 
		System.out.printf("%s%2s\n", "��ǥ�� : ", "��â��"); // ���� ����մϴ�. 
		System.out.printf("%s%5s%19s%5s\n","����� : ", "752-53-00558","TEL : ", "7055695"); // ���� ����մϴ�. 
		System.out.printf("- - - - - - - - - - - - - - - - - - - - - - - - \n"); // ��������մϴ�. 
		System.out.printf("%s%38s%s\n", "��  ��", k17_df.format(k17_netprice), " ��"); // �޸��� ����ϱ� ���� k17_df.format�� ����ϰ� k17_netprice�� ����մϴ�. 
		System.out.printf("%s%38s%s\n", "�ΰ���", k17_df.format(k17_tax), " ��"); // �޸��� ����ϱ� ���� k17_df.format�� ����ϰ� k17_netprice�� ����մϴ�.
		System.out.printf("%s%38s%s\n", "��  ��", k17_df.format(k17_price), " ��"); // �޸��� ����ϱ� ���� k17_df.format�� ����ϰ� k17_netprice�� ����մϴ�.
		System.out.printf("- - - - - - - - - - - - - - - - - - - - - - - - \n"); // - - ����մϴ�. 
		System.out.printf("%s\n", "�츮ī��"); // ���� ����մϴ�. 
		System.out.printf("%s%5s%11s\n", "ī���ȣ : ", "5387-20**-****-4613(S)", "�Ͻú�"); // ���ڸ� ����մϴ�. 
		System.out.printf("%s%5s\n", "�ŷ��Ͻ� : ", k17_sdt.format(k17_cal.getTime())); // �ð��� ���ϱ� ���� k17_sdt.format(k17_cal.getTime()) �� ����ϰ� ��¥�ð��� �����ݴϴ�. 
		System.out.printf("%s%5s\n", "���ι�ȣ : ", "70404427"); // ���ڸ� ����մϴ�. 
		System.out.printf("%s%5s\n", "�ŷ���ȣ : ", "357734873739"); // ���ڸ� ����մϴ�. 
		System.out.printf("%s%5s%13s%5s\n", "���� : ", "��ī���", "���� : ", "720068568"); // ���ڸ� ����մϴ�. 
		System.out.printf("%s%5s\n", "�˸� : ", "EDC����ǥ"); // ���ڸ� ����մϴ�. 
		System.out.printf("%s%5s\n", "���� : ", "TEL)1544-4700"); // ���ڸ� ����մϴ�. 
		System.out.printf("- - - - - - - - - - - - - - - - - - - - - - - - \n"); // - - �� ����մϴ�. 
		System.out.printf("%25s\n", "* �����մϴ� *"); // ���ڸ� ����մϴ�. 
		System.out.printf("%45s","ǥ��V2.08_20200212"); // ���ڸ� ����մϴ�. 
	}
}
