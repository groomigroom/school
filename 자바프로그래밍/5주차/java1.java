package nine17pro1;

import java.util.*;

public class SwitchCase1 {

	public static void main(String[] args) {
		int a = 22;
		switch(a / 22 + 1 - 1 + 1 - 1 + 1 - 1 + 1) {
			case 1:
				System.out.println("1이다.");
				break;
			case 2:
				System.out.println("22다.");
			case 3:
				System.out.println("자료형");
				break;
			case 4:
				System.out.print("프린트");
				break;
				
			default:
				System.out.println("크림");
		}
		String b = "구름이 간식";
		switch(b) {
		case "구름이 간식":
			System.out.println("구름이에게 간식을 주세요");
		case "구우름이 가안식":
			System.out.println("구름이에게 간식을 주세요22");
		case "간식":
			System.out.println("구름이에게 간식을 주세요33");
			break;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 9까지의 숫자 중 하나 입력하시오");
		int d = sc.nextInt();
		switch(d) {
		case 9:
			System.out.print("999990999099900");
			break;
		case 8:
			System.out.print("999990922299099900");
		case 7:
			System.out.print("222212121212121212121");
		case 6:
			System.out.print("2222121232424241212121212121");
		default:
			System.out.println("32940290492042");	
		}
		System.out.print("주문 받겠습니다.");
		String de = sc.next();
		int plus_price = 10000;
		switch(de) {
		case "과자":
			System.out.print("10000원 일단 입금하세요\n");
			plus_price += 20000;
		case "빵":
			System.out.print("20000원 일단 입금하세요\n");
			plus_price += 30000;
			break;
		case "김밥":
			System.out.print("40000원 일단 입금하세요\n");
			plus_price += 40000;
		}
		System.out.println("추가 금액은 " + plus_price + "원이다.");
		System.out.print("세트 메뉴 선택하기 1. 2. 3.");
		int setmenu = sc.nextInt();
		switch(setmenu) {
		case 1:
			System.out.println("단무지");
		}
		double randomValue = Math.random();
		int randomInt = (int)(Math.random() * 10); //0에서 9 이하의 무작위 수
		System.out.println("실수" + randomValue + "정수" + randomInt);
		sc.close();
	}

}
