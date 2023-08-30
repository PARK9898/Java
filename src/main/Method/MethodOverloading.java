package main.Method;

public class MethodOverloading {
	public static void main(String[] args) {
		int res1 = add(1, 2); // 🔴 스텝인투로 들어가 볼 것
		int res2 = add(3, 4, 5);
		double res3 = add(1.2, 3.4);
		String res4 = add("로보트 태권", 'V');
		String res5 = add('X', "Men");

		int intNum = 3;
		modifyIntArg(intNum);

		int[] intNums = {1, 2, 3};

		//  배열은 참조형이지만 그 안의 값들은 원시형
		modifyIntArg(intNums[0]);

		//  참조형인 배열 자체를 인자로 사용
		modifyAryElem(intNums);
	}
	static int add(int a, int b) { return a + b; }

	//  매개변수의 개수가 다름
	static int add(int a, int b, int c) { return a + b + c; }

	//  매개변수의 자료형이 다름
	static double add(double a, double b) { return a + b; }

	//  매개변수의 자료형 순서가 다름
	static String add(String a, char b) { return a + b; }
	static String add(char a, String b) { return a + b; }

	//  ⚠️ 반환 자료형이 다른 것은 오버로딩 안 됨 - 다른 함수명 사용
	//  static double add(int a, int b) { return (double) (a + b); }

	//  ⭐️ 원시값은 '복사해서' 가져옴
	//  메소드 내부에서 값을 변경해도 원본에 영향 끼치지 않음
	static void modifyIntArg (int num) {
		System.out.printf("수정 전: %d%n", num++);
		System.out.printf("수정 후: %d%n", num);
	}

	//  ⭐️ 참조값은 주소값이므로 원본 그 자체를 가리킴
	// 함수에서 변경한것이라도 참조형이기 때문에 주소가 복사되는것이기 때문에 값이 변경된다
	// 메소드내에서는 값을 변경하지 않는게 안전하다
	static  void modifyAryElem (int[] ary) {
		System.out.printf("수정 전: %d%n", ary[1]++);
		System.out.printf("수정 후: %d%n", ary[1]);
	}
	//재귀함수
	// 한 번 실행할때마다 메모리에 계속 남아있기 때문에 메모리 낭비가 엄청 심하다
	static void upTo5 (int start) {
		System.out.println(start);
		if (start < 5) {
			upTo5(++start);
		} else {
			System.out.println("-- 종료 --");
		}
	}
	//꼬리재귀
	static int factorial (int num) {
		return num == 0 ? 1 : num * factorial(--num);
	}
}

