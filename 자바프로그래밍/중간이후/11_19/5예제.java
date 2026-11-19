package groomigroom;

public class ExceptionClass {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int result = a/b;
			
			System.out.println(result);
			//이 코드가 오류가 뜨는 이유?
		} catch(ArithmeticException e) {
			System.out.println("연산 오류 발생" + e.getMessage());
		}
		System.out.println("프로그램 종료");
	}

}
//이 코드 설명하기
