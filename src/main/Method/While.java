package main.Method;

public class While {
	public static void main(String[] args) {
		int i = 0;

		//  💡 while 문의 괄호에는 종료조건만
		while (i < 10) {
			// 종료조건 충족을 위한 값 변화는 외적으로
			System.out.println(i++);
		}
		int j = 1;

		//  보다 가독성을 높이고 의도를 잘 드러낸 코드
		while (true) {
			int cur = j++;

			if (cur == 100) break;
			if (cur % 3 != 0) continue;

			System.out.println(cur);

		}

		int enemies = 0;

		System.out.println("일단 사격");

		do {
			System.out.println("탕");
			if (enemies > 0) enemies--;
		} while (enemies > 0); // 일단 한 번 실행하고 while 뒤쪽에 조건이 만족할때까지 계속 실행

		System.out.println("사격중지 아군이다");
	}
}

