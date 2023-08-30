package main.Type;

public class DataType {
	public static void main(String[] args) {
		System.out.println(true);
		System.out.println(123);
		System.out.println(1.35);
		System.out.println('A'); //char 형은 작은 따옴표
		System.out.println("hello"); // String 형은 끈 따옴표

		// int a; 선언
		// a = 10; 초기화 초기화를 해주고 사용해주어야한다.
		int a = 0 ,b = 1,c = 2,d = 3;	//이렇게 한번에 초기화 해줌

		byte _1b_byte = 1; // 1바이트 표현 범위 -128 ~ 127
		short _2b_short = 2; // 2바이트 표현 범위 -32768 ~ 32767
		int _4b_int = 3; // 4바이트 표현 범위 큼
		long _8b_long = 4; //8바이트 표현 범위 (범위 엄청 큼)

		//byte overbyte = 129; 범위 넘어가면 바로 오류난다

		_2b_short = _1b_byte; // 묵시적 형변환 큰 자료형에 작은 자료형을 넣을 수 있음
		//_4b_int = _8b_long; 작은 자료형에 큰 자료형을 넣을 수는 없음
		_4b_int = (int)_8b_long; //강제적 형변환 (캐스팅)
		// 4L -> int 보다 큰 수는 L 붙혀서 long에 넣어주면 된다
		// 바이트와 바이트 더한것은 인트로 반환되기 때문에 int로 자바에서 많이 쓴다.
		// 형변환할때 int a = (int)(c+d) 아렇게 괄호를 꼭 쳐줘야함


		int aa = 1 % 2;
		int bb = 2 % 2; // 홀 짝 구분에 많이 사용된다
	}
}

