package main.Method;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str1 = sc.next();
		String str2 = sc.next(); // 잘 안쓰고 nextLine을 많이 쓴다
		String str3 = sc.nextLine();

		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);

		boolean bool = sc.nextBoolean();
		int intNum = sc.nextInt();
		double dblNum = sc.nextDouble();
		// 🧪 기타 next~ 메서드들 확인해 볼 것

		System.out.println("bool: " + bool);
		System.out.println("intNum: " + intNum);
		System.out.println("dblNum: " + dblNum);

		System.out.println("불리언을 입력해주세요.");

		//  💡 다음 입력값이 특정 자료형으로 읽힐 수 있는지 확인
		// 불리언을 계속 입력하면 멈추지 않음 하지만 불리언을 입력하지 않으면 바로 끝난다
		while (sc.hasNextBoolean()) {
			//  💡 대소문자 무관 비교
			System.out.println("입력값: " + sc.nextBoolean());
		}

		//  ⭐ 스캐너의 사용이 끝나면 OS자원을 반환
		//  파일 등으로부터 읽어오는데 사용시 필수
		// 스캐너도 자원을 계속 낭비한다.
		//sc.close();

		System.out.println("정수를 입력해주세요.");
		// 정수를 입력하면 계속 반복된다
		while (sc.hasNextInt()) {
			System.out.println("입력값: " + sc.nextInt());
		}

		System.out.println("단어를 입력해주세요.");
		// quit을 입력하기 전까지 계속 스페이스 구분해서 들어간다
		while (sc.hasNext()) {
			String nextWord = sc.next();
			if (nextWord.equalsIgnoreCase("quit")) break;
			System.out.println("입력값: " + nextWord);
		}

		System.out.println("문장을 입력해주세요.");
		//quit을 입력하기 전까지 계속 엔터를 기준으로 String으로 들어간다
		while (sc.hasNextLine()) {
			String nextSentence = sc.nextLine();
			if (nextSentence.equalsIgnoreCase("quit")) break;
			System.out.println("입력값: " + nextSentence);
		}

		sc.close();
	}


}
