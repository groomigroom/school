package groomis;

class Calculator {
	static int add(int a, int b) {
		return a+b;
	}
}

public class MainTest {

	public static void main(String[] args) {
		int result = Calculator.add(10, 222);
		int result3 = Calculator.add(1, 22);
		
		System.out.println(result + " " + result3);
		//출력값이 왜 이런가?
	}

}
