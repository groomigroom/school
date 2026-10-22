class Donut {
	int 도넛의가격;
	double price;
	int 도넛의모양;
	int 도넛의생김새의번호;
	int 도넛분류번호;
	int 도넛소개긃번호;
	int 도넛물류창고위치주소값;
	int 도넛의모든정보를다담은값;
	int 매개변수가하나더추가된생성자의도넛값;
	double 매개변수가하나더추가된생성자의도넛값last;
	
	Donut(){
		//여기서 아무 내용도 없으면 기본 생성자입니다. 컴파일러가 자동으로 추가해 주는거입니다.
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
	Donut(double price, int 도넛의가격, int 도넛의모양, int 도넛의생김새의번호, int 도넛분류번호, int 도넛소개긃번호, int 도넛물류창고위치주소값,
			int 도넛의모든정보를다담은값) {
		this.price = price;
		this.도넛의가격 = 도넛의가격;
		this.도넛의모양 = 도넛의모양;
		this.도넛의생김새의번호 = 도넛의생김새의번호;
		this.도넛분류번호 = 도넛분류번호;
		this.도넛소개긃번호 = 도넛소개긃번호;
		this.도넛물류창고위치주소값 = 도넛물류창고위치주소값;
		this.도넛의모든정보를다담은값 = 도넛의모든정보를다담은값;
	}
	Donut(double price, int 도넛의가격, int 도넛의모양, int 도넛의생김새의번호, int 도넛분류번호, int 도넛소개긃번호, int 도넛물류창고위치주소값,
			int 도넛의모든정보를다담은값, int 매개변수가하나더추가된생성자의도넛값) {
		this.price = price;
		this.도넛의가격 = 도넛의가격;
		this.도넛의모양 = 도넛의모양;
		this.도넛의생김새의번호 = 도넛의생김새의번호;
		this.도넛분류번호 = 도넛분류번호;
		this.도넛소개긃번호 = 도넛소개긃번호;
		this.도넛물류창고위치주소값 = 도넛물류창고위치주소값;
		this.도넛의모든정보를다담은값 = 도넛의모든정보를다담은값;
		this.매개변수가하나더추가된생성자의도넛값 = 매개변수가하나더추가된생성자의도넛값;
	}
	Donut(double price, int 도넛의가격, int 도넛의모양, int 도넛의생김새의번호, int 도넛분류번호, int 도넛소개긃번호, int 도넛물류창고위치주소값,
			int 도넛의모든정보를다담은값, int 매개변수가하나더추가된생성자의도넛값, double 매개변수가하나더추가된생성자의도넛값last) {
		this.price = price;
		this.도넛의가격 = 도넛의가격;
		this.도넛의모양 = 도넛의모양;
		this.도넛의생김새의번호 = 도넛의생김새의번호;
		this.도넛분류번호 = 도넛분류번호;
		this.도넛소개긃번호 = 도넛소개긃번호;
		this.도넛물류창고위치주소값 = 도넛물류창고위치주소값;
		this.도넛의모든정보를다담은값 = 도넛의모든정보를다담은값;
		this.매개변수가하나더추가된생성자의도넛값 = 매개변수가하나더추가된생성자의도넛값;
		this.매개변수가하나더추가된생성자의도넛값last = 매개변수가하나더추가된생성자의도넛값last;
	}
	
	public void show() {
		System.out.println(도넛의가격 + "원입니다.");
	}
	public void doubleshow(double price2) {
		System.out.println(price + "원입니다.\n\n\n\n" + price2);
	}
	public void donut의모든정보를많이보여주는거() {
		System.out.println("<도넛의 모든 정보입니다.>\n" +
				price + " price\n" +
		도넛의가격 + " 도넛의가격\n" +
		도넛의모양 + " 도넛의모양\n" +
		도넛의생김새의번호 + " 도넛의생김새의번호\n" +
		도넛분류번호 + " 도넛분류번호\n" +
		도넛소개긃번호 + " 도넛소개긃번호\n" +
		도넛물류창고위치주소값 + " 도넛물류창고위치주소값\n" + 
		도넛의모든정보를다담은값 + " 도넛의모든정보를다담은값\n" + "\n\n\n\n");
	}
	public void donut의모든정보를많이보여주는거2222() {
		System.out.println("<" + 매개변수가하나더추가된생성자의도넛값 + "도넛의 모든 정보입니다.>\n" +
				price + " price\n" +
		도넛의가격 + " 도넛의가격\n" +
		도넛의모양 + " 도넛의모양\n" +
		도넛의생김새의번호 + " 도넛의생김새의번호\n" +
		도넛분류번호 + " 도넛분류번호\n" +
		도넛소개긃번호 + " 도넛소개긃번호\n" +
		도넛물류창고위치주소값 + " 도넛물류창고위치주소값\n" + 
		도넛의모든정보를다담은값 + " 도넛의모든정보를다담은값\n" +
		매개변수가하나더추가된생성자의도넛값 + " 매개변수가하나더추가된생성자의도넛값" + "\n" + 
		매개변수가하나더추가된생성자의도넛값 + "매개변수가하나더추가된생성자의도넛값 매개변수가하나더추가된생성자의도넛값 매개변수가하나더추가된생성자의도넛값" + "\n\n\n\n");
	}
	public void donut의모든정보를많이보여주는거2222333() {
		System.out.println("<" + 매개변수가하나더추가된생성자의도넛값last + "last 정보 포함 도넛의 모든 정보입니다." + 매개변수가하나더추가된생성자의도넛값last + ">\n" +
				price + " price\n" +
				도넛의가격 + " 도넛의가격\n" +
				도넛의모양 + " 도넛의모양\n" +
				도넛의생김새의번호 + " 도넛의생김새의번호\n" +
				도넛분류번호 + " 도넛분류번호\n" +
				도넛소개긃번호 + " 도넛소개긃번호\n" +
				도넛물류창고위치주소값 + " 도넛물류창고위치주소값\n" + 
				도넛의모든정보를다담은값 + " 도넛의모든정보를다담은값\n" +
				매개변수가하나더추가된생성자의도넛값 + " 매개변수가하나더추가된생성자의도넛값" + "\n" + 
				매개변수가하나더추가된생성자의도넛값 + "매개변수가하나더추가된생성자의도넛값 매개변수가하나더추가된생성자의도넛값 매개변수가하나더추가된생성자의도넛값" + "\n\n\n\n");
	}
}

class KindDonut {
	String donutName;
	int donutPrice;
	
	//this를 사용하는 기본 생성자
	KindDonut(){
		this("기본적인 도넛", 2000);
		//이런 this는 쓸거면 가장 첫줄에 써야 된다.
		System.out.println("친절하게 도넛을 만들게요");
	}
	KindDonut(String donutName, int donutPrice){
		this.donutName = donutName;
		this.donutPrice = donutPrice;
	}
	
	public void showOnKindDonut(int things) {
		System.out.println("\n<정말 친절한 도넛 가게 최종 가격>\n" + (things * donutPrice) + "원의 " 
	+ donutName + "이다.\n" + "<정말 친절한 도넛 가게 최종 가격>\n");
	}
}

class ReallyRealKindDonut {
	String kindRealDonutName;
	ReallyRealKindDonut() {
		this("정말 친절하게 만든 도넛");
	}
	ReallyRealKindDonut(String kindRealDonutName) {
		this.kindRealDonutName = kindRealDonutName;
	}
	public void showReallyRealKindDonut() {
		System.out.println("\n안녕하세요 고객님 정말정말 친절한 도넛입니다.");
		System.out.println("final은 상수입니다. 안녕하세요 고객님 정말정말 친절한 도넛입니다.");
		System.out.println("\n안녕하세요 고객님 정말정말 친절한 도넛입니다.");
		System.out.println("final은 상수입니다. 안녕하세요 고객님 정말정말 친절한 도넛입니다.");
		System.out.println("\n안녕하세요 고객님 정말정말 친절한 도넛입니다.");
		System.out.println("final은 상수입니다. 안녕하세요 고객님 정말정말 친절한 도넛입니다.");
		System.out.println("\n안녕하세요 고객님 정말정말 친절한 도넛입니다.");
		System.out.println("final은 상수입니다. 안녕하세요 고객님 정말정말 친절한 도넛입니다.");
		System.out.println(kindRealDonutName);
		System.out.println(kindRealDonutName);
		System.out.println(kindRealDonutName);
		System.out.println(kindRealDonutName);
		System.out.println(kindRealDonutName);
		System.out.println(kindRealDonutName);
		System.out.println(kindRealDonutName);
		System.out.println(kindRealDonutName);
		System.out.println(kindRealDonutName);
	}
}

class RealMenuHaksikNONONOHakSikHakSikIsSoExpensiveSOSoExpensiveExpensive{
	int realHaksik;
	int price;
	String menuRealMenu;
	int foodLocalLiteMenuNumber;
	
	RealMenuHaksikNONONOHakSikHakSikIsSoExpensiveSOSoExpensiveExpensive(int realHaksik, int price) {
		this.realHaksik = realHaksik;
		this.price = price;
	}
}

public class MainPart {
	//이거 새로운거
	static class Restaurant {
		String name;
		int basePrice, deliveryFee, totalCost;
		Restaurant(String name, int basePrice) {
			this(name, basePrice, 0);
		}
		Restaurant(String name, int basePrice, int deliveryFee) {
			this.name = name;
			this.basePrice = basePrice;
			this.deliveryFee = deliveryFee;
			this.totalCost = basePrice + deliveryFee;
		}
		void printShow() {
			System.out.println("[" + name + "]" );
			System.out.println("가격: " + basePrice + "원" );
			System.out.println("배달료: " + deliveryFee + "원" );
			System.out.println("총 결제 금액: " + totalCost + "원\n" );
			System.out.println("감사합니다. 고객님 또 이용해 주십시오..232" );
			System.out.println("감사합니다. 고객님 또 이용해 주십시오..232" );
			System.out.println("감사합니다. 고객님 또 이용해 주십시오..232" );
			System.out.println("감사합니다. 고객님 또 이용해 주십시오..232" );
			System.out.println("감사합니다. 고객님 또 이용해 주십시오..232" );
			System.out.println("감사합니다. 고객님 또 이용해 주십시오..232" );
			System.out.println("감사합니다. 고객님 또 이용해 주십시오..232" );
		}
	}
	
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
		dTeulDoubleshow.doubleshow(3.14159);
		
		Donut 도넛의물류창고정보포함 = new Donut(3.4145, 2323, 24242, 334455, 34534, 12, 13245, 3434);
		도넛의물류창고정보포함.donut의모든정보를많이보여주는거();
		
		Donut 도넛의물류창고정보포22함 = new Donut(3.4145, 2323, 24242, 334455, 34534, 12, 13245, 3434, 333);
		도넛의물류창고정보포22함.donut의모든정보를많이보여주는거2222();
		도넛의물류창고정보포22함.매개변수가하나더추가된생성자의도넛값 += 2;
		도넛의물류창고정보포22함.donut의모든정보를많이보여주는거2222();
		도넛의물류창고정보포22함.매개변수가하나더추가된생성자의도넛값 += 2333;
		도넛의물류창고정보포22함.donut의모든정보를많이보여주는거2222();
		//이제 더 공부해 볼까요??
		//
		도넛의물류창고정보포22함.매개변수가하나더추가된생성자의도넛값 -= 33;
		도넛의물류창고정보포22함.donut의모든정보를많이보여주는거2222();
		Donut 도넛의물류창고정보포22함33 = new Donut(3.4145, 2323, 24242, 334455, 34534, 12, 13245, 3434, 333, 3.11);
		도넛의물류창고정보포22함33.donut의모든정보를많이보여주는거2222333();
		생성자와메서드 += "private public protected 이런게 접근 지정자\n";
		생성자와메서드 += "클래스를 생성하는거는 알겠는데...\n";
		생성자와메서드 += "공부합시다...\n";
		생성자와메서드 += "생성자는 내가 만들지 않더라도 기본적으로 생기는데, 생성자를 만들게 되면 기본 생성자는 자동으로 생성되지 않음..\n";
		생성자와메서드 += "Donut(int p) {price = p;} 이런식으로 생성자 만들어 놓고\n";
		생성자와메서드 += "Donut d1 = new Donut(); 이렇게 기본 생성자 부르는 방식으로 하면 에러 뜸.\n";
		생성자와메서드 += "this 예약어는 객체 자기 자신을 가리키는 참조 변수이다. this 메서드도 있다....\n";
		생성자와메서드 += "예시로 class Donut\n";
		생성자와메서드 += "int price;\n";
		생성자와메서드 += "Donut(int price) {\n";
		생성자와메서드 += "this.price = price;\n";
		생성자와메서드 += "}\n";
		KindDonut veryKindDonut = new KindDonut();
		veryKindDonut.showOnKindDonut(22);
		KindDonut veryKindDonut222 = new KindDonut("맛없는 도넛", 223);
		veryKindDonut222.showOnKindDonut(221);
		ReallyRealKindDonut veryveryverdonut = new ReallyRealKindDonut();
		veryveryverdonut.showReallyRealKindDonut();
		ReallyRealKindDonut veryveryverdonutontheteul = new ReallyRealKindDonut("좋은 원재료를 사용해서 만든 도넛");
		veryveryverdonutontheteul.showReallyRealKindDonut();
		생성자와메서드 += "메서드는 항상 클래스 내부에 있어야 한다..\n";
		생성자와메서드 += "만약 여기에 return이 없다. 그러면 void를 써야 됩니다.!!!!!!!!\n";
		생성자와메서드 += "반환하는 값이 정수이면 int function(){} 이런식으로\n";
		생성자와메서드 += "반환값이 정수배열 형태이면, int[] function() {} 이런식으로\n";
		생성자와메서드 += "메서드 이름은 숫자로 시작 불가이며, $와 _를 제외한 특수문자 사용 불가 그리고 카멜 표기법 사용,.,.,.,.,.\n";
		생성자와메서드 += "강제 형 변환 따로 봐보기\n";
		생성자와메서드 += "메서드는 객체가 생성된 후에 호출합니다.\n";
		생성자와메서드 += "메서드 오버로딩은 유지보수를 쉽게 할 수 있게 해줍니다.\n";
		생성자와메서드 += "참조 자료형은 클래스나 String이 해당됩니다. 주소값이 복사되어서 전달됩니다...\n";
		생성자와메서드 += "기본 자로형은 값 자체를 복사함. int double 등등이 있다. 정말 다양합니다.\n";
		생성자와메서드 += "참조 자료형은 메서드에서 수정을 하면 원본에 영향이 있음 String은 제외되고, 그런다...\n";
		Restaurant r1r2r3 = new Restaurant("구름이네 사료 가게", 12000, 2000);
		r1r2r3.printShow();
		Restaurant r1r2r3r4 = new Restaurant("구름이네 사료 가게22", 12002);
		r1r2r3r4.printShow();
		r1r2r3.printShow();
		r1r2r3r4.printShow();
		r1r2r3.printShow();
		r1r2r3r4.printShow();
		for (int i = 0; i < 10; i++) {
			System.out.println("주문 또 해주세요");
		}
		생성자와메서드 += "\n";
		생성자와메서드 += "\n";
		생성자와메서드 += "\n";
		System.out.println(생성자와메서드);
		System.out.println("문제 이 코드의 출력값의 공백 포함 글자수를 말씀해 주세요.");
	}

}
