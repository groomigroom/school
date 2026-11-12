package groomis;

class DonutInformation {
	int donutSellingCount;
	DonutInformation(int donutSellingCount) {
		this.donutSellingCount = donutSellingCount;
	}
	void donutShowCount() {
		System.out.println(donutSellingCount + "회 판매 완료............");
	}
}
class DoonutInnformationn {
	static String phoneNumber = "010-0200-0200-02001";
	static void callShop() {
		System.out.println(phoneNumber + "로 전화하세요");
	}
}

public class ForJavaStudy1 {

	public static void main(String[] args) {
		DonutInformation doooooonuuuuut = new DonutInformation(10);
		doooooonuuuuut.donutShowCount();
		DoonutInnformationn.callShop();
		//출력값이 왜 이런지 서술하시오..
	}

}
