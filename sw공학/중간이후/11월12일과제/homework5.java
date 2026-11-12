class Module {
    static void output() {
        System.out.println("모듈화를 통해서 효율성이 증가가 되나?");
    }
}

public class GroomiTime {
    public static void main(String[] args) {
        System.out.println("모듈 간 관계 중에 호출 관계는 모듈 A가 모듈 B를 호출하는 관계인가?");
        Module.output();
    }
}
