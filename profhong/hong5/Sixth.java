package hong5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] k17_itemname = new String[] { "�����Ͽ콺", "��ī����", "��극", "�е�Ű��", "¯�ſ�", "��Ű��ũ��", "������Ĩ", "��īĨ", "������Ĩ",
				"�����ǰ���", "Ȩ����", "���ʸ����", "������", "�����ܰ����", "���̰���", "�ö��޷γ�", "��������", "�žŹ�", "������Ĩ", "�˵��", "���ں�", "�������",
				"�����", "���ڱ���", "��������", "�����ι�", "�ʰ�ҹ�", "��������", "���ھ�����", "������ġ��" };
		// ���ڿ� �迭 k17_itemname�� �����ϰ� �ȿ� ������ �������ݴϴ�. 
		int[] k17_price = new int[] { 1000, 800, 1200, 1300, 900, 1000, 1100, 1200, 1500, 1300, 2100, 1200, 1300, 1000, 900,
				900, 900, 900, 1300, 800, 3000, 1200, 1100, 1300, 2100, 800, 1300, 1200, 1200, 1300 };
		// ������ �迭 k17_price�� �����ϰ� �ȿ� ������ �������ݴϴ�.  
		int[] k17_num = new int[] { 1, 1, 3, 2, 2, 1, 3, 2, 1, 2, 2, 1, 3, 2, 3, 2, 1, 3, 4, 2, 3, 1, 3, 2, 1, 1, 2, 2, 2,
				1 }; // ������ �迭 k17_num�� �����ϰ� �ȿ� ������ �������ݴϴ�. 

		boolean[] k17_taxfree = new boolean[] { true, true, false, false, false, false, false, true, true, false, true,
				false, true, true, true, true, false, false, false, true, false, true, false, false, true, false, true,
				true, true, false };
		// �ο� �ڷ��� �迭 k17_taxfree�� �����ϰ� �ȿ� ������ �������ݴϴ�. 
		DecimalFormat k17_df = new DecimalFormat("###,###,###,###,###"); // �޸��� ���ϱ� ���� ���Դϴ�.
		Calendar k17_cal = Calendar.getInstance(); // ���� ��¥, �ð��� ���ϱ� ���� ���Դϴ�. 
		SimpleDateFormat k17_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm"); // ���� ��¥, �ð��� ���ϴ� ������� �����ϴ� ���Դϴ�. 
		System.out.printf("%11s%27s\n%33s\n%32s\n", "emart", "�̸�Ʈ ������ (031)888-1234", "206-86-50913 ����", // ���ڸ� ������ݴϴ�. 
				"���� ������ ������� 552");
		System.out.printf("%s\n", "������ �������� ��ȯ/ȯ�� �Ұ�"); // ���ڸ� ����մϴ�. 
		System.out.printf("%s\n", "�����ǰ�� ����, 30���̳�(�ż� 7��)"); // ���ڸ� ����մϴ�. 
		System.out.printf("%s\n", "*�Ϻ� �귣����� ����(���� ����������)"); // ���ڸ� ����մϴ�. 
		System.out.printf("%s\n", "��ȯ/ȯ�� ���������� ����(����ī�� ����)"); // ���ڸ� ����մϴ�. 
		System.out.printf("\n"); // ���� �ٲ��ݴϴ�. 
		System.out.printf("%s%22s\n", "[����]" + k17_sdt.format(k17_cal.getTime()), "POS:0011-9861"); 
		// k17_sdt.format(k17_cal.getTime())�� ���� ���� ��¥�� �ð��� �����ݴϴ�. 
		System.out.printf("--------------------------------------------\n"); // -- �� ������ݴϴ�. 
		System.out.printf("%7s%16s%5s%7s\n", "�� ǰ ��", "��  ��", "����", "��  ��"); // ���ڿ����� ������ݴϴ�. 
		System.out.printf("--------------------------------------------\n"); // -- �� ������ݴϴ�. 

		for (int k17_i = 0; k17_i < k17_itemname.length; k17_i++) {
			// �� for���� ���ڿ����� ���߱� ���� for���Դϴ�. 
			// �ϴ� for���� ���� 30�� �ݺ��� �� �ֵ��� �������ݴϴ�. 
			if (k17_itemname[k17_i].length() >= 7) { // �� ���ǹ��� ���� k17_itemname[k17_i]�� ���ڼ��� 7���ں��� ���ٸ� 
				k17_itemname[k17_i] = k17_itemname[k17_i].substring(0, 7); // k17_itemname[k17_i] �ȿ� substring�� ���� 7���ڱ����� �����Ѵٴ� ���Դϴ�. 
			}
			int k17_num1 = 14 - k17_itemname[k17_i].getBytes().length; 
			// ������ ���� k17_num1�� �����ϰ� 14 - ��� 7���ڸ� ������ ���� byte ���� ���ݴϴ�. 
			// 7���ڷ� �߶������� ���ؿ��� �ִ� byte�� �ѱ� �������� (�ѱ�(2byte), ����,����,��ȣ(1byte)) 14byte�̱⿡ 14�Դϴ�. 
			for (int k17_j = 0; k17_j < k17_num1; k17_j++) { // �׷��� ������ �ʿ��� byte ����ŭ for���� ������ 
				k17_itemname[k17_i] = k17_itemname[k17_i] + " "; // k17_itemname[k17_i] �ȿ� ������ ������ ���� �������ݴϴ�.
			}
			if (k17_taxfree[k17_i] == true) { // �� ���ǹ��� �鼼��ǰ�϶� *�� ������ֱ� ���� ���ǹ��Դϴ�. 
				System.out.printf("* %s%11s %6d %9s\n", k17_itemname[k17_i], k17_df.format(k17_price[k17_i]), k17_num[k17_i],
						k17_df.format(k17_price[k17_i] * k17_num[k17_i]));	
				// �׷��� �ο� �ڷ��� �迭���� true�� ������ *�� ������ä ��µǰ� �մϴ�. 
			} else if (k17_taxfree[k17_i] == false) { // ���� �ο� �ڷ��� �迭���� false�� ������ 
				System.out.printf("  %s%11s %6d %9s\n", k17_itemname[k17_i], k17_df.format(k17_price[k17_i]), k17_num[k17_i],
						k17_df.format(k17_price[k17_i] * k17_num[k17_i]));
				// *�� ��� ������ �־� ����ϰԲ� ���ݴϴ�. 
			}
			if ((k17_i + 1) % 5 == 0) { // �׸��� ���������� �ټ����� ��ǰ �������� -- �� ����ϱ� ���� (k17_i + 1) % 5 �Ѱ��� 0�� ������   
				System.out.printf("--------------------------------------------\n"); // ---�� ������ݴϴ�. 
			}
		}
		int k17_total_num = 0; // ������ ���� k17_total_num �� �����ϰ� 0���� �ʱ�ȭ�մϴ�. 
		for (int k17_i = 0; k17_i < k17_num.length; k17_i++) { // for ���� ���� ��� ��ǰ, �� 30���� ��ǰ ���� ���ư��� �մϴ�. 
			k17_total_num = k17_total_num + k17_num[k17_i]; // k17_total_num �Ѽ��� ���� �ȿ� �������� ����ؼ� �����ݴϴ�. 
		}
		System.out.printf("%23s%16d\n", "�� ǰ�� ����", k17_total_num); // �׸��� �̷��� ������ ������ݴϴ�. 

		int k17_total_taxfree = 0; // ������ ���� k17_total_taxfree�� �����ϰ� 0���� �ʱ�ȭ���ݴϴ�. 
		int k17_total_nontaxfree = 0; // ������ ���� k17_total_nontaxfree�� �����ϰ� 0���� �ʱ�ȭ���ݴϴ�. 
		for (int k17_i = 0; k17_i < k17_itemname.length; k17_i++) { // ���������� for���� ���� ��� ��ǰ(30��) ���� �� �� �ֵ��� �ݺ����ݴϴ�. 
			if (k17_taxfree[k17_i] == true) { // ���� �鼼��ǰ�ϰ�쿡
				k17_total_taxfree = k17_total_taxfree + (k17_price[k17_i] * k17_num[k17_i]); // k17_total_taxfree �ȿ� �鼼��ǰ���� ���ݵ��� �����ص� �� ������ �������ݴϴ�.  
			} else { // ���� �鼼��ǰ�� �ƴ� ��쿡�� 
				k17_total_nontaxfree = k17_total_nontaxfree + (k17_price[k17_i] * k17_num[k17_i]); 
				// k17_total_nontaxfree �ȿ� ������ǰ���� ���ݵ��� �����ص� �� �������������ݴϴ�. 
			}
		}
		System.out.printf("%24s%16s\n", "(*)�� ��  �� ǰ", k17_df.format(k17_total_taxfree)); //k17_df.format�� ���� �޸��� ����ְ� ���� ������ݴϴ�.  
		System.out.printf("%23s%16s\n", "	�� ��  �� ǰ", k17_df.format(k17_total_nontaxfree)); //k17_df.format�� ���� �޸��� ����ְ� ���� ������ݴϴ�. 

		double k17_tax_rate = 0.1; // �Ǽ��� ���� k17_tax_rate�� �������ְ� 0.1�� �������ݴϴ�. 
		int k17_tax = (int) (k17_total_nontaxfree * k17_tax_rate); 
		// ������ ���� k17_tax�� �������ְ� �ȿ� ���������� ���� k17_total_nontaxfree * k17_tax_rate�� ���� �������ݴϴ�. 
		System.out.printf("%25s%16s\n", "��   ��   ��", k17_df.format(k17_tax)); // ������ ���� ������ݴϴ�. 

		int k17_total_price = 0; // ������ ���� k17_total_price�� �������ְ� 0���� �ʱ�ȭ���ݴϴ�. 
		k17_total_price = k17_total_taxfree + k17_total_nontaxfree + k17_tax;
		// k17_total_price �ȿ� ��� �������� ���� ���� �������ݴϴ�. 
		System.out.printf("%26s%16s\n", "��        ��", k17_df.format(k17_total_price)); // �޸��� ��� �������� ������ݴϴ�. 
		System.out.printf("%s%27s\n", "�� �� �� �� �� ��", k17_df.format(k17_total_price)); // �޸��� ��� �������� ������ݴϴ�. 
		System.out.printf("--------------------------------------------\n"); // -- �� ������ݴϴ�. 
		System.out.printf("%s%31s\n", "0012 KEB �ϳ�", "541707**0484/35860658"); // ���ڵ��� ����մϴ�. 
		System.out.printf("%s%29s\n", "ī�����(IC)", "�Ͻú� / " + k17_df.format(k17_total_price)); // ������ ���ڵ��� ������ݴϴ�. 
		System.out.printf("--------------------------------------------\n"); // -- �� ������ݴϴ�. 
		System.out.printf("%23s\n", "[�ż�������Ʈ ����]"); // ���ڸ� ������ݴϴ�. 
		System.out.printf("%s\n", "ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�."); // ���ڸ� ������ݴϴ�. 
		System.out.printf("%s%20s%10s\n", "��ȭ�߻�����Ʈ", "9350**9995", "164"); // ���ڵ��� ������ݴϴ�. 
		System.out.printf("%s%18s%10s\n", "����(���)����Ʈ", "5,637(", "5,473)"); // ���ڵ��� ������ݴϴ�.
		System.out.printf("%s\n", "*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�."); // ���ڸ� ������ݴϴ�. 
		System.out.printf("--------------------------------------------\n"); // --�� ������ݴϴ�. 
		System.out.printf("%22s\n", "���űݾױ��� ���������ð� �ڵ��ο�"); // ���ڵ��� ������ݴϴ�. 
		System.out.printf("%s%32s\n", "������ȣ : ", "34��****"); // ���ڵ��� ������ݴϴ�. 
		SimpleDateFormat k17_sdt1 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); 
		// ���⿡�� �ٽ��ѹ� ��¥������ �������ִ� ������ �ռ� �ִ� ��¥���İ� ���� �ϴ� ��¥ ������ �ٸ��⶧���Դϴ�. 
		System.out.printf("%s%33s\n", "�����ð� : ", k17_sdt1.format(k17_cal.getTime())); // ������ �ٲ� ��¥�� ������ݴϴ�. 
		System.out.printf("--------------------------------------------\n"); // -- �� ����մϴ�. 
		System.out.printf("%s%28s\n", "ĳ��:084599 ��00", "1150"); // ���ڸ� ������ݴϴ�. 
		System.out.printf("%40s\n", "|||||||||||||||||||||||||||||||||||"); // ���ڵ带 ������ݴϴ�. 
		SimpleDateFormat k17_sdt2 = new SimpleDateFormat("YYYYMMdd"); // �Ǵٸ� ������ ��¥ �����Դϴ�. 
		System.out.printf("%37s", k17_sdt2.format(k17_cal.getTime()) + "/00119861/00164980/31"); // �ٸ� ��¥ ������ ������ݴϴ�. 
	}
}
