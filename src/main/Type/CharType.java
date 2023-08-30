package main.Type;

public class CharType {

	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 'B';
		char ch3 = 'a';
		char ch4 = 'a' + 1; // 이렇게 더할 수 있음 char로 안바꿔줘도 됨 캐스팅 필요 x
		char ch5 = ' ';
		int ch1Int = (int)ch1;
		int ch3Int = ch3; // 오류 안난다 표현 방식을 달리한 정수라 봐도 크게 무리가 없다 묵시적 형변환 가능

		char ch10 = 'A';
		char ch11 = 65; // 둘 다 똑같은 방식이다

		char ch_a2 = 'A' + 2;
		//char ch_a3 = ch_a2 + 1; //불가능함  문자 변수에다가 더하면 안들어감
		char ch_b1 = '1'; // 이거는 정수 1이 아니라 정수 49 이다
		char ch_b3 = '1' + '2';// 99가 들어가게 된다

		//위에 것을 실행히고 싶으면
		int int_a1 = Character.getNumericValue('1'); //이렇게 넣으면 진짜 1이 뽑힌다

		int int_a2 = '1' - '0'; //해당 문자만큼 뽑힘 왜냐면 아스키 코드가 0부터 차례대로 시작하기 떄문에 차이를 확인하면 그 수를 확인할 수 있음

		//char a = ''; //불가능 한다 string a ="" 문자열로는 가능하다
		char z = ' '; // 스페이스도 문자로 취급한다
		// -> 그래서 == 이나 > 이런것을 사용할 수 있는것임 정수취급을 받기 때문에 하지만 스트링은 안되는것은 당연한것임
		boolean bool1 = 'A' == 'A';
		boolean bool2 = 'A' == '가';

		// 숫자를 비교할 시 해당 정수값을 기준으로
		boolean bool3 = 'A' == 65;
		boolean bool4 = 'A' > 64.0;
		boolean bool5 = 'A' > 66f;
		//사전순 상 먼저오는 것이 작다
		boolean bool6 = 'A' < 'B';
	}
}

