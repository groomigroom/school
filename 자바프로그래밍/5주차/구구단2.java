package nine17pro1;

public class HardProblem {

	public static void main(String[] args) {
		long a = 0;
		for(int i = 2; i < 1000; i++) {
			for(int j = 1; j < 1000; j++) {
				a += i * j;
			}
		}
		System.out.println(a);
	}

}
