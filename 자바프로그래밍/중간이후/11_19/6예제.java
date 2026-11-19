package groomigroom;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionSet {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("첫번째 숫자 입력");
			int oneNumber = sc.nextInt();
			System.out.println("연산자 입력");
			String oper = sc.next();
			System.out.println("두번째 숫자 입력");
			int twoNumber = sc.nextInt();
			
			if (oper.charAt(0) == '+') {
				int plus = oneNumber + twoNumber;
				System.out.println(oneNumber + " + " + twoNumber + " = " + plus);
			} else if (oper.charAt(0) == '-') {
				int minus = oneNumber - twoNumber;
				System.out.println(oneNumber + " - " + twoNumber + " = " + minus);
			} else if (oper.charAt(0) == '*') {
				int gop = oneNumber * twoNumber;
				System.out.println(oneNumber + " * " + twoNumber + " = " + gop);
			} else if (oper.charAt(0) == '/') {
				if (twoNumber == 0) {
					throw new ArithmeticException("/ by zero");
				}
				
				double divide = (double)oneNumber / twoNumber;
				System.out.println(oneNumber + " / " + twoNumber + " = " + divide);
			}
		} catch(ArithmeticException e) {
			System.out.println("연산 오류 발생" + e.getMessage());
		} catch(InputMismatchException e) {
			System.out.println("정확한 입력값이 아닙니다." + e.getMessage());
		}
		
		
	}

}
