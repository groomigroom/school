package CafeOrderPackage;

import java.util.*;

class Order {
	// 메뉴명, 단가, 수량은 매 주문마다 바뀔 수 있으므로 일단 보관하되, 
	// 최종 출력을 위해 누적 변수들을 관리합니다.
	private String menu;
	private int price;
	private int count;
	private int lastCount = 0;
	private int lastPrice = 0;
	
	// 초기 생성자
	Order() {
	}
	
	// 매 반복마다 새로운 메뉴 정보와 수량을 업데이트해주는 메서드
	void updateOrder(String menu, int price, int count) {
		this.menu = menu;
		this.price = price;
		this.count = count;
	}
	
	// 주문 금액 및 건수 누적 계산
	void calcOrder() {
		lastPrice += price * count;
		lastCount++;
		System.out.println("[주문 내역]");
		System.out.println(menu + " " + count + "잔 : " + (price * count) + "원");
	}
	
	// 최종 주문 정보 출력 (주문 종료 시 1번만 호출)
	void lastOrder () {
		System.out.println("\n==================");
		System.out.println("   최종 주문 결과 ");
		System.out.println("==================");
		System.out.println("총 주문 건수: " + lastCount + "건");
		System.out.println("총 결제 금액: " + lastPrice + "원");
		System.out.println("이용해 주셔서 감사합니다.");
	}
}

public class CafeOrder {

	public static void main(String[] args) {
		// Scanner는 반복문 밖에서 한 번만 생성합니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==================");
		System.out.println("   카페 주문 시스템 ");
		System.out.println("==================");

		// ⭐ 중요: 누적 데이터를 기억할 Order 객체를 while문 '밖'에서 생성합니다.
		Order totalOrder = new Order();
		int menuNumber = -1;
		
		while (menuNumber != 0) {
			System.out.println("\n[메뉴]");
			System.out.println("1. 아메리카노 - 3000원");
			System.out.println("2. 카페라테 - 3500원");
			System.out.println("3. 바닐라라테 - 4000원");
			System.out.println("0. 주문 종료");
			System.out.print("메뉴 번호를 선택하세요: ");
			menuNumber = sc.nextInt();
			
			// 0을 누르면 누적된 결과를 출력하고 while문을 완전히 빠져나갑니다.
			if (menuNumber == 0) {
				totalOrder.lastOrder(); // 💡 질문하신 최종 출력 함수 호출 위치
				break;
			}
			
			// 0, 1, 2, 3 외의 숫자가 들어왔을 때 예외 처리
			if (menuNumber < 0 || menuNumber > 3) {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;
			}
			
			System.out.print("주문 수량을 선택하세요: ");
			int orderCount = sc.nextInt();
			
			String selectedMenu = "";
			int selectedPrice = 0;
			
			// switch case 매칭하기
			switch (menuNumber) {
				case 1:
					selectedMenu = "아메리카노";
					selectedPrice = 3000;
					break;
				case 2:
					selectedMenu = "카페라테";
					selectedPrice = 3500;
					break;
				case 3:
					selectedMenu = "바닐라라테";
					selectedPrice = 4000;
					break;
			}
			
			// 밖에서 만든 객체에 이번에 입력받은 메뉴 정보를 업데이트하고 누적 계산
			totalOrder.updateOrder(selectedMenu, selectedPrice, orderCount);
			totalOrder.calcOrder();
		}
		
		sc.close(); 
	}
}
