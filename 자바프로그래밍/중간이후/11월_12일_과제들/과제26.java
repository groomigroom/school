package groomis;

class Student {
	static String school = "한국광주통합특별시폴리텍대학교";
	String name;
	Student (String name) {
		this.name = name;
	}
}
class Studentt {
	static String school = "한국광주통합특별시폴리텍대학교s";
	String name;
	Studentt (String name) {
		this.name = name;
	}
}
class Studentte {
	static String school = "한국광주통합특별시폴리텍대학교e";
	String name;
	Studentte (String name) {
		this.name = name;
	}
}
class stotic {
	static String schoooooollll = "schoooolllllllell";
	static String schoooooollel = "schoooolllllleelell";
	static String schoooooolell = "schoooolllleelllell";
	static String schooeooollll = "schoooolleeelllllell";
}

class Counter {
	static int count = 0;
	Counter() {
		count++;
	}
}

public class MainTest {

	public static void main(String[] args) {
		System.out.println(stotic.schooeooollll);
		new Counter();
		new Counter();
		new Counter();
		System.out.println(Counter.count);
		//출력값이 이런 이유??????????
	}

}
