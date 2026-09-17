package nine17pro1;

import java.util.*;

public class NumberPlus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("더할 숫자를 계속 입력하시오");
		int num = sc.nextInt();
		
		while(num != 0) {
			sum += num;
			System.out.println("현재 합계: " + sum);
			System.out.println("더할 숫자를 계속 입력하시오");
			num = sc.nextInt();
		}
		System.out.println("최종 합계: " + sum);
		sc.close();
	}

}
