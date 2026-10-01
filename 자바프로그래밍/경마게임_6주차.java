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
					System.out.print("말");
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
