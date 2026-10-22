class Chocolate {
	String kind;
	int price;
	String taste;
	
	Chocolate(String kind){
		this.kind = kind;
	}
	
	Chocolate(String kind, int price){
		this.kind = kind;
		this.price = price;
	}
	
	Chocolate(String kind, int price, String taste){
		this.kind = kind;
		this.price = price;
		this.taste = taste;
	}
	
	public void show(String kind) {
		System.out.println("<출력 결과>");
		System.out.println(kind);
	}
	
	public void show(String kind, int price) {
		System.out.println("<출력 결과>");
		System.out.println(kind + ", 가격: " + price + "원");
	}
	
	public void show(String kind, int price, String taste) {
		System.out.println("<출력 결과>");
		System.out.println(kind + ", 가격: " + price + "원, 맛: " + taste);
	}
	
}

public class Overloading2 {

	public static void main(String[] args) {
		Chocolate chocolate1 = new Chocolate("맛있는 초콜릿");
		chocolate1.show(chocolate1.kind);
		Chocolate chocolate2 = new Chocolate("맛있는 초콜릿2", 1000);
		chocolate2.show(chocolate2.kind, chocolate2.price);
		Chocolate chocolate3 = new Chocolate("맛있는 초콜릿3", 1000, "쓴맛");
		chocolate3.show(chocolate3.kind, chocolate3.price, chocolate3.taste);
	}

}
