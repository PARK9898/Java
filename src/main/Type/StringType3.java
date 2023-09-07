package main.Type;

public class StringType3 {
	public static void main(String[] args) {
		int iNtNum = 123;
		float fltNum = 3.14f;
		char character = '가';
		boolean bool = true;

		String str_d1 = " 자, 이어붙여볼까요?";
		//문자열에 다른 자료형을 더하면 문자열로 이어붙여짐
		String str_d2 = str_d1 + iNtNum + fltNum + bool + character;

		System.out.println(str_d2);
		//int -> string valueOf()
		String str1 = String.valueOf(true); // 여기 들어있는 값 자체를 문자열로 바꿔서 넣어준다
		String str2 = String.valueOf(false);
		String str3 = String.valueOf(123);
		String str4 = String.valueOf(3.14f);
		String str5 = String.valueOf('가');
		String str6 = true + "";
		String str7 = 123.45 + "";


		String str123 = "123";
		// 문자열을 다른 자료형으로 변환
		short srtNum = Short.parseShort(str123);
		int intNum = Integer.parseInt(str123);
		long lngNum = Long.parseLong(str123);
		// 대소문자 구분없이 true일때만 true 반환헤준다
		boolean bool1 = Boolean.parseBoolean("TRUE");
		boolean bool2 = Boolean.parseBoolean("true");
		boolean bool3 = Boolean.parseBoolean("T");

		char a = str123.charAt(0);

		//byte bytNum2 = Byte.parseByte("12345");
		//int intNum2 = Integer.parseInt("123.45");
		//double dblNum2 = Integer.parseInt(" "); -> 런타임 오류임

		// 런타임오류 -> 실행했을경우 일어나는 에러 컴파일러가 걸러내지 못하는 에러
	}
}
