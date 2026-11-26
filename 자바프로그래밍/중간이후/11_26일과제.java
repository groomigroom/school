package homework;

class Donut {
	private String donutName;
	private int donutPrice;
	
	Donut (String donutName, int donutPrice) {
		this.donutName = donutName;
		this.donutPrice = donutPrice;
	}
	
	public void show() {
		System.out.println("도넛 이름은 " + donutName + " - " + "가격은 " + donutPrice);
	}
	
	public void sellingUp() {
		donutPrice += 30000;
		System.out.println("도넛 이름은 " + donutName + " - " + "가격은 " + donutPrice + "입니다. 입금해 주세요");
	}
}

public class MainHomeWork {

	public static void main(String[] args) {
		//객체 배열이란 무엇인가?
		Donut[] donuts = new Donut[9];
		donuts[0] = new Donut("구름모양 도넛", 2000);
		donuts[1] = new Donut("단무지 도넛", 3000);
		donuts[2] = new Donut("단맛 도넛", 4000);
		donuts[3] = new Donut("사은품 도넛", 5000);
		donuts[4] = new Donut("민트초코 도넛", 77000);
		donuts[5] = new Donut("얼음 도넛", 44000);
		donuts[6] = new Donut("호떡 도넛", 1000);
		donuts[7] = new Donut("java 도넛", 4000);
		donuts[8] = new Donut("수능 할인 도넛", 111000);
		
		donuts[0].show();
		donuts[1].show();
		donuts[1].sellingUp();
		donuts[2].show();
		donuts[1].sellingUp();
		donuts[3].show();
		donuts[4].show();
		donuts[5].show();
		donuts[6].show();
		donuts[7].show();
		donuts[8].show();
		System.out.println();
		for (int i = 0; i < donuts.length; i++) {
			donuts[i].show();
		}
	}

}
