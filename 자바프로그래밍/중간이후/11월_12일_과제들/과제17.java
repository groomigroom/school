package groomis;

import java.util.*;

public class Studyyy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] donutMenu = {"산뜻한 도넛", "맛없는 도넛", "식사용 도넛", ""};
		int[] donutPrice = {0, 200, 200, 20000};
		System.out.println("도넛 가격 입금 시스템");
		System.out.println("1: 산뜻 (0)");
		System.out.println("2: 맛없 (200)");
		System.out.println("3: 식사 (200)");
		System.out.println("4: 가게에 기부하기 (20000)");
		System.out.println("번호 입력하기");
		
		try {
			int menuNum = sc.nextInt();
			String donut = donutMenu[menuNum];
			int price = donutPrice[menuNum];
			System.out.println(donut + "을 선택함");
			System.out.println(price + "원 입금해 주세요");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("4번까지만");
		} catch (Exception e) {
			System.out.println("숫자만");
		} finally {
			System.out.println("돈을 더 입금해 주시면 감사하겠습니다.");
			sc.close();
		}
	}

}

//위 코드의 동작원리??????????????????????????????????????
