import java.util.Random;
import java.util.Scanner;

public class ChocolateJarMain {

	private static int turn = 0;

	public static void main(String[] args) {
		BoxImpl box = BoxImpl.getInstance();
		Scanner input = new Scanner(System.in);

		while (!box.isEmpty()) {
			System.out.println("------" + (turn+1) + " 째 턴 -------");

			// 유저가 뽑는 차례
			System.out.println("몇개를 뽑을까요? (1~3)");
			int size = input.nextInt();
			input.nextLine();
			if(size <= 0 || size > 3) {
				System.out.println("1~3 사이의 숫자를 입력하세요.");
				continue;
			} else {
				if(box.takeItem(size)) {
					System.out.println("플레이어의 패배");
					break;
				} else System.out.println("플레이어가 " + size + "개의 초콜릿을 꺼냈습니다.");
			}
			box.status(); // 현재 상황을 출력

			// 컴퓨터가 뽑는 차례
			Random random = new Random();
			int size_com = random.nextInt(3) + 1;
			if(box.takeItem(size_com)) {
				System.out.println("컴퓨터의 패배");
				break;
			} else System.out.println("컴퓨터가 " + size_com + "개의 초콜릿을 꺼냈습니다.");
			box.status(); // 현재 상황을 출력

			// 턴 수의 증가
			turn++;
		}
	}
}
