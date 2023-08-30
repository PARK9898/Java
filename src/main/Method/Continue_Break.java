package main.Method;

public class Continue_Break {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {

			//  💡 continue : 한 루프만 건너뜀
			if (i % 3 == 0) continue;

			//  💡 break : 블록 전체를 종료
			if (i == 10) break;

			System.out.println(i);
		}
		System.out.println("\n- - - - -\n");

		String str = "호";

		//  ⭐️ 무한루프 탈출에 사용 가능
		for (;;) { // 다음 강의 while을 더 많이 사용
			str += "롤";
			System.out.println(str);
			if (str.length() == 100) break;
		}

		str += "로";
		System.out.println(str);

		System.out.println("\n- - - - -\n");

		//  💡 label : 중첩 루프에서 어느쪽을 continue, break 할 지 구분
		outer:
		for (int i = 0; i < 10; i++) {

			inner:
			for (int j = 0; j < 10; j++) {
				if (j % 2 == 0) continue inner;
				if (i * j >= 30) continue outer;

				if (j > 8) break inner;
				if (i - j > 7) break outer;

				System.out.printf("i: %d, j: %d%n", i, j);
			}
		} // 바깥거를 continue할지 안쪽것을 break할지 정한다
	}
}
