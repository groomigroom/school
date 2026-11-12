package groomis; 

public class ForJavaStudy1 { 
    public static void main(String[] args) { 
        String[] oneintonthegroundandshownow = { "구름이", "멍멍", "멍멍멍", "구름이2" }; 
        
        try {
            // Integer.parseInt()를 사용해 문자열을 숫자로 변환 시도
            int iiii = Integer.parseInt(oneintonthegroundandshownow[1]); 
            System.out.println("변환된 숫자: " + iiii);
        } catch (NumberFormatException e) { 
            // 숫자가 아닌 문자열("멍멍")일 경우 여기로 빠짐
            System.out.println("문자열 숫자로 변환 불가"); 
        } catch (ArrayIndexOutOfBoundsException e) {
            // 배열 범위를 벗어났을 경우
            System.out.println("배열 인덱스 초과");
        }
    } 
}
//이 내용에 대해서 자세히 서술하시오.
