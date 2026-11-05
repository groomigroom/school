package groomiPackage;

//import school.Student;

class 퍼블릭 {
	//public은 가장 개방적인 접근 권한을 제공하는 접근 제한자
	//main 메서드와 main() 및 public을 포함하는 클래스도 public
	int groomisInt1 = 1;
	int groomisInt2 = 2;
	int groomisInt3 = 2;
	//default는 생략하고 쓰는 접근 제한자이다.
	//클래스 변수 메서드의 접근 제한자 명시 x
	//같은 패키지 안에서만 접근 가능
	//다른 패키지에서는 접근 불가
	void show() {
		//protected 접근 제한자는 같은 패키지 안에서 접근 가능 
		//다른 패키지에서 일반 클래스는 접근 불가인데, 상속된 자식 클래스는 접근 가능
		// extends 이런거 썼을 때,,,
		groomisInt1++;
		//숫자 더하기
		groomisInt1++;
		groomisInt1++;
		groomisInt1++;
		groomisInt1++;
		groomisInt1++;
		groomisInt1++;
		groomisInt1++;
		groomisInt1++;
		groomisInt1++;
		groomisInt1 += groomisInt3;
		System.out.println(groomisInt1);
		for(int i = 0; i < 20; i++) {
			groomisInt1++;
			for (int j = 0; j < 21; j++) {
				groomisInt1++;
				groomisInt1--;
				groomisInt1++;
			}
			groomisInt1--;
			groomisInt1--;
			groomisInt1--;
			int jj = 0;
			int jjj = 1;
			int jjjj = 2;
			float jjjjj = 3.0f;
			float jjjjjj = 3f;
			float jjjjjjj = 33.33f;
		}
	}
}

class groomiIsCute {
	String donut = "도넛";
	String donut2 = "도넛2";
	String donut3 = "도넛3";
	String donut4 = "도넛4";
	String donut5 = "도넛55555555555555";
	String donut6 = "도넛 6   6   6";
	String donut7 = "도넛 6 55  6   6";
	String donut8 = "도넛 6  5 6   6";
	String donut9 = "도넛 6   56   6";
	String donut10 = "도넛 6 5424  6   6";
	String donut11 = "도넛 6  4242 6   6";
	String donut12 = "도넛 6   26   6";
	String donut13 = "도넛 6   6  424242 6";
	String isStringisStringOnShowBlockIsPackage = "package is on java class upside on ground";
	String isStringisStringOnShowBlockIsPackage2 = "package is o55n java class upside on ground";
	String isStringisStringOnShowBlockIsPackage3 = "package is on 55java class upside on ground";
	String isStringisStringOnShowBlockIsPackage4 = "package is on 55java class ups55ide on ground";
	String isStringisStringOnShowBlockIsPackage5 = "package is on java cl4444ass upside on ground";
}
//수업 시간에 만든 클래스
class DonutPriceList {
	protected int netPrice = 900;
	protected void showNetPrice() {
		System.out.println("공급가: " + netPrice + "원");
	}
	protected void showNetPrice2222() {
		System.out.println("공급가: " + (netPrice + netPrice * netPrice) + "원");
	}
}

//private 접근 제한자 가장 강력한 제한을 가짐 캡슐화의 핵심
//같은 패키지 안에서도 접근 불가
//다른 패키지에서도 접근 불가
//클래스 내에서만 사용 가능. -> Getter 및 Setter로 외부에서 접근 가능하게
//해
//줌

//수업 시간에 만든 클래스2
class DonutPriceList2 {
	private int netPrice22 = 9200;
	private void showNetPrice22() {
		System.out.println("공급가: " + netPrice22 + "원");
	}
	protected void showNetPrice2222() {
		System.out.println("공급하는 가격은: " + (netPrice22 + netPrice22 * netPrice22 + netPrice22 - netPrice22 + netPrice22 - netPrice22
				+ netPrice22 - netPrice22) + "원");
	}
}

//Getter와
//Setter가
/*
필요한 이유는
데이터 보호를 위해서 필요하다....
...
...
...
...
...
...
Get은
값을 가져오는 것이고
Set은
값을 초기화 시켜주는 거이다....
 */

class GetterAndSetterShowOnJavaClassRoomOnKeyBoardOnTypingOnOnUpsideSideOfOffOfLandWindWildWorld {
	private int groomisFavoriteIntFirstNumber1 = 1;
	private int groomisFavoriteIntFirstNumber2 = 2;
	private int groomisFavoriteIntFirstNumber3 = 3;
	private int groomisFavoriteIntFirstNumber4 = 4;
	private int groomisFavoriteIntFirstNumber5 = 5;
	private int groomisFavoriteIntFirstNumber6 = 6;
	private int groomisFavoriteIntFirstNumber7 = 7;
	private int groomisFavoriteIntFirstNumber8 = 8;
	private int groomisFavoriteIntFirstNumber9 = 9;
	private int groomisFavoriteIntFirstNumber10 = 10;
	private int groomisFavoriteIntFirstNumber11 = 11;
	private int groomisFavoriteIntFirstNumber12 = 12;
	private int groomisFavoriteIntFirstNumber13 = 13;
	private int groomisFavoriteIntFirstNumber14 = 14;
	private int groomisFavoriteIntFirstNumber15 = 15;
	private int groomisFavoriteIntFirstNumber16 = 16;
	private int groomisFavoriteIntFirstNumber17 = 17;
	private int groomisFavoriteIntFirstNumber18 = 18;
	private int groomisFavoriteIntFirstNumber19 = 19;
	private int groomisFavoriteIntFirstNumber20 = 20;
	private int groomisFavoriteIntFirstNumber21 = 21;
	private int groomisFavoriteIntFirstNumber22 = 22;
	private int groomisFavoriteIntFirstNumber23 = 23;
	private int groomisFavoriteIntFirstNumber24 = 24;
	public GetterAndSetterShowOnJavaClassRoomOnKeyBoardOnTypingOnOnUpsideSideOfOffOfLandWindWildWorld(int groomisFavoriteIntFirstNumber24) {
		this.groomisFavoriteIntFirstNumber24 = groomisFavoriteIntFirstNumber24;
	}
	public int getGroomisFavoriteIntFirstNumber24() {
		return groomisFavoriteIntFirstNumber24;
	}
	public int getGroomisFavoriteIntFirstNumber23() {
		return groomisFavoriteIntFirstNumber23;
	}
	//23번도 가져왔습니다.
	//
	//
	//
	//
	public int getGroomisFavoriteIntFirstNumber22() {
		return groomisFavoriteIntFirstNumber22;
	}
	public int getGroomisFavoriteIntFirstNumber21() {
		return groomisFavoriteIntFirstNumber21;
	}
}

class DonutShowReallyDonut {
	private final String name;
	private int price;
	private int showPriceNumber;
	
	public DonutShowReallyDonut(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if (price >= 0 && price <= 10000) {
			this.price = price;
		} else {
			System.out.println("가격은 0원 이상 10000원 이하만 가능함");
		}
	}
}

/*
//Donut 클래스 파일은 다음과 같습니다.....,.,.,.,.,.,.
package groomiPackage;

public class Donut {
	private final String name;
	private int price;
	
	public Donut(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if (price >= 0 && price <= 10000) {
			this.price = price;
		} else {
			System.out.println("가격은 0원 이상 10000원 이하만 가능함");
		}
	}
}

 */

//#########################################################################################################

//Student.java
/*
package school;

public class Student {
	String school;
	private String studentName;
	private int score;
	private int grade;
	public Student(String studentName, int score, int grade) {
		this.school = "광주 폴리텍 대학교";
		this.studentName = studentName;
		this.score = score;
		this.grade = grade;
	}
	public String getStudentName() {
		return studentName;
	}
	public int getScore() {
		return score;
	}
	public int getGrade() {
		return grade;
	}
	public void setName(String studentName) {
		this.studentName = studentName;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
}

 */
//Main.java
/*
package school;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student("구름이", 100, 1);
		System.out.println("학교: " + stu1.school);
		System.out.println("학생: " + stu1.getStudentName());
		System.out.println("점수: " + stu1.getScore());
		System.out.println("등급: " + stu1.getGrade());
		System.out.println();
		stu1.setName("김구름");
		stu1.setScore(1000);
		stu1.setGrade(0);
		System.out.println("학생: " + stu1.getStudentName());
		System.out.println("점수: " + stu1.getScore());
		System.out.println("등급: " + stu1.getGrade());
	}

}

학교: 광주 폴리텍 대학교
학생: 구름이
점수: 100
등급: 1

*/

class NewSchoolOnTheHighSchoolUniversity {
	private String schoolNameShowBlock;
}

public class GroomiGroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String showString = "on the string";
		DonutPriceList p1 = new DonutPriceList();
		p1.showNetPrice();
		p1.showNetPrice2222();
		DonutPriceList2 p2 = new DonutPriceList2();
		//여기서 p2. 하면 private 된거는 안떠버림...
		p2.showNetPrice2222();
		Donut dDnount = new Donut("매운 도넛");
		dDnount.setPrice(2000);
		System.out.println(dDnount.getName());
		System.out.println(dDnount.getPrice());
		//매운 도넛
		System.out.println(dDnount.getName());
		System.out.println(dDnount.getPrice());
		dDnount.setPrice(-2000);
	}

}



