package groomis;

public class ForJavaStudy1 {

	public static void main(String[] args) {
		int[] oneintonthegroundandshownow = {1, 2, 3, 4};
		try {
			System.out.println(oneintonthegroundandshownow[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("나가세요");
		}
	}

}
