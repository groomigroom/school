public class GroomiTime {
    public static void main(String[] args) {
        if (1 == 1) {
            System.out.println("공통 결합은 뭔가?");
            if (2 == 2) {
                System.out.println("내용 결합은 뭔가?");
                if (3 == 3 || 4 == 4) {
                    System.out.println("내용 결합이 가장 바람직하지 않은건가?");
                    if (3 == 2 || 5 == 5) {
                        System.out.println("모듈간에는 꼭 필요한 데이터만 주고 받는게 좋나?");
                        if (3 == '2' || 2 == 2) {
                            System.out.println("결합도 낮게 응집도는 높게 모듈간을 설정하면 좋나?");
                        }
                    }
                }
            }
        }


    }
}
