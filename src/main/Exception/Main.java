package main.Exception;

import java.util.stream.IntStream;

import main.Collection.Knight;
import main.Collection.Swordman;
import main.classStudy.Generic1.Side;

public class Main {
	public static void main(String[] args) {
		//  ⭐️ 아래의 클래스들을 살펴보고 상속구조를 확인해 볼 것
		//  java.lang 패키지의 다른 에러, 예외 클래스들도 둘러볼 것

		Throwable throwable;
		Error error;
		Exception exception;
		OutOfMemoryError outOfMemoryError;
		StackOverflowError stackOverflowError;
		RuntimeException runtimeException;
		IndexOutOfBoundsException indexOutOfBoundsException;

		int[] ints = {1, 2, 3};
		// System.out.println(ints[3]); // ⚠️ 런타임 예외 발생
		// System.out.println("예외를 방지하지 않았을 때");

		try {
			// ⭐️ 예외가 일어날 여지가 있는 코드를 try 블록에 작성
			System.out.println(ints[3]);
		} catch (Exception e) {
			String errMsg = e.getMessage();
			e.printStackTrace(); // 🔴 해당 오류의 정보를 출력하도록 한다 빨간줄 찍 그이는거
		}
		System.out.println("예외를 try문으로 감쌌을 때 1"); // try문 안에 있으면 프로그램이 종료되지는 않음

		try {
			System.out.println(((String) null).length());
		} catch (Exception e) {
			String errMsg = e.getMessage();
			//e.printStackTrace(); // 🔴
		}
		System.out.println("예외를 try문으로 감쌌을 때 2");

		IntStream.rangeClosed(0, 4)
			.forEach(Main::tryThings1);

		System.out.println("\n- - - - -\n");

		IntStream.rangeClosed(0, 4)
			.forEach(Main::tryThings2);

		System.out.println("\n- - - - -\n");

		IntStream.rangeClosed(0, 4)
			.forEach(Main::tryThings3);
	}

	public static void tryThings1 (int i) {
		try {
			switch (i) {
				//  💡 예외가 발생하면 바로 실행을 멈추고 catch 문으로 감
				//  - 아래 케이스들은 각각 예외가 발생하므로 break 넣지 않았음
				case 1: System.out.println((new int[1])[1]);
				case 2: System.out.println("abc".charAt(3));
				case 3: System.out.println((Knight) new Swordman(Side.RED));
				case 4: System.out.println(((String) null).length());
			}

			//  ⭐️ 아래의 코드는 예외가 발생하면 실행되지 않음
			System.out.printf("%d: 🎉 예외 없이 정상실행됨%n", i);

		} catch (Exception e) {

			//  💡 예외 발생시에만 실행되는 블록
			System.out.printf(
				"%d: 🛑 [ %s ] %s%n", i, e.getClass(), e.getMessage()
			);
			e.printStackTrace();
		}
	}

	public static void tryThings2 (int i) {
		try {
			switch (i) {
				case 1: System.out.println((new int[1])[1]);
				case 2: System.out.println("abc".charAt(3));
				case 3: System.out.println((Knight) new Swordman(Side.RED));
				case 4: System.out.println(((String) null).length());
			}
			System.out.printf("%d: 🎉 예외 없이 정상실행됨%n", i);

			//  💡 오류의 타입마다 다른 처리를 하고자 할 때
			//  ⭐️ 위에서 처리한 종류에 속하는 오류를 아래에 넣으면 컴파일 에러
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.printf("%d : 🍡 배열의 크기를 벗어남%n", i);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.printf("%d : 🔤 문자열의 길이를 벗어남%n", i);
		} catch (ClassCastException e) {
			System.out.printf("%d : 🎭 해당 클래스로 변환 불가%n", i);
		} catch (Exception e) {
			//  💡 위에서 처리되지 못한 모든 타입의 오류
			//  ⭐️ 가장 아래에 있어야 함
			System.out.printf("%d : 🛑 기타 다른 오류%n", i);
		}
	}

	public static void tryThings3 (int i) {
		try {
			switch (i) {
				case 1: System.out.println((new int[1])[1]);
				case 2: System.out.println("abc".charAt(3));
				case 3: System.out.println((Knight) new Swordman(Side.RED));
				case 4: System.out.println(((String) null).length());
			}
			System.out.printf("%d: 🎉 예외 없이 정상실행됨%n", i);

		} catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
			//  💡 둘 이상의 예외 타입들에 동일하게 대응할 때 이거 괜찮은 방법인것 같다...!
			System.out.printf("%d : 🤮 범위를 벗어남%n", i);
		} catch (ClassCastException e) {
			System.out.printf("%d : 🎭 해당 클래스로 변환 불가%n", i);
		} catch (Exception e) {
			System.out.printf("%d : 🛑 기타 다른 오류%n", i);
		}
	}

	public static void withFinally1 (boolean makeException) {
		try {
			if (makeException) System.out.println("".charAt(0));
			System.out.println("🎉 예외 없이 정상실행됨");
		} catch (Exception e) {
			System.out.println("🛑 예외 발생"); //catch에 걸리던 말던 finally는 무조건 실행해준다
		} finally { // 오류가 발생하든 말든 무조건 실행해주는것 데이터베이스 열어 작업한 후 무조건 닫아줘야한다!
			System.out.println("🏁 무조건 실행");
		}

		//  ❓ 그냥 try 문 밖에 적으면 안 될까?
		System.out.println("🏁 이렇게 말이지.");
	}

	public static char withFinally2 (int index) {
		String str = "Hello";
		try {
			char result = str.charAt(index);
			System.out.println("🎉 예외 없이 정상실행됨");
			return result;
		} catch (Exception e) {
			System.out.println("🛑 예외 발생");
			return '!';
		} finally {
			//  ⭐️ 위에서 return이 발생하더라도 이건 하고 넘어감 !! 위에 문제를 해결한것 그냥 try문 밖에 작성하면 안되나? 하는것을 여기서 해결
			System.out.println("🏁 무조건 실행");
		}

		//  💡 try, catch 블록에 모두 return이 있으므로
		//  이 부분은 작성될 수 없음
		//  System.out.println("🏁 이렇게 말이지.");
	}
}
