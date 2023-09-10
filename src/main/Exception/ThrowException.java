package main.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowException {
	public static void main(String[] args) {
		//  ⭐️ 예외가 오류가 던져지면 그 아래의 코드는 작성할 수 없음
		//throw new RuntimeException();
		// 밑에 아무것도 작성할 수 없음
		//  💡 메시지를 특정하여 던지기
		//throw new RuntimeException("뭔가 잘못됐어요!");

		//  💡 원인이 되는 다른 예외들을 명시하여 던지기
		// throw new RuntimeException("얘네 때문임",
		//         new IOException(
		//                 new NullPointerException()
		//        )
		// );

		registerDutyMonth("정핫훈", 7);

		registerDutyMonth("김돌준", 13);
		//  ⭐️ try 문으로 감싸지 않았음
		//  - 다음 코드들이 실행되려면 주석처리해야 함



	}

	public static void registerDutyMonth (String name, int month) {
		if (month < 1 || month > 12) {
			throw new IndexOutOfBoundsException(
				"우리 %s씨는 1년에 몇 달이 있는지 아직 못 배웠나봐?"
					.formatted(name)
			);
		}
		System.out.printf("%s씨 %d월 담당으로 배정되셨어요.%n", name, month);
	}

	public static void openMyFile (String fileName) {
		if (fileName.contains("야구동영상")) {
			//  💡 try 문으로 감싸야 컴파일되는 예외
			try {
				throw new FileNotFoundException(
					"제 컴퓨터엔 그런 거 없어요."
				);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println("👨‍🏫 인강 프로그램을 실행합니다...");
			}
			return;
		}
		System.out.printf("%s 파일 열람%n", fileName);
	}
}
