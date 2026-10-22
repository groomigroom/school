class Donut {
	int 도넛의가격;
	double price;
	
	Donut(){
		System.out.println("도넛 객체가 생성되었습니다.!!!");
		도넛의가격 = 3000;
	}
	Donut(int 도넛가게주소){
		System.out.println("\n도넛 많이 사주세요");
		도넛의가격 = 도넛가게주소;
	}
	Donut(double price) {
		this.price = price;
	}
	
	public void show() {
		System.out.println(도넛의가격 + "원입니다.");
	}
	public void Doubleshow(double price2) {
		System.out.println(price + "원입니다.\n\n\n\n" + price2);
	}
}

public class MainPart {

	public static void main(String[] args) {
		System.out.println("김구름이");
		String 생성자와메서드 = "중간고사 이후에 첫번째 시간입니다.\n";
		생성자와메서드 += "생성자는 클래스 이름과 똑같은 메서드다!!\n";
		생성자와메서드 += "생성자를 따로 정의하지 않으면 내부적으로 사용되는 방식으로 사용됨\n";
		생성자와메서드 += "생성자는 조금전에 말씀 드린 것과 같이 클래스의 이름과 같다\n";
		생성자와메서드 += "오늘도 나오는 도넛 메서드 class Dounut\n";
		생성자와메서드 += "생성자 안에서 초기화를 시켜주면 훨씬 더 편리하게 사용할 수 있다...\n";
		생성자와메서드 += "Dount d1 = new Donut(); 이런식으로 객체 생성\n";
		생성자와메서드 += "이건 외울 필요없이 그냥 많이 해보는게 좋은 것 같습니다..\n";
		생성자와메서드 += "생성자와 this의 이해\n";
		생성자와메서드 += "생성자를 호출하면 객체가 만들어지며 객체의 주소는 참조 변수에 저장됩니다.!!!!!!!\n";
		생성자와메서드 += "메서드 안에서 new 연산자로 호출함 생성자는 클래스 이름과 동일함. 클래스 이름을 대문자232323\n";
		생성자와메서드 += "생성자는 1번만 호출됨. 그 이후에는 호출 불가함 다시 호출하려면 객체이름을 아에 바꿔서 호출해야 함.\n";
		생성자와메서드 += "클래스는 붕어빵 틀 형태이다.\n";
		생성자와메서드 += "기본 생성자는 자동으로 만들어주는 거 자바 컴파일러가 이렇게 함...\n";
		생성자와메서드 += "void show()이렇게 되어있는데,, 봤는지 안봤는지 헷갈려요.,.....,.,.,.,.,.,.\n";
		생성자와메서드 += "기본적으로생성자는클래스이름과 같은 형식으로 만들어지고, 미리 선언해 두면 메인 메서드 등에서 불러서 쓸 수 있음.\n";
		
		Donut d1 = new Donut();
		d1.도넛의가격 = 120000;
		d1.show();
		생성자와메서드 += "생성자 안에다가 매개변수를 줘서 여러가지로 만들 수 있다. 즐겁게/...;/./\n";
		생성자와메서드 += "생성자가 이제 2개가 될겁니다.\n";
		Donut dTeul = new Donut(200);
		dTeul.show();
		Donut dTeulDoubleshow = new Donut(200.222);
		dTeul.Doubleshow(3.14159);
		생성자와메서드 += "\n";
		생성자와메서드 += "\n";
		System.out.println(생성자와메서드);
	}

}
