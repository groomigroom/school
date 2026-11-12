package groomis;

class DonutInformation {
	static String phoneNumber = "010-0200-0200-0200";
	static void callShop() {
		System.out.println(phoneNumber + "로 전화하세요");
	}
	static void donutSellingOn() {
		System.out.println(phoneNumber + "로 전화주시고 입금해 주세요");
	}
}
class DoonutInnformationn {
	static String phoneNumber = "010-0200-0200-02001";
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
		DoonutInnformationn.callShop();
		//2개의 출력값이 다른 이유?
	}

}
