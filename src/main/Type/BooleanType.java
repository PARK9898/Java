
package main.Type;

public class BooleanType {
	public static void main(String[] args) {
		boolean boll1 = true;
		boolean boll2 = false;

		boolean bool7 = !(1 > 2);
		boolean bool8 = !((5 / 2) == 2.5);
		boolean bool9 = !((3f + 4.0 == 7) != ('A' < 'B'));
		int num = 4;
		// &&가 ||보다 우선순위가 높다
		boolean boolB = (num % 3 == 0) && ((num % 2 == 0) || (num > 0)) && (num > 10);

		//단축평가 (중요)
		//&&: 앞의것이 false면 뒤의 것을 평가할 필요가 없음
		//|| 앞의것이 true면 뒤의것을 평가할 필요 없음
		// 평가는 곧 실행
		// 연산 부하가 적은 코드를 앞에 - 리소스 절약
		int a = 1, b = 2, c = 0, d = 0, e = 0, f = 0;
		boolean bool1 = a < b && c++ < (d += 3);
		boolean bool2 = a < b || e++ < (f += 3); // 뒤의 것은 수행 자체를 안함 앞에 true 가 들어왔기 떄문이다
		boolean bool3 = a > b && c++ < (d += 3); // boolean bool4 = a > b || e++ < (f += 3);

		//삼항 연산자
		// a ? b : c
		// a -> 불리언 값
		// b -> a 가 true일때 반환될 값
		// c -> a 가 false일 때 반환될 값

		int num1 = 3, num2 = 4;
		char num1OE = num1 % 2 == 1 ? '홀' : '짝';
		char num2OE = num2 % 2 == 1 ? '홀' : '짝';

		//
		boolean mult2 = true;
		//mult2 = false;

		boolean plus5 = true;
		//plus5 = false;

		System.out.println(
			(!mult2 && !plus5) ? num
				: (mult2 && plus5) ? num * 2 + 5
				: mult2 ? num * 2
				: num + 5 // 제일 처음에 false여서 num 바로 뒤에 전체가 반환되고 계속 이어나간다 생각하면 된다
		);
	}
}
