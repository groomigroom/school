package nine17pro1;

import java.util.*;

public class SwitchCase1 {

	public static void main(String[] args) {
		System.out.print("가위(0), 바위(1), 보(2) 중에 하나를 선택하시오");
		Scanner sc = new Scanner(System.in);
		int youint = sc.nextInt();
		int comint = (int)(Math.random() * 3);
		switch(youint) {
		case 0:
			switch(comint) {
			case 0:
				System.out.println("너: 가위, 나: 가위, 비김. 접으시는게 나을듯...");
				break;
			case 1:
				System.out.println("너: 가위, 나: 바위, 짐. 접으시는게 나을듯...");
				break;
			case 2:
				System.out.println("너: 가위, 나: 보, 이김. 왠일로 이겼네요 ㅋㅋㅋㅋ...");
				break;
			}
			break;
		case 1:
			switch(comint) {
			case 0:
				System.out.println("너: 바위, 나: 가위, 이김. 왠일로 이겼네요 ㅋㅋㅋㅋ...");
				break;
			case 1:
				System.out.println("너: 바위, 나: 바위, 비김. 접으시는게 나을듯...");
				break;
			case 2:
				System.out.println("너: 바위, 나: 보, 짐. 접으시는게 나을듯...");
				break;
			}
			break;
		case 2:
			switch(comint) {
			case 0:
				System.out.println("너: 보, 나: 가위, 짐. 접으시는게 나을듯...");
				break;
			case 1:
				System.out.println("너: 보, 나: 바위, 이김. 왠일로 이겼네요 ㅋㅋㅋㅋ...");
				break;
			case 2:
				System.out.println("너: 보, 나: 보, 비김. 접으시는게 나을듯...");
				break;
			}
			break;
		}
		sc.close();
	}

}
