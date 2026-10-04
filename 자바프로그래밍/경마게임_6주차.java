package six_java;

public class SixClass3 {

	public static void main(String[] args) throws InterruptedException {
		int[] teuls = new int[7];
		boolean teulUp = true;
		int win = -1;

		while(teulUp) {
			for (int i = 0; i < 7; i++) {
				System.out.println();
			}
			for (int k = 0; k < teuls.length; k++) {
				teuls[k] = teuls[k] + (int)(Math.random()*10);
				for (int m = 0; m < teuls[k]; m++) {
					System.out.print("틀");
				}
				System.out.println(k + ":>");
				if (teuls[k] > 100) {
					win = k;
					teulUp = false;
				}
			}
			Thread.sleep(500); // 말 움직임 보이기
			
		}
		System.out.println("<" + win + "번 teul이 완전히 갖춰져 있습니다.>");
	}

}


Thread.sleep(500);은 현재 실행 중인 스레드를 0.5초(500밀리초) 동안 멈추게 하는 코드이고, InterruptedException은 그 대기 시간 동안 스레드가 다른 곳에서 깨우기 신호(interrupt())를 받을 때 발생하는 예외입니다. [1, 2, 3] 
------------------------------
## 세부 의미

* Thread.sleep(500)
* 스레드를 지정된 시간(500ms) 동안 일시 정지(Blocking) 상태로 만듭니다.
   * CPU를 낭비하지 않고 잠시 대기할 때 사용합니다. [1, 3] 
* InterruptedException
* 잠들어 있는(일시 정지된) 스레드를 강제로 깨우는 interrupt() 메서드가 호출될 때 발생합니다.
   * "기다리는 중 방해받았다"는 뜻의 체크 예외(Checked Exception)이므로, 반드시 try-catch 등으로 예외 처리를 해야 합니다. [2, 3, 4, 5] 

이 코드를 활용하는 스레드 중지(Termination) 예제나 예외 처리 방법이 필요하신가요?

[1] [https://www.quora.com](https://translate.google.com/translate?u=https://www.quora.com/What-is-the-use-of-Thread-sleep-method-in-Java&hl=ko&sl=en&tl=ko&client=sge)
[2] [https://scshim.tistory.com](https://scshim.tistory.com/243)
[3] [https://hbase.tistory.com](https://hbase.tistory.com/233)
[4] [https://hellose7.tistory.com](https://hellose7.tistory.com/152)
[5] [https://m.blog.naver.com](https://m.blog.naver.com/qbxlvnf11/221106055566)

