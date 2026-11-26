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
	
	public void buy() {
		System.out.println("도넛 이름은 " + donutName + " - " + "가격은 " + donutPrice + "입니다. 입금해 주세요");
	}
}

public class MainHomeWork {

	public static void main(String[] args) {
		//객체 배열이란 무엇인가?
		Donut[] donuts = new Donut[3];
		donuts[0] = new Donut("구름모양 도넛", 2000);
		donuts[1] = new Donut("단무지 도넛", 3000);
		donuts[2] = new Donut("단맛 도넛", 4000);
		
		donuts[0].show();
		donuts[1].buy();
		donuts[2].show();
		
		for (int i = 0; i < donuts.length; i++) {
			donuts[i].show();
		}
	}

}
