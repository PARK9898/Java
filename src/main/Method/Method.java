package main.Method;

public class Method {
	public static void main(String[] args) {
		// 메소드의 존재 -> 반복의 최소화
		// 메소드의 의미 -> 값을 받고 연산하여 결과값을 반환
		double xx = 3, yy = 4;
		addSubtMultDiv(xx, yy);

		xx = 10; yy = 2;
		addSubtMultDiv(xx, yy);

		xx = 7; yy = 5;
		addSubtMultDiv(xx, yy);
		// 이런식으로 바로바로 생성해서 넣어주는 경우도 많음
		double avg1 = getAverage1(new int[] {3, 5, 4, 13, 7});

		double avg2 = getAverage(3, 91, 14, 27, 4);
	}
	//  ⭐️ 메인 메소드 외부에 선언할 것
	// static -> 정적 메소드에서 호출하려면 붙여야함
	static void addSubtMultDiv (double a, double b) {
		System.out.printf("%f + %f = %f%n", a, b, a + b);
		System.out.printf("%f - %f = %f%n", a, b, a - b);
		System.out.printf("%f * %f = %f%n", a, b, a * b);
		System.out.printf("%f / %f = %f%n", a, b, a / b);
	}

	static double getAverage1 (int[] nums) {

		double sum = 0;
		for (int num : nums) {
			sum += num;
		}

		return sum / nums.length;
	}

	//  자바의 메소드는 하나의 값만 반환 가능
	//  여러 값을 반환하려면 배열 또는 이후 배울 객체를 활용
	static int[] getMaxAndMin (int[] nums) {

		int max = nums[0];
		int min = nums[0];
		for (int num : nums) {
			max = max > num ? max : num;
			min = min < num ? min : num;
		}

		return new int[] {max, min};
	} // 이런식의 코드도 자주 나옴 잘 숙지하기
	//stepover은 메인함수에서 볼 수 있고 step into는 메소드의 내용을 하나하나 볼 수 있다 !!! 중요 디버깅시 사용
	//  💡 ... 연산자 : 해당 위치 뒤로 오는 연산자들을 배열로 묶음
	//  int[] (배열 자체를 받음)과는 다름!
	// 다수인자
	static double getAverage(int... nums) {
		double result = 0.0;
		for (int num : nums) {
			result += num;
		}
		return result / nums.length;
	}

	//  ⭐️ 다른(정해진) 인자들과 사용시 맨 마지막에 놓을 것
	static String descClass (int classNo, String teacher, String... kids) {
		return "%d반의 담임은 %s 선생님, 원생들은 %s 입니다."
			.formatted(classNo, teacher, String.join(", ", kids));
	}

}
