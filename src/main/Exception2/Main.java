package main.Exception2;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Map<String, Integer> dutyRegMap = new HashMap<>();
		dutyRegMap.put("정핫훈", 7);
		dutyRegMap.put("김돌준", 13);

		dutyRegMap.forEach((name, month) -> {

			//  💡 실행부에서, 혹은 또 이를 호출한 외부에서 처리해주어야 함
			try {
				registerDutyMonth(name, month); // 오류가 발생하는 코드이기 떄문에 try문안에
			} catch (WrongMonthException we) {
				we.printStackTrace();
				System.out.printf("%s씨 에어팟 빼봐요.%n", name);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	//  💡 RuntimeException 과 그 자손들 : unchecked 예외
	//  - 주로 개발자의 실수로 일어나는 예외 (실수 안 하면 됨)
	//  - 예외처리가 필수가 아님 (하지 않아도 컴파일 가능)
	public static void maybeException1 () {
		if (new Random().nextBoolean()) {
			throw new RuntimeException();
		}
	}
	//  ⚠️ 다른 예외들은 checked 예외
	//  - 해당 메소드 내에서, 또는 호출한 곳에서 예외처리 필수
	//  - 외적 요인으로 발생하는 예외 (조심해도 소용없으므로 대비해야 함)
	//  - ⭐️ IDE의 안내에 따라 두 가지 옵션 실행해보기'
	// 예외를 자기가 직접 처리하지 않았음 밖으로 던음음
	public static void maybeException2 () throws FileNotFoundException {
		if (new Random().nextBoolean()) {
			throw new FileNotFoundException(); //
		}
	}

	//  💡 예외를 던질 가능성이 있지만 스스로 처리하지는 않는 메소드
	public static void registerDutyMonth (String name, int month) throws WrongMonthException {
		if (month < 1 || month > 12) {
			throw new WrongMonthException("하... 직원 교육 좀 시켜서 보내세요.");
		}
		System.out.printf("%s씨 %d월 담당으로 배정되셨어요.%n", name, month);
	}

	//  💡 일단 자기 선에서도 처리하고 외부로도 던지는 메소드
	//  - 필요한 일은 하되, 정상적으로 진행된 것은 아님을 호출부에 알리기 위함
	//  - 예외를 양쪽에서 처리해줄 필요가 있을 때
	public static void registerDutyMonthSafer (String name, int month) throws WrongMonthException {
		try {
			if (month < 1 || month > 12) {
				throw new WrongMonthException(
					"ㅎㅎ 저희가 일단 아무 달에 배정은 할게요."
				); // 오류가 발생하면 일단 던져서 자기가 받는다
			}
			System.out.printf("%s씨 %d월 담당으로 배정되셨어요.%n", name, month);
		} catch (WrongMonthException we) {
			System.out.printf(
				"%s씨 %d월 담당으로 배정되셨어요.%n", // 받아서 처리하고
				name, new Random().nextInt(1, 12 + 1)
			);
			throw we; // 다시 외부에 보내줌으로써 오류가 있었다고 외부에 알려준다
		}
	}
}
