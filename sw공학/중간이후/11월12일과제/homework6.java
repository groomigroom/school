class Module {
    static void output() {
        System.out.println("응집도가 높은건 뭐냐?");
    }
}

class Module22 {
    static void output() {
        System.out.println("기능적 응집도는 함수적 응집도라고도 하나?");
    }
}

public class GroomiTime {
    public static void main(String[] args) {
        Module.output();
        System.out.println("우연적 응집도는 나쁜 품질인가? --> 이거 정보처리에 나옵니다.");
        Module22.output();
        System.out.println("순차적 응집은 두 요소가 하나의 모듈로 구성된 경우인가?");
    }
}
