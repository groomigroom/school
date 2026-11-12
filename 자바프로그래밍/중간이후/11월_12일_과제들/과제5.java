package groomis;

class DonutInformation {
	static String phoneNumber = "010-0200-0200-0200";
	static void callShop() {
		System.out.println(phoneNumber + "로 전화하세요");
	}
}

public class ForJavaStudy1 {
	static int i = 1;
	static int iii = 2;
	static int iiii = 3;
	int groomi(int i, int iii) {
		return i+iii;
	}
	
	public static void main(String[] args) {
		DonutInformation.callShop();
		//이 코드의 동작원리?
	}

}
