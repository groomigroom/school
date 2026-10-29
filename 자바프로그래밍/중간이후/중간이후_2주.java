//import sec01.exam01.DonutShop;

class 패키지 {
	String 패키지는서로관련된클래스들을 = "하나의 공간으로 묶은단위";
	String 클래스파링을논리적으론정리하고 = "관리하는 폴더 시스템";
	String 클래스이름충돌방지를위해서_패키지를사용한다 = "패키지를 통해서 접근 제어 가능";
	String 상위패키지와_하위패키지가있으면_점으로_구분함 = "내가 참조해야 할 클래스가 있다면 이렇게";
	String 패키지선언예시 = "package sec01.exam01";
	String 기본적으로패키지를안만들게되면프로젝트이름을줬던거로 = "클래스를 만들게 된다....";
	String 패키지를지정하고그아래에다가_하위패키지를_지정할_수가있다 = "워크스페이스라는 곳에서 설치되어지는 폴더";
	String 패키지_작성시_주의할점은_소문자로하는_것을추천함 = "패키지하고 뭐뭐 써줄 때는 맨 위에";
	String 다른_클래스_패키지 = "ctrl shift o 누르면 임포트할 거를 찾음";
	String 여러개를_한꺼번에_가져오고_싶을때는 = ".*로 나타내면 된다.. ";
	String 자바유틸리티안에있는_모든거를가져오는거는_별이다 = "뉴 패키지 선택해서 패키지를 새롭게 만들 수가 있는데,,";
	String 이클립스에서는_new_package_해서_만들수가있다 = "그 다음에 이제 접근 제한자";
	String 패키지화_시키는이유가뭐냐면 = "접근을 시켜야 하는 거랑 아닌거 등등으로 구분하는 거";
	String 허용범위넓은_순public = "protected default (생략) private";
}

class package22 {
	String private을쓰게되면_그_클래스안에서만 = "위와 같은 범위를 파악해보자";
	String 같은클래스내부에서는_제한자_상관없이_다_접근가능 = "package t가 있고 package s가 있다. 다른 package에서는 public 은 다른 패키지에서 사용 가능";
	String protected는_다른패키지에서_는_다른_패키지_안의_상속된 = "public은 가장 개방적인 권한을 제공한 ㅈ접근 제한자";
	String 실제로실행파일을가지고있는게public이다_여러게의_퍼블릭_클래스를만드려면_별도파일구성 = "예시로는";
	String public_class_donut = "이런식으로된다";
	String 여기보면_도넛 = "클래스가";
	String 다른클래스에서도접근가능하고 = "지금까지 하나의 단일 파일으로 했다면 오늘부터는 여러가지 파일로 해서 임포트도 하고 여러가지 해볼거다..";
	String 다른클래스에서도접근가능하고2 = "지금까지 하나의 단일 파일으로 했다면 오늘부터는 여러가지 파일로 해서 임포트도 하고 여러가지 해볼거다..";
	String 다른클래스에서도접근가능하고3 = "지금까지 하나의 단일 파일으로 했다면 오늘부터는 여러가지 파일로 해서 임포트도 하고 여러가지 해볼거다..";
	String 다른클래스에서도접근가능하고4 = "지금까지 하나의 단일 파일으로 했다면 오늘부터는 여러가지 파일로 해서 임포트도 하고 여러가지 해볼거다..";
	public void show() {
		System.out.println("다른클래스에서도접근가능하고 " + 다른클래스에서도접근가능하고);
		System.out.println("다른클래스에서도접근가능하고 " + 다른클래스에서도접근가능하고);
		System.out.println("다른클래스에서도접근가능하고 " + 다른클래스에서도접근가능하고);
		//왼쪽에서 프로젝트 명이 보이실텐데, src를 보시면 됩니다.
	}
}
class 패키지만들기 {
	String 패키지이름은_sec01 = "두번째꺼는 exam01";
	String package_is_maked = "and show on the eclipse";
	String PublicExample = "이라는 클래스를 만들꺼다.";
	String 메인메소드체크하시고요 = "그렇게해서 만들꺼다. 아래와 주석과 같이 만들어진다.";
	String see = "주석 내용을 자세히 보세요";
	String DonutShop = "도넛숍 클래스를 만듥거에요";
}

/*
package sec01.exam01;

class DonutShop {
	public String shopName = "도넛가게";
	public void openShop() {
		System.out.println(shopName + "열렸다");
		System.out.println(shopName + "닫혔다");
		System.out.println(shopName + "열렸다");
		System.out.println(shopName + "장사가 잘 안된다..");
		System.out.println(shopName + "돈 벌어야 되는데....");
	}
}

public class PublicExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



*/

//위에꺼 아래와 같이 변화
//이름은 DonutShop이라는 클래스로 이름을 바꾸기

/*
package sec01.exam01;

class DonutShop {
	public String shopName = "도넛가게";
	public void openShop() {
		System.out.println(shopName + "열렸다");
		System.out.println(shopName + "닫혔다");
		System.out.println(shopName + "열렸다");
		System.out.println(shopName + "장사가 잘 안된다..");
		System.out.println(shopName + "돈 벌어야 되는데....");
		System.out.println(shopName + "돈 더 벌어야 되는데....");
		System.out.println(shopName + "돈 더 벌고 싶은데 그러면 되는데....");
	}
}


*/


//PublicExample.java

/*
package sec01.exam01;

public class PublicExample {

	public static void main(String[] args) {
		//java study is good for health
		//springboot
		//egov
		//class files
		//itellij
		DonutShop shop = new DonutShop();
		System.out.println(shop.shopName);
		shop.openShop();
		System.out.println("왜 도넛 장사가 잘 안될까요?");
		
	}

}



 */


public class October29 {

	public static void main(String[] args) {
		패키지 pack = new 패키지();
		String str1 = pack.패키지는서로관련된클래스들을;
		System.out.println(str1);
		System.out.println("1번 문제");
		System.out.println("이 코드에서 패키지라는 단어가 몇 번 나왔을가요??????????????");
	}

}
