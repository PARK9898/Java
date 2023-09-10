package main.Exception2;

import java.util.stream.IntStream;

public class Main2 {
	public static void main(String[] args) {
		IntStream.rangeClosed(0, 4)
			.forEach(Main2::ceo);
	}

	//  💡 IDE의 안내에 따라 직접 작성해 볼 것
	public static void sawon (int i) throws XLargeException, LargeException, MediumException {
		try {
			switch (i) {
				case 1: throw new SmallException();
				case 2: throw new MediumException();
				case 3: throw new LargeException();
				case 4: throw new XLargeException();
				default:
					System.out.println("저 가 봐도 되죠?");
			}
		} catch (SmallException se) {
			System.out.println(se.getMessage() + ": 저 이건 알아요!");
		} catch (Exception e) { // 작은것들은 자기가 처리하고 그 외 나머지것들은 예외를 던져버린다
			throw e;
		}
	}

	public static void daeri (int i) throws XLargeException, LargeException {
		try {
			sawon(i);
		} catch (MediumException me) {
			System.out.println(me.getMessage() + ": 내가 처리할 테니 가 봐요.");
		} catch (Exception e) {
			throw e;
		}
	}

	public static void bujang (int i) throws XLargeException {
		try {
			daeri(i);
		} catch (LargeException le) {
			System.out.println(le.getMessage() + ": 잘 하자. 응?");
		} catch (Exception e) {
			throw e;
		}
	}

	public static void ceo (int i) {
		try {
			bujang(i);
		} catch (XLargeException xe) {
			System.out.println(xe.getMessage() + ": 전원 집합");
		}
		System.out.println("\n- - - - -\n");
	}

	public static void chooseDutyMonth (String name, int index) throws WrongMonthException {
		int[] availables = {1, 3, 4, 7, 9, 12};

		try {
			int month = availables[index - 1];
			System.out.printf("%s씨 %d월 담당으로 배정되셨어요.%n", name, month);
		} catch (ArrayIndexOutOfBoundsException ae) {
			WrongMonthException we = new WrongMonthException(
				"%d번은 없어요.".formatted(index)
			);

			//  💡 예외의 원인이 되는 예외를 지정 (이를 수행하는 생성자가 없을 경우)
			we.initCause(ae);
			//  이 예외는 cause를 입력받는 생성자를 지정해놓았음
			//  - IDE의 안내를 따라 바꿔 볼 것

			//  ⭐️ 다른 종류의 예외가 발생해도 이 예외의 원인으로 등록해서
			//  통일된 타입(WrongMonthException)의 예외로 반환 가능

			throw we;
		}
	}
}
