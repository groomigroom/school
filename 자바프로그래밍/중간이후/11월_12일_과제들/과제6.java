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

public class ForJavaStudy1 {
	static int i = 1;
	static int iii = 2;
	static int iiii = 3;
	int groomi(int i, int iii) {
		return i+iii;
	}
	
	public static void main(String[] args) {
		DonutInformation.donutSellingOn();
		//출력에서 얼마를 입금하면 되는지도 보이게 수정해 주세요.
	}

}
