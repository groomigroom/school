package groomis;

class Student {
	static String school = "한국광주통합특별시폴리텍대학교";
	String name;
	Student (String name) {
		this.name = name;
	}
}

public class MainTest {

	public static void main(String[] args) {
		Student s1 = new Student("윤서연");
		Student s2 = new Student("정혜린");
		System.out.println(s1.school);
		System.out.println(s2.school);
		System.out.println(Student.school);
		//왜 이렇게 출력되는가?
	}

}
