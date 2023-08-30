package main.Type;

public class StringMethod {
	public static void main(String[] args) {
		//문자열 길이
		int int1 = "".length();
		//빈 문자열 여부
		String str2 = " \t\n";
		String str1 = "";

		int int2 = str1.length();
		int int3 = str2.length();
		//문자열 길이가 0인지 여부
		boolean bool1 = str1.isEmpty();
		boolean bool2 = str2.isEmpty();
		//공백을 제외한 문자열의 길이가 0인지
		boolean bool3 = str1.isBlank();
		boolean bool4 = str2.isBlank();

		String str3 = "\t 에 네 르 기 파! \n";
		//trim : 앞뒤의 공백(white space)을 제거 -> 공백 탭 행바꿈
		String str4 = str3.trim();

		String str5 = "얄리 얄리 얄라셩 얄라리 얄라";

		//indexOf/lastIndexOf : 일치하는 첫/마지막 문자열의 위치

		int int6 = str5.indexOf('얄');// 얄이 제일 처음 나오는 위치
		int int7 = str5.indexOf('얄',4); //index 4이후에 언제 처음 나오냐?

		int int8 = str5.indexOf("얄라");
		int int9 = str5.lastIndexOf("얄라");// 얄리가 마지막에 등장한 위치
		int int10 = str5.lastIndexOf("얄라" ,12);

		int int11 = str5.indexOf('욜'); // 포함되어있지 않다면 -1 을 반환해준다

		//포항 여부 확인
		String str_b1 = "옛날에 호랑이 한마리가 살았다";

		boolean bool_b2 = str_b1.contains("호랑이");
		// (주어진 위치에서) 해당 문자열로 시작여부
		boolean boo1_b3 = str_b1.startsWith("옛날에");
		boolean bool_b4 = str_b1.startsWith("호랑이" ,4);
		//해당 문자열로 끝남 여부
		boolean bool_b5 = str_b1.endsWith("살았어요");
		//정규표현식 일치 여부 확인
		String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
		String str_c1 = "yalco@yalco.kr";
		String str_c2 = "yalco.yalco.kr";
		String str_c3 = "yalco@yalco@kr";
		boolean bool_c1 = str_c1.matches(emailRegex);
		boolean bool_c2 = str_c2.matches(emailRegex);
		boolean bool_c3 = str_c3.matches(emailRegex);
		//문자열 비교
		String str_a1 = "ABC";
		String str_a2 = "ABCDE";
		String str_a3 = "ABCDEFG";
		//compareTo : 사전순 비교에 따라 양수 또는 음수 반환
		//같은 문자열이면 0 반환
		int int_a1 = str_a1.compareTo(str_a1);
		//시작하는 부분이 같을 때는 글자 길이의 차이 반환
		int int_a2 = str_a1.compareTo(str_a2);
		int int_a3 = str_a1.compareTo(str_a3);
		int int_a4 = str_a2.compareTo(str_a3);
		int int_a5 = str_a3.compareTo(str_a1);


		String str_a4 = "HIJKLMN";
		//시작 하는 부분이 다를 때는 첫 글자의 정수값 차이 반환
		int int_a6 = str_a1.compareTo(str_a4);
		int int_a7 = str_a4.compareTo(str_a3);

		//대소문자 변환

		String str_a6 = "Hello, World!";
		String str_a7 = str_a1.toUpperCase();
		String str_a8 = str_a1.toLowerCase();

		String str_b4 = "Hi! How are you? I'm fine. Thank you!";
		String str_b2 = "how";
		boolean bool_b10 = str_b1.contains(str_b2); //false 가 뜬다 왜냐하면 대문자와 소문자가 다르다 판별하기 때문
		// ⭐
		boolean bool_b11 = str_b1
			.toUpperCase()
			.contains(str_b2.toUpperCase());
		boolean bool_b12 = str_b1
			.toLowerCase()
			.contains(str_b2.toLowerCase()); // 해결방안 -> 다 소문자나 대문자로 바꿔버리기
	}
}
