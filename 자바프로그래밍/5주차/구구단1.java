package nine17pro1;

public class HardProblem {

	public static void main(String[] args) {
		for(int i = 2; i < 1000; i++) {
			System.out.println(i+"단이다.");
			for(int j = 1; j < 10; j++) {
				System.out.println(i+" * "+j+" = "+(i*j)+"이다.");
			}
		}
	}

}
