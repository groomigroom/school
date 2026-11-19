package groomigroom;

import java.util.Scanner;

public class CafeException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String[] menus = {"커피", "도넛", "비스킷"};
			int[] prices = {4000, 5000, 6000};
			
			System.out.println("숫자로 메뉴를 선택해 주세요. 1. 커피, 2. 도넛, 3. 비스킷");
			int menu_input = sc.nextInt();
			
			System.out.println("구매하실 개수를 입력해 주세요");
			int count_input = sc.nextInt(); // 개수 변수명 직관적으로 변경
			
			// 입력값에서 1을 빼서 배열 인덱스로 접근 (범위를 벗어나면 ArrayIndexOutOfBoundsException 발생)
			int index = menu_input - 1;
			String selectedMenu = menus[index];
			int selectedPrice = prices[index];
			
			if (count_input >= 1) {
				System.out.println(selectedMenu + "를 " + count_input + "개 주문 하셨습니다.\n"
						+ "총 결제 금액은 " + (selectedPrice * count_input) + "원입니다.");
			} else {
				// 0 이하(0 또는 음수) 입력 시 예외 발생
				throw new IllegalArgumentException("1개 이상 구매해야 합니다.");
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("메뉴 번호가 정확하지 않습니다. " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("정확한 입력값이 아닙니다. " + e.getMessage());
		} finally {
			System.out.println("카페 이용해 주셔서 감사합니다.");
		}
		
		sc.close();
	}
}
