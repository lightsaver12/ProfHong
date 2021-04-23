package hong5;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Sixth {
	
	public static String nameChange(String k17_item, int k17_len) throws UnsupportedEncodingException {      
	      String k17_temp, k17_newName; // 스트링 값 temp와 newName를 선언
	      byte[] k17_byte1 = k17_item.getBytes("euc-kr");   // euc-kr 형식으로 바이트 단위로 쪼갬
	      if (k17_byte1.length < 15) { // byte1의 길이가 15바이트 미만일 경우
	         k17_temp = k17_item; // 아이템이름을 그대로 출력
	      } else { // 그렇지 않을 경우
	         int k17_count = 0; // 정수형 변수 count를 선언하고 0으로 초기화
	         for (int k17_i = 0; k17_i <k17_len; k17_i++) { // i값이 len까지 1씩 증가하면서 반복
	            if ((k17_byte1[k17_i] & 0x80) == 0x80) k17_count++; // & 연산자를 통해 해당 바이트가 한글인지를 확인
	         }
	         // 마지막 바이트-1 값이 한글이거나 count를 나눈값이 홀수이면 마지막 바이트를 자름
	         if ((k17_byte1[k17_len - 1] & 0x80) == 0x80 && (k17_count % 2) == 1) k17_len--;
	         k17_temp = new String(k17_byte1, 0, k17_len, "euc-kr");   // 0에서 len까지 자른 스트링을 저장
	      }
	      k17_temp = k17_temp + "                     "; // 남은 칸을 빈칸으로 맞추기 위함
	      byte[] byte2 = k17_temp.getBytes("euc-kr"); // euc-kr 형식으로 바이트를 다시 쪼갬
	      k17_newName = new String(byte2, 0, 15, "euc-kr"); // newName에 euc-kr 형식으로 0에서 16바이트까지 자른 스트링을 저장   
	      return k17_newName;   // newName값을 반환
	   }
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String[] k17_itemname = new String[] { "abcdefghijklmnop", "차카나요안착하나요안착한지나는몰라유","사브레인", 
				"밀가루키스", "짱구", "ㅋ", "문스윙스칩", "포카앤칩", "NAS",
				"오나의감자", "어웨이런볼", "에너르기바", "게이트웨이", "월드콘칩", "아이개셔", "올때메로나", 
				"정보석바", "씽씽바보", "오감자칩", "쫀드기행", "코코볼넷", "마이쮸우", "깝새우", "감자깡까", 
				"맛동산이맛이없어유", "아폴로밍", "너고소미", "빼Qo말로", "쵸코얼음땡", "마이콘치즈" };
				// 문자열 배열 k17_itemname을 생성하고 안에 값들을 저장해줍니다. 
		
		int[] k17_price = new int[] { 300000, 800, 1200, 1000, 900, 1000, 1100, 1200, 1500, 1300, 2100, 1200, 1300, 1000, 900,
				900, 900, 900, 1300, 800, 3000, 1200, 1100, 1300, 2100, 800, 1300, 1200, 1200, 1300 };
		// 정수형 배열 k17_price를 생성하고 안에 값들을 저장해줍니다.  
		
		int[] k17_num = new int[] { 10, 12, 14, 21, 22, 1, 3, 2, 1, 2, 2, 1, 3, 2, 3, 2, 1, 3, 4, 2, 3, 1, 3, 2, 1, 1, 2, 2, 2,
				1 }; // 정수형 배열 k17_num을 생성하고 안에 값들을 저장해줍니다. 

		boolean[] k17_taxfree = new boolean[] 
				{ false, false, false, false, false, false, false, true, true, false, true,
						false, true, true, true, true, false, false, false, true, false, true, false, false, true, false, true,
						true, true, false };
		// 부울 자료형 배열 k17_taxfree를 생성하고 안에 값들을 저장해줍니다. 
		
		DecimalFormat k17_df = new DecimalFormat("###,###,###,###,###"); // 콤마를 구하기 위한 식입니다.
		Calendar k17_cal = Calendar.getInstance(); // 실제 날짜, 시간을 구하기 위한 식입니다. 
		SimpleDateFormat k17_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm"); // 실제 날짜, 시간을 원하는 방식으로 지정하는 식입니다. 
		System.out.printf("%9s%25s\n%29s\n%28s\n", "emart", "이마트 죽전점 (031)888-1234", "206-86-50913 강희석", // 문자를 출력해줍니다. 
				"용인 수지구 포은대로 552");
		System.out.printf("%s\n", "영수증 미지참시 교환/환불 불가"); // 문자를 출력합니다. 
		System.out.printf("%s\n", "정상상품에 한함, 30일이내(신선 7일)"); // 문자를 출력합니다. 
		System.out.printf("%s\n", "※일부 브랜드매장 제외(매장 고지물참조)"); // 문자를 출력합니다. 
		System.out.printf("%s\n", "교환/환불 구매점에서 가능(결제카드 지참)"); // 문자를 출력합니다. 
		System.out.printf("\n"); // 줄을 바꿔줍니다. 
		System.out.printf("%s%18s\n", "[구매]" + k17_sdt.format(k17_cal.getTime()), "POS:0011-9861"); 
		// k17_sdt.format(k17_cal.getTime())를 통해 실제 날짜와 시간을 구해줍니다. 
		System.out.printf("----------------------------------------\n"); // -- 를 출력해줍니다. 
		System.out.printf("%7s%13s%3s%8s\n", "상 품 명", "단  가", "수량", "금  액"); // 문자열들을 출력해줍니다. 
		System.out.printf("----------------------------------------\n"); // -- 를 출력해줍니다. 

		//System.out.println(k17_itemname[0].getBytes("euc-kr").length);
		
		for (int k17_i = 0; k17_i < k17_itemname.length; k17_i++) {
			if (k17_taxfree[k17_i] == true) { // 이 조건문은 면세상품일때 *를 출력해주기 위한 조건문입니다. 
				System.out.printf("* %s%9s %2d%11s\n", nameChange(k17_itemname[k17_i], 15), k17_df.format(k17_price[k17_i]), k17_num[k17_i],
									k17_df.format(k17_price[k17_i] * k17_num[k17_i]));
			} else if (k17_taxfree[k17_i] == false) { // 만약 부울 자료형 배열에서 false인 값들은 
				System.out.printf("  %s%9s %2d%11s\n", nameChange(k17_itemname[k17_i], 15), k17_df.format(k17_price[k17_i]), k17_num[k17_i],
						k17_df.format(k17_price[k17_i] * k17_num[k17_i]));
				// System.out.printf("%s%5s%5s%10s\n", k17_itemname[k17_i], k17_df.format(k17_price[k17_i]), k17_num[k17_i],
				// k17_df.format(k17_price[k17_i] * k17_num[k17_i]));	
				// 그렇게 부울 자료형 배열에서 true인 값들은 *를 포함한채 출력되게 합니다. 
				// *값 대신 공백을 넣어 출력하게끔 해줍니다. 
			}
			if ((k17_i + 1) % 5 == 0) { // 그리고 마지막으로 다섯개의 상품 기준으로 -- 를 출력하기 위해 (k17_i + 1) % 5 한값이 0과 같을때   
				System.out.printf("----------------------------------------\n"); // ---를 출력해줍니다. 
			}
		}
		
		
		int k17_total_num = 0; // 정수형 변수 k17_total_num 를 정의하고 0으로 초기화합니다. 
		for (int k17_i = 0; k17_i < k17_itemname.length; k17_i++) { // for 문을 돌려 모든 상품, 즉 30개의 상품 전부 돌아가게 합니다. 
			k17_total_num =  k17_itemname.length; // k17_total_num 총수량 변수 안에 수량들을 계속해서 더해줍니다. 
		}
		System.out.printf("\n%22s%13d\n", "총 품목 수량", k17_total_num); // 그리고 이러한 값들을 출력해줍니다. 

		int k17_total_taxfree = 0; // 정수형 변수 k17_total_taxfree를 정의하고 0으로 초기화해줍니다. 
		int k17_total_nontaxfree = 0; // 정수형 변수 k17_total_nontaxfree를 정의하고 0으로 초기화해줍니다. 
		for (int k17_i = 0; k17_i < k17_itemname.length; k17_i++) { // 마찬가지로 for문을 돌려 모든 상품(30개) 전부 돌 수 있도록 반복해줍니다. 
			if (k17_taxfree[k17_i] == true) { // 만약 면세상품일경우에
				k17_total_taxfree = k17_total_taxfree + (k17_price[k17_i] * k17_num[k17_i]); // k17_total_taxfree 안에 면세상품들의 가격들을 더해준뒤 총 가격을 저장해줍니다.  
			} else { // 만약 면세상품이 아닐 경우에는 
				k17_total_nontaxfree = k17_total_nontaxfree + (k17_price[k17_i] * k17_num[k17_i]); 
				// k17_total_nontaxfree 안에 과세상품들의 가격들을 더해준뒤 총 가격을저장해줍니다. 
			}
		}
		double k17_tax_rate = 0.1; // 실수형 변수 k17_tax_rate을 정의해주고 0.1을 저장해줍니다. 
		int k17_nontaxnetprice = (int) ((k17_total_nontaxfree * 10.0) / ((1 + k17_tax_rate) * 10.0)); 
		// 정수형 변수 k17_nontaxnetprice 를 정의하고 소수점을 올림하기위해 정수형으로 받고 세전가격을 계산해서 저장해줍니다.  
		int k17_tax = k17_total_nontaxfree - k17_nontaxnetprice;  
		// 정수형 변수 k17_tax를 정의해주고 안에 세후가격 - 세전가격의 값을 구해 부가세를 구해줍니다.  
		
		System.out.printf("%23s%13s\n", "(*)면 세  물 품", k17_df.format(k17_total_taxfree)); //k17_df.format을 통해 콤마를 찍어주고 면세 총 가격값을 출력해줍니다.  
		System.out.printf("%23s%13s\n", "과 세  물 품", k17_df.format(k17_nontaxnetprice)); //k17_df.format을 통해 콤마를 찍어주고 세전 총 가격 값을 출력해줍니다. 
		System.out.printf("%24s%13s\n", "부   가   세", k17_df.format(k17_tax)); // 부가세의 값을 출력해줍니다. 

		int k17_total_price = 0; // 정수형 변수 k17_total_price을 정의해주고 0으로 초기화해줍니다. 
		k17_total_price = k17_total_taxfree + k17_total_nontaxfree;
		// k17_total_price 안에 모든 변수들의 더한 값을 저장해줍니다. 
		System.out.printf("%25s%13s\n", "합        계", k17_df.format(k17_total_price)); // 콤마를 찍고 변수들을 출력해줍니다. 
		System.out.printf("%s%23s\n", "결 제 대 상 금 액", k17_df.format(k17_total_price)); // 콤마를 찍고 변수들을 출력해줍니다. 
		System.out.printf("----------------------------------------\n"); // -- 를 출력해줍니다. 
		System.out.printf("%s%27s\n", "0012 KEB 하나", "541707**0484/35860658"); // 문자들을 출력합니다. 
		System.out.printf("%s%25s\n", "카드결제(IC)", "일시불 / " + k17_df.format(k17_total_price)); // 변수와 문자들을 출력해줍니다. 
		System.out.printf("----------------------------------------\n"); // -- 를 출력해줍니다. 
		System.out.printf("%22s\n", "[신세계포인트 적립]"); // 문자를 출력해줍니다. 
		System.out.printf("%s\n", "송*석 고객님의 포인트 현황입니다."); // 문자를 출력해줍니다. 
		System.out.printf("%s%18s%8s\n", "금회발생포인트", "9350**9995", "164"); // 문자들을 출력해줍니다. 
		System.out.printf("%s%16s%8s\n", "누계(가용)포인트", "5,637(", "5,473)"); // 문자들을 출력해줍니다.
		System.out.printf("%s\n", "*신세계포인트 유효기간은 2년입니다."); // 문자를 출력해줍니다. 
		System.out.printf("----------------------------------------\n"); // --를 출력해줍니다. 
		System.out.printf("%21s\n", "구매금액기준 무료주차시간 자동부여"); // 문자들을 출력해줍니다. 
		System.out.printf("%s%28s\n", "차량번호 : ", "34저****"); // 문자들을 출력해줍니다. 
		SimpleDateFormat k17_sdt1 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); 
		// 여기에서 다시한번 날짜형식을 지정해주는 이유는 앞서 있던 날짜형식과 현재 하는 날짜 형식이 다르기때문입니다. 
		System.out.printf("%s%29s\n", "입차시간 : ", k17_sdt1.format(k17_cal.getTime())); // 형식을 바꾼 날짜를 출력해줍니다. 
		System.out.printf("----------------------------------------\n"); // -- 를 출력합니다. 
		System.out.printf("%s%24s\n", "캐셔:084599 양00", "1150"); // 문자를 출력해줍니다. 
		System.out.printf("%38s\n", "|||||||||||||||||||||||||||||||||||"); // 바코드를 출력해줍니다. 
		SimpleDateFormat k17_sdt2 = new SimpleDateFormat("YYYYMMdd"); // 또다른 형식의 날짜 형식입니다. 
		System.out.printf("%35s", k17_sdt2.format(k17_cal.getTime()) + "/00119861/00164980/31"); // 다른 날짜 형식을 출력해줍니다. 
	}
}
