package main.Type;

public class ArrayType {
	public static void main(String[] args) {
		// 지정된 자료형과 개수만큼 메모리 공간을 나란히 확보
		//  💡 사용할 자료형 뒤에 []를 붙여 선언
		char[] yutnori = {'도', '개', '걸', '윷', '모'};

		//  💡 length : 배열의 길이 반환
		int length = yutnori.length;

		//  💡 [] 안에 인덱스 정수를 넣어 접근
		//  ⭐ 0부터 시작
		char first = yutnori[0];
		char last = yutnori[yutnori.length - 1];

		//  💡 초기화하지 않고 일단 선언하기
		//  ⭐ 어떤 값으로 초기화되는지 확인
		// false로 초기화
		boolean[] boolAry = new boolean[3];
		// 0으로 초기화
		int[] intAry = new int[3];
		//0.0으로 초기화
		double[] dblAry = new double[3];
		//0으로 초기화
		char[] chrAry = new char[3];
		// 아래 확인
		String[] strAry = new String[3];
		//String 은 null로 초기화
		//  아스키 코드의 0번 글자. 문자열의 끝을 표시하는데 사용
		char NUL = chrAry[0];

		//  다음과 같이 원하는 위치의 값 변경
		intAry[0] = 123;
		intAry[1] = 456;
		intAry[2] = 789;

		//💡 문자열의 경우: 각 문자열이 저장된 주소값을 담음

		//  초기화 블록을 사용한 선언 동시 초기화
		//  두 가지 방법 사용 가능
		char[] dirAry1 = {'동', '서', '남', '북'};
		char[] dirAry2 = new char [] {'동', '서', '남', '북'};

		char[] dirAry3;

		//  선언만 먼저 한 상태에서는 두 번째 방법만 가능
		//	dirAry3 = {'동', '서', '남', '북'}; // ⚠️ 불가
		dirAry3 = new char[] {'동', '서', '남', '북'};
		int [] intAry1 = {1, 2, 3, 4, 5};

		//  ⚠️ 런다임 에러: ArrayIndexOutOfBoundsException
		int outOfAry = intAry[intAry.length]; // 길이가 더 차이남 1만큼 더 큼 실수 x
	}
}
