class Module {
    static void output() {
        System.out.println("높은 응집도와 낮은 결합도가 중요한가?");
    }
}

class Module22 {
    static void output() {
        System.out.println("절차적 응집은 순서가 정해진 몇개의 구성 요소가 하나의 모듈로 구성된 경우인가?");
    }
}

public class GroomiTime {
    public static void main(String[] args) {
        System.out.println("교환적 응집도는 정보적 응집도라고도 하나?");
        Module.output();
        Module22.output();
    }
}
