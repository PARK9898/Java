package main.Type;

public class primitiveType_referenceType {
	public static void main(String[] args) {
		//  🧪 디버깅해서 결과를 볼 것
		//  ⭐ 원시 자료형은 값 자체를 복사 - 별개의 값이 됨

		boolean bool1 = true;
		boolean bool2 = false;
		bool2 = bool1; // 🔴
		bool1 = false;

		int int1 = 1;
		int int2 = 2;
		int2 = int1;
		int2 = 3;

		char ch1 = 'A';
		char ch2 = 'B';
		ch2 = ch1;
		ch1 = '가';

		//  ⭐ 참조 자료형은 값 주머니의 주소를 복사
		//  두 변수가 같은 주머니를 가리키게 됨

		boolean[] boolAry1 = { true, true, true };
		boolean[] boolAry2 = { false, false, false };
		boolAry2 = boolAry1; // 🔴//  T T T로 바뀌게 되겠지
		boolAry1[0] = false;
		// 당연한거임 boolAry2 에 boolAry1 의 주소값을 넣어주었기 때문이다
		int[] intAry1 = { 1, 2, 3 };
		int[] intAry2 = { 4, 5 };
		intAry2 = intAry1;
		intAry2[1] = 100;
		//주소(참조)의 개념으로 봐야한다
		char[] chAry1 = { 'A', 'B', 'C' };
		char[] chAry2 = { 'a', 'b', 'c', 'd', 'e' };
		chAry2 = chAry1;
		chAry1[2] = '다';

		//  ⭐️ 문자열은 객체(참조형)지만 원시형처럼 다뤄짐
		String str1 = "코인 함";
		String str2 = "관심 없음";
		str2 = str1; // 🔴

		str1 = "고점에 익절";

		//  상수 배열의 경우
		final int[] NUMBERS = {1, 2, 3, 4, 5};

		//  ⚠️ 다른 배열을 할당하는 것은 불가 final은 집 주소는 변경 안됨 가구원은 변경 가능
		//NUMBERS = new int[] {2, 3, 4, 5, 6};

		//  ⭐️ 배열의 요소를 바꾸는 것은 가능
		NUMBERS[0] = 11;

		String[] strings = {"한놈", "두시기", "석삼", "너구리"};

		//  💡 join 정적 메소드 - 문자열(정확히는 CharSequence)의 배열을 하나로 이어붙임
		//  첫 번째 인자를 각 사이에 삽입 배열을 문자열로 바꾸어 줌
		String join1 = String.join(", ", strings);
		String join2 = String.join("-", strings);
		String join3 = String.join(" 그리고 ", strings);
		String join4 = String.join("", strings);
	}
}
